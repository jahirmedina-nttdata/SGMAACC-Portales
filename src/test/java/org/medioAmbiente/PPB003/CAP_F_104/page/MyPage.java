package org.medioAmbiente.PPB003.CAP_F_104.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"layout_13\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_14\"]")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")
    private WebElementFacade Paginador;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void ejecutarCAPF103() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void seleccionarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Paginador.click();
    }
}