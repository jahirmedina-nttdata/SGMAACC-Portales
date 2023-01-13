package org.medioAmbiente.PPB005.CAP_F_001_07.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/portal-conocimiento/reglas-generales")


public class MyPage extends PageObject {

    @FindBy(xpath = "//h2[@class=\"tituloNoticia\"]")
    private WebElementFacade Titulo;

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")
    private WebElementFacade txtcontraseña;

    @FindBy(xpath = "//button[@id=\"ignoreUserLocaleOptions\"]")
    private WebElementFacade btncerrar;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[contains(text(),\"Navegación\")]")
    private WebElementFacade Navegacion;

    @FindBy(xpath = "(//span[@class=\"tree-hitarea icon-plus\"])[3]")
    private WebElementFacade IconoMas;

    @FindBy(xpath = "//a[@title=\"Libro Blanco\"]")
    private WebElementFacade SubMenu_LibroBlanco;

    @FindBy(xpath = "//h2[@class=\"tituloNoticia\"]")
    private WebElementFacade Validar_Navegacion;


    public void comprobarInformacion() throws InterruptedException, URISyntaxException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        String validacion = Titulo.getText();
        if(validacion.equals("Libro Blanco de Desarrollo")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion no valida");
        }

        List<WebElement> descripcion = getDriver().findElements(By.xpath("//div[@class=\"evr-detalle__txt\"]"));
        List<WebElement> imagen = getDriver().findElements(By.xpath("//img[@src=\"/medioambiente/portal/documents/13391456/0/libro-blanco_grande.jpg/0e33d1b9-be54-246e-cccb-de457f651b6a?t=1628062477639\"]"));
        if (descripcion.size() != 0 && imagen.size() !=0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }

}
