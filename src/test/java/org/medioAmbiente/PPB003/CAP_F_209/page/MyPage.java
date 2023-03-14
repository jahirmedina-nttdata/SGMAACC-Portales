package org.medioAmbiente.PPB003.CAP_F_209.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante")


public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@id=\"dropdownMenu1\"]")
    private WebElementFacade Traducir;

    @FindBy(xpath = "(//a[contains(text(),'EN')])[1]")
    private WebElementFacade Idioma_Ingles;
    @FindBy(xpath = "(//h2/a)[1]")
    private WebElementFacade Validar_Resultado;


    public void traducirAIngles() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"dropdownMenu1\"]")));
        Traducir.click();
        Idioma_Ingles.click();
    }

    public void validarTraduccion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'NEWS & EVENTS')])[1]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 450)");

        String validacion = Validar_Resultado.getText();
        if(validacion.contains("Protected Areas")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Traduccion Incorrecta");
        }

    }
}
