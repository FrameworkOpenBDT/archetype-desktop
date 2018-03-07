package ${package}.steps.definition;

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
	
	@Given("^estou com a aplicacao aberta$")
	public void estou_com_a_aplicacao_aberta() throws Throwable {
		stepB.verificarAplicacao();
	}
	
	@When("^digito o texto \"([^\"]*)\"$")
	public void digito_o_texto(String arg1) throws Throwable {
		stepB.inserirTexto(arg1);
	}

	@And("^clico em 'Ajuda'$")
	public void clico_em_Ajuda() throws Throwable {
	    stepB.clicarEmAjuda();
	}

	@And("^clico em 'Sobre o bloco de notas'$")
	public void clico_em_Sobre_o_bloco_de_notas() throws Throwable {
	    stepB.clicarEmSobreBlocoDeNotas();
	}

	@And("^e exibido a versao$")
	public void e_exibido_a_versao() throws Throwable {
	    System.out.println(String.format("Versao do notepad: %s", stepB.obterVersao()));
	}
	
	@Then("^clico em ok$")
	public void clico_em_ok() throws Throwable{
		stepB.clicarEmOk();
	}
}
