package org.medioAmbiente.PPB002.CAP_F_002_08.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"tab-3\"]/span")
    private WebElementFacade btnmasvalorado;

    @FindBy(xpath = "//*[@id=\"card-cladt13-distributivaMasValorado0\"]/a/p")
    private WebElementFacade btngestorresiduo;


    public void clickarMasValorado() throws InterruptedException{
        btnmasvalorado.click();
    }

    public void clickarGestoresResiduos() throws InterruptedException{
        btngestorresiduo.click();
    }

}
