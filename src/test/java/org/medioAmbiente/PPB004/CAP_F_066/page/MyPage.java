package org.medioAmbiente.PPB004.CAP_F_066.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/indice/-/asset_publisher/JP4Z3AqUBBz1/content/guarda-de-coto-de-caza/20151")



public class MyPage extends PageObject {


    @FindBy(xpath = "//a[contains(text(),\"Funciones de los guardas\")]")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//a[contains(text(),\"Normativa relacionada\")]")
    private WebElementFacade Apartado_Descarga;

    @FindBy(xpath = "//a[contains(text(),\"Ley 8/2003, de 28 de octubre, de la flora y la fauna silvestres\")]")
    private WebElementFacade Descarga;

    @FindBy(xpath = "//a[contains(text(),\"Obtención de la cualificación de guarda de coto de caza\")]")
    private WebElementFacade Apartado_Enlace;

    @FindBy(xpath = "//a[contains(text(),\"Consulta de entidades homologadas para impartir cursos de formación de guarda de coto de caza\")]")
    private WebElementFacade Enlace;

    private String prntw;
    private String popwnd;

    public void mostrarApartado()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Apartado).click().perform();
        waitFor(1).second();

    }

    public void ocultarApartado() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Apartado).click().perform();
    }

    public void descargarArchivo() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Apartado_Descarga).click().perform();
        action.moveToElement(Descarga).click().perform();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        waitFor(3).second();
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
        action.moveToElement(Apartado_Descarga).click().perform();
    }

    public void clickarEnlace() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Apartado_Enlace).click().perform();
        action.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
    }
}
