package org.medioAmbiente.PPB002.CAP_F_002_02.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_02.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00202 - Cargando el Navegador$")
    public void Cargando_ElNavegador() throws InterruptedException{
        myStep.cargandoPortal();
    }

    @Cuando("^PPB002-CAPF00202 - Aceptar las cookies0$")
    public void Aceptar_Las_Cookies0() throws InterruptedException{
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00202 - Ubicarnos en el carrusel")
    public void Ubicarnos_En_El_Carrusel() throws InterruptedException {
        myStep.ubicarCarrusel();
    }
}

