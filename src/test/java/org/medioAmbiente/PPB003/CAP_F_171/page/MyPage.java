package org.medioAmbiente.PPB003.CAP_F_171.page;


import io.cucumber.java.en_scouse.An;
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

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//li[@class=\"page_number pag_num_2\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//a[contains(text(),'Siguiente')]")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//a[contains(text(),'Anterior')]")
    private WebElementFacade Anterior;

    public void seleccionarPaginador() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Paginador.click();
    }

    public void clickarSigPag() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -300)");
        Siguiente.click();
    }

    public void clickarSigUltimaPag() throws InterruptedException{
        List<WebElement> boton = getDriver().findElements(By.xpath("//li[@class=\"next disabled\"]"));
        if (boton.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe boton enable");
        }
    }

    public void clickarAntPag() throws InterruptedException{
        Anterior.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Anterior.click();
    }

    public void clickarAntPrimerPag() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        List<WebElement> boton = getDriver().findElements(By.xpath("//li[@class=\"prev disabled\"]"));
        if (boton.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe boton enable");
        }
    }
}
