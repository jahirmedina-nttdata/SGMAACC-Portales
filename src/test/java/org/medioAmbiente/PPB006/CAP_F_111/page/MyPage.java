package org.medioAmbiente.PPB006.CAP_F_111.page;


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


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//div[@title=\"Compensación de emisiones de GEI\"])[2]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElementFacade Bullet;

    @FindBy(xpath = "(//div[@title=\"Aplicación Huella de Carbono Municipal (HCM)\"])[1]")
    private WebElementFacade Ficha;



    public void visualizarContenido() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//h3[contains(text(),'EMPRESAS')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        waitFor(5).second();
    }

    public void accederEnlace() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@title=\"Compensación de emisiones de GEI\"])[2]")));
        Contenido.click();

    }

    public void posicionarPuntero() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        getDriver().navigate().back();
        Bullet.click();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha)
                .perform();
        String textflotante = Ficha.getAttribute("title");

        if(textflotante.contains("Aplicación Huella de Carbono Municipal (HCM)")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }


}
