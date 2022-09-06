package org.medioAmbiente.PPB002.CAP_F_016_01.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/el-tiempo")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_cmaotAemetModule_INSTANCE_a9pE4goNitHU_complete-view\"]//a")
    private WebElementFacade Enlace;


    public void cargarPagina()throws AWTException {
        open();

        waitFor(5).second();
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
    }

    public void visualizarTiempo() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void clickarEnlace()throws InterruptedException {
        Enlace.click();
    }



}
