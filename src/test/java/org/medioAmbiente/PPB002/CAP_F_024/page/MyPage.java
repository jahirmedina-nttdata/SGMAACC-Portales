package org.medioAmbiente.PPB002.CAP_F_024.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas/agua")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Recursos Hídricos\"]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//a[@title=\"Gestión del agua\"]")
    private WebElementFacade Gestion_Agua;

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    private WebElementFacade Siguiente_Imagen;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    private WebElementFacade Anterior_Imagen;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElementFacade Bullet;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElementFacade Bullet_2;

    @FindBy(xpath = "(//a[@title=\"Conozca las Autorizaciones de Vertido competencia de la Junta de Andalucía\"])[1]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//label[contains(text(),'Planificación')]")
    private WebElementFacade Check_Planificacion;

    @FindBy(xpath = "//label[contains(text(),'Visualizadores')]")
    private WebElementFacade Check_Visualizadores;

    @FindBy(xpath = "//label[contains(text(),'Datos en tiempo real')]")
    private WebElementFacade Check_DatosTiempoReal;

    @FindBy(xpath = "//label[contains(text(),'Informes y memorias')]")
    private WebElementFacade Check_Informe;

    @FindBy(xpath = "//label[contains(text(),'Estadísticas')]")
    private WebElementFacade Check_Estadistica;

    public void comprobarFuncionamientoCarrusel() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Siguiente_Imagen.click();
        Anterior_Imagen.click();
        Bullet.click();
        waitFor(1).second();
        Bullet_2.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Conozca las Autorizaciones de Vertido competencia de la Junta de Andalucía\"])[1]")));
        Enlace.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Consejería de Medio Ambiente y Ordenación del Territorio\"]")));
    }

    public void comprobarFuncionamientoListado() throws InterruptedException {
        getDriver().navigate().back();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();
        actions.moveToElement(Gestion_Agua).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Gestión del agua')])[2]")));
    }

    public void ubicarEnSeccionFiltros() throws InterruptedException {
        getDriver().navigate().back();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -200)");

    }

    public void marcarCheckEnCadaFiltro() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Check_Planificacion).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Planificacion).click().perform();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Visualizadores).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Visualizadores).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_DatosTiempoReal).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_DatosTiempoReal).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Informe).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Informe).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Check_Estadistica).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Estadísticas')]")));
    }

    public void marcarCheckEnTodosLosFiltros() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Check_Informe).click().perform();
        action.moveToElement(Check_DatosTiempoReal).click().perform();
        action.moveToElement(Check_Visualizadores).click().perform();
        action.moveToElement(Check_Planificacion).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        waitFor(1).second();
    }
}
