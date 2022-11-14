package org.medioAmbiente.PPB003.CAP_F_053.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_053.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF053 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF053 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF053 - Comprobar visualizacion del componente$")
    public void Comprobar_Visualizacion_Del_Componente()throws InterruptedException {
        myStep.comprobarCompenente();
    }

    @Y("^PPB003-CAPF053 - Pulsar el boton Ver todo el contenido de agenda$")
    public void Pulsar_El_Boton_Ver_Todo_El_Contenido_De_Agenda()throws InterruptedException {
        myStep.pulsarBotonContenidoAgenda();
    }


}

