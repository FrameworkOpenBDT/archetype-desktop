#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps.business;

import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WindowScreenElement;
import ${package}.pages.PageObjectClass;

@ContextConfiguration("/setup-spring.xml")
@Component
public class StepBusiness {

	@Autowired
	private PageObjectClass pageObject;

	@Autowired
	private WindowScreenElement viewElement;
	
	public void verificarAplicacao() {
		assertTrue(viewElement.isDisplayed(pageObject.getApplicationView()));
	}
	
	public void inserirTexto(String texto) {
		viewElement.sendText(pageObject.getAreaDeTexto(), texto);
	}
	
	public void clicarEmAjuda() {
		viewElement.click(pageObject.getItemAjuda());
	}
	
	public void clicarEmSobreBlocoDeNotas() {
		viewElement.click(pageObject.getItemSobreBlocoNotas());
	}
	
	public String obterVersao() {
		String version = viewElement.getText(pageObject.getVersao());
		return version;
	}
	
	public void clicarEmOk() {
		viewElement.click(pageObject.getButtonOk());
	}
}