package org.medioAmbiente.PPB006.CAP_F_022.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/actua")



public class MyPage extends PageObject {
    @FindBy(xpath = "//a[@title=\"Buenas prácticas en casa, en la comunidad de vecinos y el barrio\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//a[@title=\"Buenas prácticas en el puesto de trabajo y en el aula\"]")
    private WebElementFacade Flotante;

    public void visualizarCAPF106() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//h2[contains(text(),'¿Qué puedes hacer tú?')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void visualizarCAPF111()  throws InterruptedException{
        Enlace.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if(textflotante.equals("Buenas prácticas en el puesto de trabajo y en el aula")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}