package org.medioAmbiente.PPB003.CAP_F_107.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//span[@title=\"Seleccionar Provincia\"]")
    private WebElementFacade SelectProvincia;

    @FindBy(xpath = "//div[contains(text(),\"CÁDIZ\")]")
    private WebElementFacade Provincia;

    @FindBy(xpath = "//li[@class=\"page_number pag_num_5\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//button[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]/span")
    private WebElementFacade btnBuscar;

    public void buscarEspacioNatural() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(SelectProvincia).click().perform();
        actions.moveToElement(Provincia).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
    }

    public void Visualizar_Paginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"Resultados\")]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        waitFor(1).second();
    }

    public void seleccionarPaginador() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Paginador).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
    }
}
