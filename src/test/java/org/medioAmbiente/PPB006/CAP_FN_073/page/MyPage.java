package org.medioAmbiente.PPB006.CAP_FN_073.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/organismos-de-referencia")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_iTf9xYHgUUrz\"]//div[1]/a")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]//p[2]/a")
    private WebElementFacade Enlace;


    public void visualizarCAPFC007() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Apartado.click();
        Apartado.click();
        Apartado.click();
        Enlace.click();
        getDriver().navigate().back();
    }
}