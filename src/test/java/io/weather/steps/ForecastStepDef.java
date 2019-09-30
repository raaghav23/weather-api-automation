package io.weather.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.weather.actions.ForecastActions;
import io.weather.actions.WeatherBitActions;
import io.weather.utils.Constants;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class ForecastStepDef {

    @Steps
    ForecastActions forecastActions;

    String apiKey;
    @Given("^The user have proper API key$")
    public void the_user_have_proper_API_key() throws Exception {
        apiKey = Constants.WEATHER_API_KEY;
    }


    @When("^The user sents GET request and get the Timestamp and weather value$")
    public void the_user_sents_GET_request_to_forecast_API_with_API_key() throws Exception {
        ForecastActions.requestForecastWithGet();
    }


    @Then("^API response should return status as (\\d+)$")
    public void api_should_return_status_as(int statusCode) throws Exception {
        assertThat("Verify Status code for Weather Api ", forecastActions.getStatusCode(), equalTo(statusCode));
    }

    @Then("^Response content type should be json$")
    public void response_content_type_should_be_json() throws Exception {
        assertThat("Verify Content Type for Weather Api ", forecastActions.getContentType(),
                equalTo("application/json; charset=utf-8"));
    }

    @Then("^Validate Response has status code$")
    public void response_should_have_timestamp_utc_weather() throws Exception {
        assertThat("Verify Result for Forecast Api ", forecastActions.getStatusCode(),
                greaterThanOrEqualTo(1));
    }

}
