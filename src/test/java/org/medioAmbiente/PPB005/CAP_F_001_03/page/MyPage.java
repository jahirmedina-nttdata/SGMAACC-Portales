package org.medioAmbiente.PPB005.CAP_F_001_03.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/portal-conocimiento")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//span[contains(text(),'MARCO NORMATIVO TIC')])[1]")
    private WebElementFacade Menu_MarcoNormativo;

    @FindBy(xpath = "(//span[contains(text(),'MODELO RELACIÓN')])[1]")
    private WebElementFacade SubMenu_ModeloRelacion;

    @FindBy(xpath = "(//span[contains(text(),'INTEROPERABILIDAD')])[1]")
    private WebElementFacade Menu_Interoperabilidad;



    public void mostrarMenu() throws InterruptedException {
        waitFor(3).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("(//nav[@id=\"navbar_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet\"])[1]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe menu navegacion");
        }
    }


    public void posicionarPunteroEnMenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu_MarcoNormativo)
                .perform();

    }


    public void accedoAlSubmenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu_Interoperabilidad)
                .perform();
        actions.moveToElement(SubMenu_ModeloRelacion).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Modelo de relación de la OTI con los diferentes equipos de la Consejería')]")));
    }

}
