package org.medioAmbiente.PPB003.CAP_F_050.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_document_library_web_portlet_IGDisplayPortlet_INSTANCE_Hkqqr8oKs67z\"]/div/div/div/div/div/div")
    private WebElementFacade Carrusel;


    public void visualizarCarrusel() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
    }

    public void deslizarIzquierda() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Carrusel,-400,0)
                .perform();
    }

    public void deslizarDerecha() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Carrusel,400,0)
                .perform();
    }
}
