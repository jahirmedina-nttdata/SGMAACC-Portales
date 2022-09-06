package org.medioAmbiente.PPB001.CAP_F_045.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category1-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'LUGAR DE IMPORTANCIA COMUNITARIA')]")
    private WebElementFacade Importancia_Comunitaria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_espaciosNaturales-button\"]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MARISMAS DEL ODIEL')]")
    private WebElementFacade Marismas_Odiel;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarTipoDeEspacio() throws InterruptedException {
        Tipo_Espacio.click();
        Importancia_Comunitaria.click();
    }

    public void seleccionarNombreDeEspacio() throws InterruptedException {
        Nombre_Espacio.click();
        Marismas_Odiel.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

}
