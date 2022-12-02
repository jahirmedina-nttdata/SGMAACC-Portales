package org.medioAmbiente.PPB001.CAP_F_111.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_111.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF111 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF111 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF111 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF111 - Escribir AVES en el cuadro de texto$")
    public void Escribir_AVES_En_El_Cuadro_De_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB001-CAPF111 - Clickar boton Buscar$")
    public void Clickar_Boton_Buscar()throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB001-CAPF111 - Validar Busqueda$")
    public void Validar_Busqueda()throws InterruptedException {
        myStep.validarBusqueda();
    }
}

