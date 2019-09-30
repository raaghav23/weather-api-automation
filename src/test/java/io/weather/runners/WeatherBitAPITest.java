package io.weather.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/api/weatherbit.feature", "src/test/resources/features/api/forecast.feature"}, glue = {
        "io.weather.steps"})
public class WeatherBitAPITest {
}
