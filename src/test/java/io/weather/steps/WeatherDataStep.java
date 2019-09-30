package io.weather.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.weather.actions.WeatherBitActions;
import io.weather.utils.Constants;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class WeatherDataStep {

    @Steps
    WeatherBitActions weatherBitActions;

    String apiKey;
    String lat;
    String lang;

    @Given("^The user have valid API key$")
    public void the_user_have_proper_API_key() throws Exception {
        apiKey = Constants.WEATHER_API_KEY;
    }


    @When("^The user sents GET request and get the state code value$")
    public void the_user_sents_GET_request_to_get_state_code_value() throws Exception {
        weatherBitActions.requestWeatherWithGet();
    }



    @Then("^API should return status as (\\d+)$")
    public void api_should_return_status_as(int statusCode) throws Exception {
        assertThat("Verify Status code for Weather Api ", weatherBitActions.getStatusCode(), equalTo(statusCode));
    }

    @Then("^Response content type should be application json$")
    public void response_content_type_should_be_json() throws Exception {
        assertThat("Verify Content Type for Weather Api ", weatherBitActions.getContentType(),
                equalTo("application/json; charset=utf-8"));
    }

    @Then("^Response should have status code$")
    public void response_should_have_status_code() throws Exception {
        assertThat("Verify Result for Weather Api ", weatherBitActions.getStatusCode(),
                greaterThanOrEqualTo(1));
    }
}
