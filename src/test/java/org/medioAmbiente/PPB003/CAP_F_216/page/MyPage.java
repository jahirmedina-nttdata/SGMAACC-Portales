package org.medioAmbiente.PPB003.CAP_F_216.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-actividad/-/asset_publisher/QYwm8uHC3ojh/content/buceo/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'ESPACIOS NATURALES')]")
    private WebElementFacade Pestaña_EspacioNatural;

    @FindBy(xpath = "//span[contains(text(),'BARRANQUISMO')]")
    private WebElementFacade Ficha_Barranquismo;

    @FindBy(xpath = "//span[@class=\"evr-breadcrumbs__txt\"]")
    private WebElementFacade Validar_Ficha;

    private String prntw;
    private String popwnd;

    public void clickarEspaciosNaturales() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buceo')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 400)");
        Pestaña_EspacioNatural.click();
    }

    public void clickarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        Ficha_Barranquismo.click();
    }

    public void validarFicha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Barranquismo en la Cueva')]")));
        String validacion = Validar_Ficha.getText();
        if(validacion.contains("Barranquismo en la Cueva del Gato")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion No Valida");
        }
    }
}
