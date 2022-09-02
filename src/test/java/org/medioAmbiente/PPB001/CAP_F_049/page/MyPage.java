package org.medioAmbiente.PPB001.CAP_F_049.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_resultsDiv\"]/div/div[1]/div/div/span[2]")
    private WebElementFacade Resultado_Cantidad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_follow_reading_asset0\"]/article/div/div[2]/span[2]")
    private WebElementFacade Validar_Resultado;


    public void buscarPortexto() throws InterruptedException {
       Texto_Buscar.sendKeys("bahia");
    }

    public void clickarBuscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        btnBuscar.click();
    }

    public void validarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");

        String validar_texto = Validar_Resultado.getText();
        String cantidad = Resultado_Cantidad.getText();

        if(validar_texto.contains("BAHIA") && cantidad.contains("11")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No realiza busqueda");
        }
    }

}
