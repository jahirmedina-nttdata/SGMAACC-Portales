package org.medioAmbiente.PPB001.CAP_F_034.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset0\"]/article/div/div[2]/span[2]")
    private WebElementFacade Validar_Resultado;


    public void buscarPortexto() throws InterruptedException {
       Texto_Buscar.sendKeys("bahia");
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");

        String validar = Validar_Resultado.getText();

        if(validar.contains("BAHIA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No realiza busqueda");
        }
    }

}
