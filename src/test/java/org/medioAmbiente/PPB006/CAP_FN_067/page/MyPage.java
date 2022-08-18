package org.medioAmbiente.PPB006.CAP_FN_067.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/participacion-en-proyectos-nacionales-e-internacionales")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_iTf9xYHgUUrz\"]//div[2]/div[1]/a")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_iTf9xYHgUUrz\"]//div[2]/div[2]/a")
    private WebElementFacade Apartado2;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]//a")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]/div[2]/figure/img")
    private WebElementFacade Imagen;

    @FindBy(xpath = "//*[@id=\"editContainerDialog\"]/button")
    private WebElementFacade Close_Imagen;

    public void visualizarCAPFC007() throws InterruptedException{
        Apartado2.click();
        Thread.sleep(2000);
        Apartado2.click();
        Thread.sleep(2000);
        Apartado.click();
        Thread.sleep(2000);
        Enlace.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        Apartado.click();
        Imagen.click();
        Thread.sleep(2000);
        Close_Imagen.click();
        Apartado.click();

    }
}