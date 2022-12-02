package org.medioAmbiente.PPB006.CAP_FN_056.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/proyectos-y-casos-de-estudio")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Coastance\"]")
    private WebElementFacade Contenido;

    public void visualizarCAPFC010() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Contenido.click();
        getDriver().navigate().back();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();

        String textflotante = Contenido.getAttribute("title");
        if (textflotante.equals("Coastance")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }
    }
}