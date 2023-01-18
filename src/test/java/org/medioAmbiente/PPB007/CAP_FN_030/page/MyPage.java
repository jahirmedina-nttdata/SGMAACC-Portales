package org.medioAmbiente.PPB007.CAP_FN_030.page;


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

@DefaultUrl("/medioambiente/portal/web/cae/tablon-de-anuncios")


public class MyPage extends PageObject {

    @FindBy(xpath = "//li[@class=\"page_number pag_num_2\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "(//a[contains(text(),\">\")])[1]")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "(//a[contains(text(),\"<\")])[2]")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//a[contains(text(),\"<<\")]")
    private WebElementFacade Primera_Pagina;

    @FindBy(xpath = "//a[contains(text(),\">>\")]")
    private WebElementFacade Ultima_Pagina;


    public void visualizarPaginador() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 750)");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarPaginador() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Paginador).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));

    }

    public void clickarSiguiente() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Siguiente).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarUltimaPagina() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ultima_Pagina).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarAnterior() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Anterior).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarPrimeraPagina() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Primera_Pagina).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }
}
