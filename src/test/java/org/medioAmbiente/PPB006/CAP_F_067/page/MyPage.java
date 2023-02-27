package org.medioAmbiente.PPB006.CAP_F_067.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/participacion-en-proyectos-nacionales-e-internacionales")


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

    public void visualizarCAPF109() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Apartado2.click();
        Apartado2.click();
        Apartado.click();
        Enlace.click();
        getDriver().navigate().back();
        Apartado.click();
        Imagen.click();
        Close_Imagen.click();
        Apartado.click();
    }
}