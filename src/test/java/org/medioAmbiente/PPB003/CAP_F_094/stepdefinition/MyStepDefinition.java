package org.medioAmbiente.PPB003.CAP_F_094.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_094.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF094 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF094 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF094 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF094 - Acceder a contenido Avisos$")
    public void Acceder_A_Contenido_Avisos()throws InterruptedException {
        myStep.accederAvisos();
    }

    @Y("^PPB003-CAPF094 - Copiar contenido$")
    public void Copiar_Contenido()throws InterruptedException {
    }

    @Y("^PPB003-CAPF094 - Pegar contenido$")
    public void Pegar_Contenido()throws InterruptedException {
    }
}

