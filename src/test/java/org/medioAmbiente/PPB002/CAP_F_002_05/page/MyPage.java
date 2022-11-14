package org.medioAmbiente.PPB002.CAP_F_002_05.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Portal de la Caza y la Pesca Continental')]")
    private WebElementFacade Portal_CazaPesca;

    @FindBy(xpath = "//span[contains(text(),'Portal Andaluz del Cambio Climático')]")
    private WebElementFacade Portal_Andaluz;

    @FindBy(xpath = "//span[contains(text(),'Ventana del visitante')]")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//span[contains(text(),'Canal de Administración Electrónica')]")
    private WebElementFacade Canal_Electronico;

    public void clickarPortalCazaPesca()throws InterruptedException {

        Portal_CazaPesca.click();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Bienvenidos al portal de la Caza y la Pesca Continental de Andalucía')]")));
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void clickarPortalAndaluz()throws InterruptedException {

        Portal_Andaluz.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Bienvenidos al portal andaluz de Cambio Climático')]")));
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void clickarVentanaVisitante()throws InterruptedException {

        Ventana_Visitante.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Ir a Ventana del Visitante\"])[1]/img")));
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void clickarCanalAdministrativoElectronica()throws InterruptedException {

        Canal_Electronico.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

}
