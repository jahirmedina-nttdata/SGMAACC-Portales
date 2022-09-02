package org.medioAmbiente.PPB001.CAP_F_041.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarAreaRecreativa() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
    }

    public void seleccionarAlmeria() throws InterruptedException {
        Lista_Provincias.click();
        Almeria.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

}
