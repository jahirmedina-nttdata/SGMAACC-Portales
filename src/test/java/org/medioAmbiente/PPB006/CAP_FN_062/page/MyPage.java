package org.medioAmbiente.PPB006.CAP_FN_062.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/organos-de-participacion")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_iTf9xYHgUUrz\"]//div[2]//div[3]/div[1]/a")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]//a")
    private WebElementFacade Enlace;

    public void visualizarCAPFC007() throws InterruptedException {
        Apartado.click();
        Thread.sleep(2000);
        Enlace.click();
        getDriver().navigate().back();
        Thread.sleep(2000);
        Apartado.click();
        Thread.sleep(2000);
        Apartado.click();
    }
}