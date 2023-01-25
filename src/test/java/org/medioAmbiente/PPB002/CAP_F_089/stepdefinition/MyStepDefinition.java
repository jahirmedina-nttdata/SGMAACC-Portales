package org.medioAmbiente.PPB002.CAP_F_089.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_089.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF089 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF089 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF089 - Pulsa sobre imagen Junta de Andalucia")
    public void Pulsa_Sobre_Imagen_Junta_De_Andalucia() throws InterruptedException {
        myStep.pulsarJuntaAndalucia();
    }
    @Y("^PPB002-CAPF089 - Pulsa sobre imagen Portal Ambiental de Andalucía")
    public void Pulsa_Sobre_Imagen_Portal_Ambiental_De_Andalucía() throws InterruptedException {
        myStep.pulsarPortalAmbientalAndalucia();
    }

    @Y("^PPB002-CAPF089 - Posiciona el puntero sobre logo Junta de Andalucia")
    public void Posiciona_El_Puntero_Sobre_Logo_Junta_De_Andalucia() throws InterruptedException {
        myStep.posicionarPunteroLogoJuntaAndalucia();
    }
}

