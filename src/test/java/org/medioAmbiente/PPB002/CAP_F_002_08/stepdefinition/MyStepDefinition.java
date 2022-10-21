package org.medioAmbiente.PPB002.CAP_F_002_08.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_08.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00208 - Accedemos el Portal Web MV$")
    public void Accedemos_El_Portal_WebMV() throws InterruptedException{
        myStep.accedemosalPortal();
    }

    @Y("^PPB002-CAPF00208 - Aceptar las cookies03$")
    public void Aceptar_Las_Cookies03()throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00208 - Clickar en lo Mas Valorado$")
    public void Clickar_En_Lo_MasValorado() throws InterruptedException {
        myStep.clickarMasValorado();
    }

    @Y("^PPB002-CAPF00208 - Clickar en Gestores de los Residuos$")
    public void Clickar_En_Gestores_De_Los_Residuos() throws InterruptedException{
        myStep.clickarGestoresResiduos();
    }

}

