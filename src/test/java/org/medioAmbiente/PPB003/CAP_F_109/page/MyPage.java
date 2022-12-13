package org.medioAmbiente.PPB003.CAP_F_109.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
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

    @FindBy(xpath = "//input[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_keywords\"]")
    private WebElementFacade txtBuscar;

    @FindBy(xpath = "//a[@data-title=\"Descendente\"]")
    private WebElementFacade btnDescendente;

    @FindBy(xpath = "//td[2]/a[contains(text(),'OBSERVACIÓN Y FOTOGRAFÍA DE FAUNA')]")
    private WebElementFacade Contenido_Fauna;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_publishButton\"]")
    private WebElementFacade btnPublicar;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_imgBannId_INSTANCE_gjcrSelectButton\"]")
    private WebElementFacade btnSeleccionar;

    @FindBy(xpath = "//span[contains(text(),'Documentos y multimedia')]")
    private WebElementFacade Pestaña_DocMultimedia;

    @FindBy(xpath = "//span[@title=\"esto-es-lo-que-hacen-los-bancos-espanoles-para-proteger-el-medioambiente.jpg\"]")
    private WebElementFacade Imagen;

    @FindBy(xpath = "//button[@id=\"addButton\"]")
    private WebElementFacade btnAñadir;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_imgBannId_INSTANCE_gjcrClearButton\"]")
    private WebElementFacade btnLimpiar;

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
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Contenido Web')]")));
    }

    public void buscarContenidoWeb() throws InterruptedException {
        txtBuscar.sendKeys("FAUNA" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Contenido web')]")));
        btnDescendente.click();
    }

    public void modificarBannerDestacado() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/a[contains(text(),'OBSERVACIÓN Y FOTOGRAFÍA DE FAUNA')]")));
        Contenido_Fauna.click();
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("(//label[contains(text(),'Imagen de Actividad')])[11]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        btnSeleccionar.click();
        WebElement iframe = getDriver().findElement(By.id( "_com_liferay_journal_web_portlet_JournalPortlet_selectDocumentLibrary_iframe_"));
        getDriver().switchTo().frame(iframe);
        Pestaña_DocMultimedia.click();
        WebDriverWait waitdos = new WebDriverWait(getDriver(), 60);
        waitdos.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Ordenar por')]")));
        WebElement Elements = getDriver().findElement(By.xpath("//span[contains(text(),'DSCN9112.JPG')]"));
        JavascriptExecutor ja = (JavascriptExecutor) getDriver();
        ja.executeScript("arguments[0].scrollIntoView();", Elements);
        Imagen.click();
        getDriver().switchTo().defaultContent();
        btnAñadir.waitUntilClickable();
        btnAñadir.click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        btnPublicar.click();
        WebDriverWait waittres = new WebDriverWait(getDriver(), 90);
        waittres.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Su petición ha terminado con éxito')]")));
    }

    public void validarModificacionBannerDestacado() throws InterruptedException {

    }

    public void dejarVacioCampoBannerDestacado() throws InterruptedException {
        Contenido_Fauna.click();
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("(//label[contains(text(),'Imagen de Actividad')])[11]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        btnLimpiar.click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        btnPublicar.click();
        WebDriverWait waittres = new WebDriverWait(getDriver(), 90);
        waittres.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Su petición ha terminado con éxito')]")));
    }
}
