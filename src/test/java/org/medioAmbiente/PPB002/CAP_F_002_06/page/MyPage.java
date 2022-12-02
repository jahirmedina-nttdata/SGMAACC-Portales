package org.medioAmbiente.PPB002.CAP_F_002_06.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;


    @FindBy(xpath = "//*[@id=\"tab-2\"]/span")
    private WebElementFacade btnmasbuscado;


    public void ubicarContenidoDestacado() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//div[@class=\"slick-list draggable\"])[4]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public void clickarMasBuscado() throws InterruptedException {
        btnmasbuscado.click();
    }

}
