package org.medioAmbiente.PPB001.CAP_F_057.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category1-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MONUMENTO NATURAL')]")
    private WebElementFacade Monumento_Natural;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_espaciosNaturales-button\"]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'ENCINA DE LA PEANA')]")
    private WebElementFacade Encina_Peana;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarTipoDeEspacio() throws InterruptedException {
        //Tipo_Espacio.click();
       // Monumento_Natural.click();
    }

    public void seleccionarNombreDeEspacio() throws InterruptedException {
       // Nombre_Espacio.click();
       // Encina_Peana.click();
    }

    public void clickarBuscar() throws InterruptedException {
      //  btnBuscar.click();
    }

}
