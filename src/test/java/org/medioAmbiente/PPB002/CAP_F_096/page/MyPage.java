package org.medioAmbiente.PPB002.CAP_F_096.page;


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


@DefaultUrl("/medioambiente/portal/acceso-rediam/catalogo")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Restauración de riberas en ríos mediterráneos. Andalucía\"]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//div[@class=\"slick-list draggable\"]")
    private WebElementFacade Elemento_arrastrar;

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    private WebElementFacade Flecha_Derecha;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    private WebElementFacade Flecha_Izquierda;

    @FindBy(xpath = "//a[@title=\"Plan Director de Riberas de Andalucía 2003\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "(//span[@title=\"Catálogo REDIAM\"])[2]")
    private WebElementFacade validartext;



    public void ubicarseApartado() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'CATÁLOGO DE DATOS Y SERVICIOS AMBIENTALES')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }


    public void posicionarPuntero()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 90);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Restauración de riberas en ríos mediterráneos. Andalucía\"]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.contains("Restauración de riberas en ríos mediterráneos. Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void arrastrarAlaIzquierda()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Elemento_arrastrar,-300,0)
                .perform();
    }

    public void arrastrarAlaDerecha()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Elemento_arrastrar,300,0)
                .perform();
    }

    public void clickarFlechaDerecha()throws InterruptedException {
        Flecha_Derecha.click();
    }

    public void clickarFlechaIzquierda()throws InterruptedException {
        Flecha_Izquierda.click();
    }

    public void accederEnlace()throws InterruptedException {
        Flecha_Izquierda.click();
        waitFor(2).second();
        Flecha_Izquierda.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Plan Director de Riberas de Andalucía 2003\"]")));
        Enlace.click();
    }

    public void validarAccesoCorrecto()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title=\"Catálogo REDIAM\"])[2]")));
        String validar = validartext.getAttribute("title");

        if(validar.contains("Catálogo REDIAM")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}
