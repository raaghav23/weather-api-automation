package io.weather.actions;

import io.weather.models.Result;
import io.weather.models.Weather;
import io.weather.utils.Constants;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

public class WeatherBitActions {

    static public Response response;
    public Weather weather;

    @Step
    public void requestWeatherWithGet() throws Exception {


        response = SerenityRest
                .get(Constants.WEATHER_ENDPOINTS);

        //response.get
        System.out.println("Response ----> " + response);
        List<Map<String, String>> responseDataList = response.jsonPath().getList("data");
        System.out.println(" Response Data list :: " + responseDataList);
        String state_code = responseDataList.get(0).get("state_code");
        System.out.println(" state_code :: state_code ---> " + state_code);
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
        return weather.getResults();
    }

    @Step
    public String getResultStatus() throws Exception {
        return weather.getStatus();
    }


}
