package org.medioAmbiente.PPB002.CAP_F_099.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_099.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF099 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF099 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF099 - Posicionar sobre el menu Actualidad")
    public void Posicionar_Sobre_El_Menu_Actualidad() throws InterruptedException {
        myStep.posicionarSobreMenu();
    }
    @Y("^PPB002-CAPF099 - Pulsar sobre el submenu Agenda y Eventos")
    public void Pulsar_Sobre_El_Submenu_Agenda_Y_Eventos() throws InterruptedException {
        myStep.pulsarSubmenu();
    }

    @Entonces("^PPB002-CAPF099 - Validar navegacion correcta")
    public void Validar_Navegacion_Correcta() throws InterruptedException {
        myStep.validarNavegacion();
    }
}

