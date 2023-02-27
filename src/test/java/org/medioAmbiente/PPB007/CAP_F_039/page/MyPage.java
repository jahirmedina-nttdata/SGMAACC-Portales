package org.medioAmbiente.PPB007.CAP_F_039.page;


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

@DefaultUrl("/medioambiente/portal/web/cae")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Subvenciones 2021 para instalaciones de tratamiento mecánico-biológico que incrementen la eficacia en la recuperación de materiales\"]")
    private WebElementFacade Posicionar_Tarjeta;

    @FindBy(xpath = "//a[@title=\"Subvenciones 2021 para instalaciones de tratamiento de biorresiduos recogidos separadamente\"]")
    private WebElementFacade Tarjeta;

    @FindBy(xpath = "//button[@id=\"verMasCladt02Destacamos\"]")
    private WebElementFacade btnVerMas;

    public void visualizarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void posicionarPunteroEnTarjeta() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Posicionar_Tarjeta)
                .perform();
        waitFor(1).second();
    }

    public void clickarTarjeta() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Tarjeta).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
    }

    public void mostrarTextoFlotante() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Tarjeta)
                .perform();
        String validar = Tarjeta.getAttribute("title");
        if(validar.equals("Subvenciones 2021 para instalaciones de tratamiento de biorresiduos recogidos separadamente")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se visualiza texto flotante");
        }
    }

    public void clickarVerMas() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        btnVerMas.click();
        waitFor(1).second();
    }

}
