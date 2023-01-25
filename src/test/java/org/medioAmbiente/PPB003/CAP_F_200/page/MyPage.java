package org.medioAmbiente.PPB003.CAP_F_200.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_searchButton\"]")
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
