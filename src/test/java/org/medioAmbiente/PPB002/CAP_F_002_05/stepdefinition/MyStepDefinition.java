package org.medioAmbiente.PPB002.CAP_F_002_05.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_05.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00205 - Accedemos el Portal Web DA$")
    public void Accedemos_El_Portal_Web_DA() throws InterruptedException{
        myStep.cargandoNavegador();
    }

    @Cuando("^PPB002-CAPF00205 - Aceptamos las cookies$")
    public void Aceptamos_Cookies() throws InterruptedException{
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00205 - Ubicar Directo A$")
    public void Ubicar_Directo_A() throws InterruptedException{
        myStep.ubicarDirectoA();
    }

    @Y("^PPB002-CAPF00205 - Clickar en Portal de la Caza y la Pesca Continental$")
    public void Clickar_En_Portal_De_La_Caza_Y_La_Pesca_Continental() throws InterruptedException{
        myStep.clickarPortalCazaPesca();
    }

    @Y("^PPB002-CAPF00205 - Clickar en Portal Andaluz del Cambio Climático$")
    public void Clickar_En_Portal_Andaluz_Del_Cambio_Climático() throws InterruptedException{
        myStep.clickarPortalAndaluz();
    }

    @Y("^PPB002-CAPF00205 - Clickar en Ventana del Visitante$")
    public void Clickar_En_Ventana_Del_Visitante() throws InterruptedException{
        myStep.clickarVentanaVisitante();
    }

    @Y("^PPB002-CAPF00205 - Clickar en Canal de Administración Electrónica$")
    public void Clickar_En_Canal_De_Administración_Electrónica() throws InterruptedException{
        myStep.clickarCanalAdministrativoElectronica();
    }

}

