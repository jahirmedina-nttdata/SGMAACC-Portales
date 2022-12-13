package org.medioAmbiente.PPB003.CAP_F_094.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_com_liferay_journal_web_portlet_JournalPortlet\"]")
    private WebElementFacade Contenido_Web;

    @FindBy(xpath = "//a[contains(text(),'Contenido')][@href=\"#panel-manage-site_administration_content\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//td/a[contains(text(),'Avisos')]")
    private WebElementFacade Carpeta_Avisos;

    @FindBy(xpath = "//input[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_keywords\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//td/a[contains(text(),'CIERRE TEMPORAL DEL SENDERO LA CUEVA DEL GATO')]")
    private WebElementFacade Avisos;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_publishButton\"]")
    private WebElementFacade btnPublicar;

    @FindBy(xpath = "//textarea[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_description\"]")
    private WebElementFacade Resumen;

    @FindBy(xpath = "//textarea[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_descripcion_INSTANCE_gebp\"]")
    private WebElementFacade Descripcion;

    @FindBy(xpath = "//tr[1]/td[3]")
    private WebElementFacade Campo_Descripcion;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void accederContenidoWeb() throws InterruptedException {
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Contenido.waitUntilClickable();
            Contenido.click();
            Contenido_Web.click();
        } else {
            Menu_Vertical.click();
            Contenido.waitUntilClickable();
            Contenido.click();
            Contenido_Web.click();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Contenido Web')]")));
    }

    public void accederCarpetaAvisos() throws InterruptedException {
        Carpeta_Avisos.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Avisos')]")));
    }

    public void copiarResumenADescripcion() throws InterruptedException {
        Texto_Buscar.sendKeys("gato"+"\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/a[contains(text(),'CIERRE TEMPORAL DEL SENDERO LA CUEVA DEL GATO')]")));
        Avisos.click();
        btnPublicar.waitUntilClickable();
        Descripcion.sendKeys(Resumen.getText());
        Resumen.clear();
    }

    public void clickarPublicar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        btnPublicar.click();
    }

    public void validarCambio() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/a[contains(text(),'CIERRE TEMPORAL DEL SENDERO LA CUEVA DEL GATO')]")));
        if(Campo_Descripcion.getText().length()==0){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail("Si hay Texto");
        }
        waitFor(2).second();
    }

    public void copiarDescripcionAResumen() throws InterruptedException {
        Avisos.click();
        btnPublicar.waitUntilClickable();
        Resumen.sendKeys(Descripcion.getText());
        Descripcion.clear();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        btnPublicar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/a[contains(text(),'CIERRE TEMPORAL DEL SENDERO LA CUEVA DEL GATO')]")));
        if(Campo_Descripcion.getText().length()==0){
            Assert.fail("Si hay Texto");
        }
        else{
            Assert.assertTrue(true);
        }
    }
}
