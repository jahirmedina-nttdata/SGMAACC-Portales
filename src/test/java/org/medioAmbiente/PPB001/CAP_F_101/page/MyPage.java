package org.medioAmbiente.PPB001.CAP_F_101.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/publicaciones?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category4-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MONUMENTO NATURAL')]")
    private WebElementFacade Monumento_Natural;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category0-button\"]")
    private WebElementFacade Lista_Provincia;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category1-button\"]")
    private WebElementFacade Categoria;

    @FindBy(xpath = "//div[contains(text(),'GUÍAS')]")
    private WebElementFacade Guias;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category2-button\"]")
    private WebElementFacade Tipo_Archivo;

    @FindBy(xpath = "//div[contains(text(),'PDF')]")
    private WebElementFacade PDF;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]/div/div[2]/table/tbody/tr/td[1]/div/p")
    private WebElementFacade Validar_Titulo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]/div/div[2]/table/tbody/tr/td[2]/div/p")
    private WebElementFacade Validar_Categoria;


    public void seleccionarTipoEspacio() throws InterruptedException {
        Tipo_Espacio.waitUntilClickable();
        Tipo_Espacio.click();
        Monumento_Natural.click();
    }

    public void seleccionarProvincia() throws InterruptedException {
        Lista_Provincia.click();
        Almeria.click();
    }

    public void seleccionarCategoria() throws InterruptedException {
        Categoria.click();
        Guias.click();
    }

    public void seleccionarArchivo() throws InterruptedException {
        Tipo_Archivo.click();
        PDF.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarBusqueda() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        String titulo = Validar_Titulo.getText();
        String categoria = Validar_Categoria.getText();

        if(titulo.contains("Salud y espacios naturales") && categoria.contains("GUÍAS")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide la busqueda");
        }

    }

}
