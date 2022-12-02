package org.medioAmbiente.PPB001.CAP_F_056.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'CÁDIZ')]")
    private WebElementFacade Cadiz;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarAreaRecreativa() throws InterruptedException {
       // Tipo_Equipamiento.click();
       // Area_Recreativa.click();
    }

    public void seleccionarCadiz() throws InterruptedException {
       // Lista_Provincias.click();
      //  Cadiz.click();
    }

    public void clickarBuscar() throws InterruptedException {
      //  btnBuscar.click();
    }

}
