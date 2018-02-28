package ${package}.steps.definition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ${package}.steps.business.StepBusiness;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/setup-spring.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	@Given("^estou com a aplicação aberta$")
	public void estou_com_a_aplicação_aberta() throws Throwable {
		stepB.verificarAplicacao();
	}

	@When("^clico sobre o numero \"([+-]?[0-9]*[.]?[0-9]+)\"$")
	public void clico_sobre_o_numero(Integer num) throws Throwable {
		stepB.clicarNoNumero(num);
	}

	@And("^clico sobre o operador de \"([^\"]*)\"$")
	public void clico_sobre_o_operador_de(String operador) throws Throwable {
		stepB.clicarNoOperadorDe(operador);
	}
	
	@Then("^clico em calcular$")
	public void clico_em_calcular() throws Throwable {
		System.out.println(stepB.obterResultado());
		stepB.calcular();
	}

	@Then("^e exibido o resultado \"([+-]?[0-9]*[.]?[0-9]+)\"$")
	public void e_exibido_o_resultado(Integer resultado) throws Throwable {
		Pattern pattern = Pattern.compile("^.*Display is ([+-]?[0-9]*[.]?[0-9]+).*$");
		Matcher matcher = pattern.matcher(stepB.obterResultado());
		if(matcher.matches())
			Assert.assertTrue(matcher.group(1).equals(String.valueOf(resultado)));
	}
}
