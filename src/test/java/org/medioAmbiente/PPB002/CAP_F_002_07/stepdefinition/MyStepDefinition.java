package org.medioAmbiente.PPB002.CAP_F_002_07.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_07.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00207 - Accedemos el Portal Web LU$")
    public void Accedemos_El_Portal_WebLU() throws InterruptedException {
    myStep.accedemosalPortal();

    }

    @Y("^PPB002-CAPF00207 - Aceptar las cookies02$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00207 - Clickar en lo ultimo$")
    public void Clickar_En_LoUltimo() throws InterruptedException {
        myStep.clickarLoUltimo();
    }


    @Y("^PPB002-CAPF00207 - Clickar en Plan Forestal Andaluz$")
    public void Clickar_En_Plan_Forestal_Andaluz() throws InterruptedException {
        myStep.clickarPlanForestal();
    }

    @Y("^PPB002-CAPF00207 - Clickar en Inicio LU$")
    public void Clickar_En_InicioLU() throws InterruptedException {
        myStep.clickarInicioLU();

    }

    @Y("^PPB002-CAPF00207 - Clickar en Ver Mas$")
    public void Clickar_En_VerMas() throws InterruptedException {
        myStep.clickarVerMas();
    }
}

