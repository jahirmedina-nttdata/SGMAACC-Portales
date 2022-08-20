package org.medioAmbiente.PPB006.CAP_FN_085.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/la-ley-del-cambio-climatico-y-transicion-energetica")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_8CKBYys0VzIL\"]//div[3]/div[1]/a")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_8CKBYys0VzIL\"]//div[3]/div[4]/a")
    private WebElementFacade Apartado2;

    @FindBy(xpath = "//*[@id=\"collapseService4\"]//div/a")
    private WebElementFacade Enlace;


    public void visualizarCAPFC007() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        Apartado.click();
        Apartado.click();
        Apartado2.click();
        Enlace.click();
        getDriver().navigate().back();
    }
}