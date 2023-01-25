package org.medioAmbiente.PPB002.CAP_F_015.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_015.page.MyPage;

import java.awt.*;


public class MyStep extends ScenarioSteps {

    private MyPage page;


    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws AWTException{
        page.cargarPagina();
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