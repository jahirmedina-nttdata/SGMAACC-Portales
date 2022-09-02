package org.medioAmbiente.PPB001.CAP_F_073.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/avisos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_resultsDiv\"]/div/div[1]/div/div/span[2]")
    private WebElementFacade Resultado_Cantidad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_asset0\"]/div/strong")
    private WebElementFacade Validar_Ficha;


    public void buscarPortexto() throws InterruptedException {
       Texto_Buscar.sendKeys("zona");
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarFicha() throws InterruptedException {
         String ficha = Validar_Ficha.getText();
        String cantidad = Resultado_Cantidad.getText();

        if(ficha.contains("ZONA") && cantidad.contains("4")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No realiza busqueda");
        }
    }

}
