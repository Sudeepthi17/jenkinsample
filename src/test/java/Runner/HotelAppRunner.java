package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinitions",
		tags="@SanityTest and @E2ETest")
public class HotelAppRunner {

}
