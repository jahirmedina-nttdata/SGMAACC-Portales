package org.medioAmbiente.PPB002.CAP_F_009.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/noticias-destacados")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Carmen Crespo valora solicitar que se declare como zona afectada por emergencia el área quemada por el incendio de Granada\"]")
    private WebElementFacade Enlace_Texto;

    @FindBy(xpath = "(//a[@title=\"Incendios Forestales\"])[1]")
    private WebElementFacade Enlace_Categoria;

    @FindBy(xpath = "//a[@title=\"Ver todas las novedades\"]")
    private WebElementFacade btnTodaslasNoticias;

    @FindBy(xpath = "//label[contains(text(),'Búsqueda avanzada')]")
    private WebElementFacade Busqueda_Avanzada;

    @FindBy(xpath = "(//span[@class=\"ui-selectmenu-text\"])[2]")
    private WebElementFacade Validar_Categoria;


    public void irSeccionNoticia() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");

    }

    public void clickarSobreTexto() throws InterruptedException {
        Enlace_Texto.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Carmen Crespo')])[2]")));
    }

    public void clickarCategoria() throws InterruptedException {
        getDriver().navigate().back();
        Enlace_Categoria.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Busqueda_Avanzada.click();
        String validar = Validar_Categoria.getTextContent();
        if(validar.contains("Incendios Forestales")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No es la categoria");
        }
    }


    public void clickarVerTodasLasNoticias() throws InterruptedException {
        getDriver().navigate().back();
        WebElement Element = getDriver().findElement(By.xpath("(//a[@title=\"Medio forestal\"])[2]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        btnTodaslasNoticias.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Buscador de noticias')])[2]")));
    }
}
