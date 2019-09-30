package io.weather.actions;

import io.restassured.response.Response;
import io.weather.models.Forecast;
import io.weather.models.Result;
import io.weather.utils.Constants;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import java.util.*;

public class ForecastActions {

    static public Response response;
    public Forecast forecast;

    @Step
    public static void requestForecastWithGet() throws Exception {


        response = SerenityRest
                .get(Constants.FORECAST_ENDPOINTS);

        //response.get
        System.out.println("Response ----> " + response);
        List<Map<String, String>> responseDataList = response.jsonPath().getList("data");
        System.out.println(" Response Data list :: " + responseDataList);
        String timestamp_utc = responseDataList.get(0).get("datetime");

        // List to retrieve 'weather' object from responseDataList
        ArrayList<Object> weather = new ArrayList<>();
        weather.add(responseDataList.get(0).get("weather"));
        System.out.println(" state_code :: state_code ---> " + timestamp_utc);
    }

    @Step
    public int getStatusCode() throws Exception {
        return response.then().extract().statusCode();
    }

    @Step
    public String getContentType() throws Exception {
        return response.then().extract().contentType();
    }


    @Step
    public List<Result> getResultNode() throws Exception {
        return forecast.getResults();
    }

    @Step
    public String getResultStatus() throws Exception {
        return forecast.getStatus();
    }


}
