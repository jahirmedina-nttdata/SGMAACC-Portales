package org.medioAmbiente.PPB006.CAP_FN_083.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/el-pacto-verde-europeo-y-el-marco-normativo-nacional")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Plan Nacional de Adaptación al Cambio Climático (2021-2030)\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//a[@title=\"Pacto Verde Europeo\"]")
    private WebElementFacade Flotante;

    public void visualizarCAPFC010() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//ul[@class=\"breadcrumb\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Contenido.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if(textflotante.equals("Pacto Verde Europeo")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}