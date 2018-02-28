#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WindowElement;
import io.openbdt.element.annotions.ApplicationView;
import io.openbdt.mapping.WindowObject;

@ContextConfiguration("/setup-spring.xml")
public class PageObjectClass extends WindowObject{

	@ApplicationView(how=How.CLASS_NAME, using="ApplicationFrameWindow")
	public WindowElement applicationView;
	
	@FindBy(how=How.ID, using="equalButton")
	public WindowElement calcular;
	
	@FindBy(how=How.ID, using="CalculatorResults")
	public WindowElement result;

	public WindowElement getCalcular() {
		return calcular;
	}
	
	public WindowElement getResult() {
		return result;
	}
}
