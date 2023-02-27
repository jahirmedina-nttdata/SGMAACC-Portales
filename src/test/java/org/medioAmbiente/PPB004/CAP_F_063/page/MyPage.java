package org.medioAmbiente.PPB004.CAP_F_063.page;


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


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/especies-cinegéticas")



public class MyPage extends PageObject {


    @FindBy(xpath = "//a[@title=\"Delimitación cartográfica del Arruí\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElementFacade Bullet;

    @FindBy(xpath = "//div[@class=\"slick-list draggable\"]")
    private WebElementFacade Card;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_SDFlr2QMFIzO\"]//div[2]/button[2]")
    private WebElementFacade Flecha_Derecha;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_SDFlr2QMFIzO\"]//div[2]/button[1]")
    private WebElementFacade Flecha_Izquierda;
    public void navegarContenido()throws InterruptedException  {
        Contenido.click();
        getDriver().navigate().back();
    }
    public void validarTextFlotante() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Delimitación cartográfica del Arruí\"]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();
        String textflotante = Contenido.getAttribute("title");

        if(textflotante.equals("Delimitación cartográfica del Arruí")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarBullet() throws InterruptedException {
        Bullet.click();

    }
    public void deslizarIzquierda()  throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Card,-500,0)
                .perform();
    }
    public void deslizarDerecha()  throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Card,500,0)
                .perform();
    }

    public void clickarFDerecha() throws InterruptedException{
        Flecha_Derecha.click();
    }

    public void clickarFIzquierda() throws InterruptedException{
        Flecha_Izquierda.click();
    }
}
