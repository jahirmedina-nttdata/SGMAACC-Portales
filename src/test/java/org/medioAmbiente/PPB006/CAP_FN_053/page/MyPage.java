package org.medioAmbiente.PPB006.CAP_FN_053.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas/cambio-climatico-y-clima/escenarios-locales-de-cambio-climatico")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt13-destacadosConDescripcionTresColumnas1\"]/div/h2/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-cladt13-destacadosConDescripcionTresColumnas0\"]/div/h2/a")
    private WebElementFacade Flotante;



}