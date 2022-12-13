package org.medioAmbiente.PPB001.CAP_F_116.page;


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

    @FindBy(xpath = "//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_previewContenidoWeb\"]")
    private WebElementFacade Contenido_Web;

    @FindBy(xpath = "//a[contains(text(),'Contenido')][@href=\"#panel-manage-site_administration_content\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/ul/li[7]/a")
    private WebElementFacade Siguiente_Pag;

    @FindBy(xpath = "//a[contains(text(),'9')]")
    private WebElementFacade Ultima_Pag;

    @FindBy(xpath = "//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/ul/li[2]/a")
    private WebElementFacade Primera_Pag;

    @FindBy(xpath = "//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/ul/li[1]/a")
    private WebElementFacade Anterior_Pag;

    @FindBy(xpath = "//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/ul/li[4]/a")
    private WebElementFacade Pagina_3;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void clickarSiguientePaginador() throws InterruptedException {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Preview Contenidos Web')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Siguiente_Pag.click();
    }

    public void clickarSiguientePaginadorEnUltimaPagina() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Ultima_Pag.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Siguiente_Pag.click();
    }

    public void clickarAnteriorPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Anterior_Pag.click();
    }

    public void clickarAnteriorPaginadorEnPrimeraPagina() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Primera_Pag.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Anterior_Pag.click();
    }

    public void clickarCualquierPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Pagina_3.click();
    }

    public void clickarMismoPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        Pagina_3.click();
    }
}
