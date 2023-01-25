package org.medioAmbiente.PPB002.CAP_F_093.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_093.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF093 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF093 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF093 - Posicionar sobre el menu Areas Tematicas")
    public void Posicionar_Sobre_El_Menu_Areas_Tematicas() throws InterruptedException {
        myStep.posicionarAreasTematicas();
    }
    @Y("^PPB002-CAPF093 - Pulsar sobre el submenu Atmosfera")
    public void Pulsar_Sobre_El_Submenu_Atmosfera() throws InterruptedException {
        myStep.pulsarSubmenuAtmosfera();
    }

    @Y("^PPB002-CAPF093 - Pulsar sobre el componente La calidad del aire")
    public void Pulsar_Sobre_El_Componente_La_Calidad_Del_Aire() throws InterruptedException {
        myStep.pulsarCalidadDelAire();
    }

    @Entonces("^PPB002-CAPF093 - Validar acceso al componente")
    public void Validar_Acceso_Al_Componente() throws InterruptedException {
        myStep.validarAcceso();
    }

}

