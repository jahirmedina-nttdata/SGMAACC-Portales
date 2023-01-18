package org.medioAmbiente.PPB006.CAP_FC_007.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/emisiones-difusas")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Sistema Andaluz de Compensación de Emisiones (SACE)\"]")
    private WebElementFacade Destacados;

    @FindBy(xpath = "//a[contains(text(),\"¿En qué consiste?\")]")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//a[contains(text(),\"Cómo adherirse\")]")
    private WebElementFacade Descarga_Principal;

    @FindBy(xpath = "//a[contains(text(),\"Las personas interesadas en adherirse\")]")
    private WebElementFacade Apartado_Secundario;

    @FindBy(xpath = "//a[contains(text(),\"Solicitud de inscripción\")]")
    private WebElementFacade Apartado_Descarga;

    @FindBy(xpath = "//div[@id=\"collapseService5\"]//a[@title=\"Descargar XLSX\"]")
    private WebElementFacade Archivo_Descarga;

    @FindBy(xpath = "//a[contains(text(),\"¿Qué ventajas ofrece?\")]")
    private WebElementFacade Apartado_Enlace;

    @FindBy(xpath = "//a[contains(text(),\"Infografía 'Resultado de la encuesta del Servicio\")]")
    private WebElementFacade Enlace;


    public void clickarComponenteDestacado()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Destacados).click().perform();
    }

    public void visualizarContenido()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 850)");
    }

    public void mostrarApartado() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Apartado).click().perform();
        waitFor(1).second();
    }
    public void ocultarApartado() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Apartado).click().perform();
    }

    public void descargarArchivo() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Descarga_Principal).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"Las personas interesadas en adherirse\")]")));
        actions.moveToElement(Apartado_Secundario).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"Solicitud de inscripción\")]")));
        actions.moveToElement(Apartado_Descarga).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"collapseService5\"]//a[@title=\"Descargar XLSX\"]")));
        actions.moveToElement(Archivo_Descarga).click().perform();
        waitFor(1).second();
        actions.moveToElement(Descarga_Principal).click().perform();
    }

    public void clickarEnlace() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Apartado_Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"Infografía 'Resultado de la encuesta del Servicio\")]")));
        actions.moveToElement(Enlace).click().perform();
       waitFor(2).second();
    }

}
