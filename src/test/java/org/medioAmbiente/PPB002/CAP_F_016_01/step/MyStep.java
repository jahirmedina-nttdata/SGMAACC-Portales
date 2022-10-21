package org.medioAmbiente.PPB002.CAP_F_016_01.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_016_01.page.MyPage;

import java.awt.*;


public class MyStep extends ScenarioSteps {

    private MyPage page;


    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws AWTException{
        page.cargarpagina();
    }


    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        page.aceptarCookies();
    }


    @net.thucydides.core.annotations.Step
    public void visualizarTiempo() throws InterruptedException {
        page.visualizarTiempo();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException {
        page.clickarEnlace();
    }
}