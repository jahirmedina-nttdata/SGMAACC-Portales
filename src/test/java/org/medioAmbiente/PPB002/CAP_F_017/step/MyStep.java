package org.medioAmbiente.PPB002.CAP_F_017.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_017.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;


public class MyStep extends ScenarioSteps {

    private MyPage page;


    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException{
        page.cargarPagina();
    }

    @net.thucydides.core.annotations.Step
    public void clickpermitir() throws AWTException {
        page.clickpermitir();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        page.aceptarCookies();
    }


    @net.thucydides.core.annotations.Step
    public void clickNopermitir() throws AWTException {
        page.clickNopermitir();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarProvin() throws InterruptedException {
        page.seleccionarProvin();
    }
}