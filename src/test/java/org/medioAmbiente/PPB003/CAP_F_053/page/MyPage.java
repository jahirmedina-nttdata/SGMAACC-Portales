package org.medioAmbiente.PPB003.CAP_F_053.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Ver todo el contenido de la Agenda')]")
    private WebElementFacade Ver_Contenido;


    public void comprobarCompenente() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//div[@class=\"evr-present__item\"])[1]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[contains(text(),'Ver todo el contenido de la Agenda')]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Enlace");
        }
    }

    public void pulsarBotonContenidoAgenda() throws InterruptedException {
        Ver_Contenido.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}
