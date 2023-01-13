package org.medioAmbiente.PPB001.CAP_F_012.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade Buscador_General;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_searchTextInput\"]")
    private WebElementFacade Buscador_Especifico;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avanzada;

    @FindBy(xpath = "//*[@id=\"52815710\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_startDate\"]")
    private WebElementFacade Fecha_Incio;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_endDate\"]")
    private WebElementFacade Fecha_Fin;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_category0-button\"]")
    private WebElementFacade Lista_Tema;

    @FindBy(xpath = "//div[contains(text(),'Agua')]")
    private WebElementFacade Tema;

    public void buscarPorTexto() throws InterruptedException {
        Buscador_General.sendKeys("Producción Ecológica"+ "\n");
    }

    public void accederContenido() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Contenido.click();
    }
    public void buscarPorFecha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title=\"Catálogo REDIAM\"])[2]")));
        getDriver().navigate().back();
        Buscador_Especifico.clear();
        Busqueda_Avanzada.click();
        Fecha_Incio.sendKeys("01/06/2022");
        Fecha_Fin.sendKeys("30/06/2022");
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTema() throws InterruptedException {
        btnLimpiar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Lista_Tema.click();
        Tema.click();
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

}
