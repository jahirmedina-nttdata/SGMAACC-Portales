package org.medioAmbiente.PPB002.CAP_F_092.page;


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

import java.util.List;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "(//li//span[contains(text(),'ÁREAS TEMÁTICAS')])[1]")
    private WebElementFacade Areas_Tematicas;

    @FindBy(xpath = "(//li//span[contains(text(),'ATMÓSFERA')])[1]")
    private WebElementFacade Atmosfera;

    @FindBy(xpath = "//label[contains(text(),'Planificación')]")
    private WebElementFacade Check_Planificacion;

    @FindBy(xpath = "//label[contains(text(),'Visualizadores')]")
    private WebElementFacade Check_Visualizadores;

    @FindBy(xpath = "//label[contains(text(),'Listados')]")
    private WebElementFacade Check_Listados;

    @FindBy(xpath = "//label[contains(text(),'Datos en tiempo real')]")
    private WebElementFacade Check_Datos;

    @FindBy(xpath = "//label[contains(text(),'Informes y memorias')]")
    private WebElementFacade Check_Informes;

    @FindBy(xpath = "//label[contains(text(),'Estadísticas')]")
    private WebElementFacade Check_Estadisticas;


    public void posicionarAreasTematicas() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Areas_Tematicas)
                .perform();
    }

    public void pulsarSubmenuAtmosfera()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Atmosfera)
                .perform();
        Atmosfera.click();
    }

    public void checkPlanificacion()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Atmósfera')])[2]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");

        Check_Planificacion.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Planificación')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Planificacion.click();
    }

    public void checkVisualizadores()throws InterruptedException {
        Check_Visualizadores.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Visualizadores')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Visualizadores.click();
    }

    public void checkListados()throws InterruptedException {
        Check_Listados.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Listados')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Listados.click();
    }

    public void checkDatosTiempoReal()throws InterruptedException {
        Check_Datos.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Datos en tiempo')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Datos.click();
    }

    public void checkInformesyMemorias()throws InterruptedException {
        Check_Informes.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Informes y memorias')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Informes.click();
    }

    public void checkEstadisticas()throws InterruptedException {
        Check_Estadisticas.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));

        List<WebElement> filtro = getDriver().findElements(By.xpath("//span[contains(text(),'Estadísticas')]"));
        if (filtro.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }
        Check_Estadisticas.click();
    }

    public void checkTodoslosFiltros()throws InterruptedException {
        Check_Planificacion.click();
        Check_Visualizadores.click();
        Check_Listados.click();
        Check_Informes.click();
        Check_Datos.click();
        Check_Estadisticas.click();
        WebDriverWait waits = new WebDriverWait(getDriver(), 20);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        List<WebElement> filtro1 = getDriver().findElements(By.xpath("//span[contains(text(),'Planificación')]"));
        List<WebElement> filtro2 = getDriver().findElements(By.xpath("//span[contains(text(),'Visualizadores')]"));
        List<WebElement> filtro3 = getDriver().findElements(By.xpath("//span[contains(text(),'Listados')]"));
        List<WebElement> filtro4 = getDriver().findElements(By.xpath("//span[contains(text(),'Informes y memorias')]"));
        List<WebElement> filtro5 = getDriver().findElements(By.xpath("//span[contains(text(),'Datos en tiempo')]"));
        List<WebElement> filtro6 = getDriver().findElements(By.xpath("//span[contains(text(),'Estadísticas')]"));
        if (filtro1.size() != 0 && filtro2.size() != 0 && filtro3.size() != 0 && filtro4.size() != 0 && filtro5.size() != 0 && filtro6.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Filtro");
        }

    }

}
