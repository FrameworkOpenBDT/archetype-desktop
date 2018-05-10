package ${package}.runner;

import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.openbdt.run.SuiteTestRunner;
import io.openbdt.setup.Setup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class RunnerTest {
	
	@Autowired
	@Qualifier("desktopSetup")
	private Setup setup;
	
	@Autowired
	private SuiteTestRunner suiteTestRunner;
	
	@Test
	public void test(){
		Result result = suiteTestRunner.runWithJunit(this.setup.getClass());
		for(Failure failure: result.getFailures()) {
			System.out.println("Exception: " + failure.getException());
			System.out.println("Message: "+  failure.getMessage());
			System.out.println("Trace: "+  failure.getTrace());
		}
	}
}