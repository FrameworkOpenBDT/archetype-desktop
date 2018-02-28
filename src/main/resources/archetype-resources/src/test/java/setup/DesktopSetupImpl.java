package ${package}.setup;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;
import io.openbdt.setup.Setup;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = { "src/test/resources/bdd/features" }, glue = {"${package}.steps.definition" })
public class DesktopSetupImpl implements Setup{
}
