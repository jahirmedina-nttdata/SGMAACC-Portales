package org.medioAmbiente.PPB006.CAP_F_104.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avan;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_category0-button\"]")
    private WebElementFacade Lista;

    @FindBy(xpath = "//div[contains(text(),'Administraciones locales')]")
    private WebElementFacade Categoria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchButton\"]/span")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"46894923\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[13]/a")
    private WebElementFacade Sig;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[14]/a")
    private WebElementFacade Ultimo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[2]/a")
    private WebElementFacade Atras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[1]/a")
    private WebElementFacade Primera;

    @FindBy(xpath = "//li[@class=\"page_number pag_num_2\"]/a")
    private WebElementFacade Pagina;

    @FindBy(xpath = "//div[contains(text(),\"Fecha de publicación ascendente\")]")
    private WebElementFacade Publicacion_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título ascendente\")]")
    private WebElementFacade Titulo_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título descendente\")]")
    private WebElementFacade Titulo_Desc;

    @FindBy(xpath = "//span[@title=\"ordenacion-resultados\"]")
    private WebElementFacade Lista_Ordenacion;

    public void visualizarBuscador() throws InterruptedException{
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@id=\"searchDiv\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Busqueda");
        }
    }

    public void accederBuscador() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/cambio-climatico/buscador").toString());
        Busqueda_Avan.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void buscarPorTexto() throws InterruptedException{
        Texto_Buscar.sendKeys("Huella"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorColectivo() throws InterruptedException {
        btnLimpiar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Lista.click();
        Categoria.click();
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarPorFechaDePublicacionAscendente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Publicacion_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarPorTituloAscendente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarPorTituloDescendente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Desc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTextoYColectivo() throws InterruptedException {
        btnLimpiar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Texto_Buscar.sendKeys("Evolución");
        Lista.click();
        Categoria.click();
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void posicionarPunteroEnTexto() throws InterruptedException {
        btnLimpiar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();
        String textflotante = Enlace.getAttribute("title");
        if(textflotante.equals("Nuevos visores de adaptación de las costas al cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void visualizarPaginacion() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void pulsarPaginador() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Pagina).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void pulsarSiguiente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Sig).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void pulsarUltimaPagina() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Ultimo).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void pulsarAnterior() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Atras).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void pulsarPrimeraPagina() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Primera).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void validarCantidadDeResultados() throws InterruptedException {
        List<WebElement> resultados = getDriver().findElements(By.xpath("//div[@class=\"evr-form-results__item-title\"]"));
        if (resultados.size() == 9) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe cantidad de resultados");
        }
    }
}
