#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps.business;

import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WindowScreenElement;
import ${package}.pages.PageObjectClass;
import net.serenitybdd.core.annotations.findby.By;

@ContextConfiguration("/setup-spring.xml")
public class StepBusiness {

	@Autowired
	private PageObjectClass pageObject;

	@Autowired
	private WindowScreenElement viewElement;
	
	public void verificarAplicacao() {
		assertTrue(getViewElement().isDisplayed(pageObject.getApplicationView()));
	}
	
	public void clicarNoNumero(Integer num) {
		getViewElement().click(getViewElement().findElement(By.id(String.format("num%dButton", num))));
	}
	
	public void calcular() {
		getViewElement().click(getPageObject().getCalcular());
	}
	
	public void clicarNoOperadorDe(String operador) {
		getViewElement().click(getViewElement().findElement(By.id(String.format("%sButton", operador))));
	}
	
	public String obterResultado() {
		return getViewElement().getText(getPageObject().getResult());
	}
	
	public PageObjectClass getPageObject() {
		return pageObject;
	}

	public void setPageObject(PageObjectClass pageObject) {
		this.pageObject = pageObject;
	}
	
	public WindowScreenElement getViewElement() {
		return viewElement;
	}

	public void setViewElement(WindowScreenElement viewElement) {
		this.viewElement = viewElement;
	}
}