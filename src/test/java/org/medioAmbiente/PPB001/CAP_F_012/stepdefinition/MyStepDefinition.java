package org.medioAmbiente.PPB001.CAP_F_012.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_012.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB001-CAPF012 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF012 - Acepto Cookies")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF012 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPorTexto();
    }
    @Y("^PPB001-CAPF012 - Acceder al detalle contenido$")
    public void Acceder_Al_Detalle_Contenido() throws InterruptedException {
        myStep.accederContenido();
    }

    @Y("^PPB001-CAPF012 - Buscar por fecha inicio y fecha fin$")
    public void Buscar_Por_Fecha_Inicio_Y_Fecha_Fin() throws InterruptedException {
        myStep.buscarPorFecha();
    }

    @Y("^PPB001-CAPF012 - Buscar por tema$")
    public void Buscar_Por_Tema() throws InterruptedException {
        myStep.buscarPorTema();
    }

}

