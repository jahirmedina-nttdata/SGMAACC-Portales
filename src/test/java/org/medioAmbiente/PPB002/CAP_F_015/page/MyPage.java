package org.medioAmbiente.PPB002.CAP_F_015.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"ui-id-5\"]")
    private WebElementFacade provincia;

    @FindBy(xpath = "//*[@id=\"_cmaotAemetModule_INSTANCE_A3m3T_provincia-button\"]/span[2]")
    private WebElementFacade Listprovincia;

    public void cargarPagina()throws AWTException {
        open();
        waitFor(7).second();
        Robot robot = new  Robot();
        try {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        waitFor(5).second();
    }

    public void clickNopermitir() throws AWTException {
         getDriver().close();
         open();
        waitFor(7).second();
        Robot robot = new  Robot();
        try {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void seleccionarProvin()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        Listprovincia.click();
        provincia.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'°C')]")));

    }



}
