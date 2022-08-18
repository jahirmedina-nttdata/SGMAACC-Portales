package org.medioAmbiente.PPB006.CAP_FN_085.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
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
        Apartado.click();
        Thread.sleep(2000);
        Apartado.click();
        Thread.sleep(2000);
        Apartado2.click();
        Thread.sleep(2000);
        Enlace.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);

    }
}