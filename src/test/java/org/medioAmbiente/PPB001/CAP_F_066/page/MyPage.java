package org.medioAmbiente.PPB001.CAP_F_066.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/avisos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'CÁDIZ')]")
    private WebElementFacade Cadiz;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_asset0\"]/div/strong")
    private WebElementFacade Validar_Ficha;


    public void seleccionarAreaRecreativa() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
    }

    public void seleccionarCadiz() throws InterruptedException {
        Lista_Provincias.click();
        Cadiz.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultado() throws InterruptedException {
        String validar = Validar_Ficha.getText();

        if(validar.contains("ÁREA RECREATIVA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide la ficha");
        }

    }

}
