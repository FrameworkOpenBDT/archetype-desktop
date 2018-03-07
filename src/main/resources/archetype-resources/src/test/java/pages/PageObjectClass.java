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

	@ApplicationView(how=How.CLASS_NAME, using="Notepad")
	public WindowElement applicationView;
	
	@FindBy(how=How.CLASS_NAME, using="Edit")
	public WindowElement areaDeTexto;
	
	@FindBy(how=How.ID, using="Item 5")
	public WindowElement itemAjuda;
	
	@FindBy(how=How.ID, using="Item 65")
	public WindowElement itemSobreBlocoNotas;

	@FindBy(how=How.ID, using="13579")
	public WindowElement versao;
	
	@FindBy(how=How.NAME, using="OK")
	public WindowElement buttonOk;

	public WindowElement getAreaDeTexto() {
		return areaDeTexto;
	}

	public WindowElement getItemAjuda() {
		return itemAjuda;
	}

	public WindowElement getItemSobreBlocoNotas() {
		return itemSobreBlocoNotas;
	}

	public WindowElement getVersao() {
		return versao;
	}

	public WindowElement getButtonOk() {
		return buttonOk;
	}	
}

