package org.medioAmbiente.PPB007.CAP_F_037.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/cae")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//a[@title=\"Canal de Administración Electrónica\"]")
    private WebElementFacade Enlace_CAE;


    public void clickarLogoJunta() throws InterruptedException {
        Logo_Junta.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.titleContains("Consejería de Agricultura"));
    }

    public void clickarLogoCAE() throws InterruptedException {
        getDriver().navigate().back();
        Enlace_CAE.click();
    }

    public void validarTextFlotante() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Logo_Junta).perform();

        String validar = Logo_Junta.getAttribute("title");

        if (validar.equals("Consejería de Sostenibilidad, Medio Ambiente y Economía Azul")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }

    }
}
