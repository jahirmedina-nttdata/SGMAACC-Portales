package org.medioAmbiente.PPB003.CAP_F_083.page;


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


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[2]/div/figure/a")
    private WebElementFacade Favoritos;

    @FindBy(xpath = "//*[@id=\"portlet_favoritosmodule_INSTANCE_A6rlF3DEndQG\"]//section/div/div/div/div/h1")
    private WebElementFacade Validar_Permiso;

    @FindBy(xpath = "//*[@id=\"portlet_favoritosmodule_INSTANCE_A6rlF3DEndQG\"]/div/div/div/div/div/div/section")
    private WebElementFacade Validar_Listado;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void clikarFavoritos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Favoritos).click().perform();
    }

    public void validarPermiso() throws InterruptedException {
        String validar = Validar_Permiso.getText();
        if(validar.equals("Favoritos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se encuentra autenticado");
        }
    }

    public void validarFavoritos() throws InterruptedException {
        if(Validar_Listado.isEnabled()) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No muestra lista de favoritos");
        }
    }
}