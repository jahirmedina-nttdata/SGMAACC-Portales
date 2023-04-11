package org.medioAmbiente.PPB003.CAP_F_185.page;


import io.cucumber.java.ro.Si;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/avisos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//li[@class=\"page_number pag_num_2\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//a[contains(text(),\"Siguiente\")]")
    private WebElementFacade Siguiente_Pag;

    @FindBy(xpath = "//a[contains(text(),\"Anterior\")]")
    private WebElementFacade Anterior_Pag;


    public void seleccionarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 850)");
        Paginador.click();
    }

    public void clickarSiguientePag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Siguiente_Pag.click();
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        //Siguiente_Pag.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"next disabled\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }
    public void clickarAnteriorPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Anterior_Pag.click();

    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Anterior_Pag.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Anterior_Pag.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"prev disabled\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }
}
