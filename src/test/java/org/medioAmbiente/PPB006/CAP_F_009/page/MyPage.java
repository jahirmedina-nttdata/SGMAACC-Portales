package org.medioAmbiente.PPB006.CAP_F_009.page;


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


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    @FindBy(xpath = "(//a[@title=\"Compensación de emisiones de GEI\"])[2]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "(//div[@class=\"slick-list draggable\"])[2]")
    private WebElementFacade Deslizar;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElementFacade Bullet;

    public void visualizarCAPF106() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'DIRECTO A')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void visualizarCAPF111() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Compensación de emisiones de GEI\"])[2]")));
        Contenido.click();
        getDriver().navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Compensación de emisiones de GEI\"])[2]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();

        String flotante = Contenido.getAttribute("title");

        if(flotante.equals("Compensación de emisiones de GEI")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
        Bullet.click();
        Actions actions1 = new Actions(getDriver());
        actions1.dragAndDropBy(Deslizar,-400,0)
                .perform();
        Thread.sleep(1000);
        actions1.dragAndDropBy(Deslizar,400,0)
                .perform();
    }

}