package org.medioAmbiente.PPB003.CAP_F_081.page;


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

    @FindBy(xpath = "//*[@id=\"dropdownMenu1\"]/span[1]")
    private WebElementFacade Select_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet\"]//li[3]/button/a")
    private WebElementFacade Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_visitasmodule_INSTANCE_61L1Y8gTGInZ\"]//section//p")
    private WebElementFacade Validar_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/figure/a")
    private WebElementFacade Planifica_Visitas;

    public void autenticoUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Planifica_Visitas).click().perform();
    }

    public void cambiarIdioma() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        Actions action = new Actions(getDriver());
        action.moveToElement(Select_Idioma).click().perform();
        action.moveToElement(Idioma).click().perform();
    }

    public void validarTraduccion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        String validar = Validar_Idioma.getText();
        if(validar.equals("Créez des dossiers avec les endroits qui vous intéressent le plus.")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide Idioma");
        }
    }
}
