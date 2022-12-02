package org.medioAmbiente.PPB001.CAP_F_112.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_112.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF112 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF112 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF112 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF112 - Clickar boton lupa$")
    public void Clickar_Boton_Lupa()throws InterruptedException {
        myStep.clickarLupa();
    }

    @Y("^PPB001-CAPF112 - Escribir Admin CMAOT en el cuadro de texto nombre de usuario$")
    public void Escribir_Admin_CMAOT_En_El_Cuadro_De_Texto_Nombre_De_Usuario()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB001-CAPF112 - Clickar boton Buscar$")
    public void Clickar_Boton_Buscar()throws InterruptedException {
        myStep.clickarBuscar();
    }
    @Entonces("^PPB001-CAPF112 - Validar Busqueda$")
    public void Validar_Busqueda()throws InterruptedException {
        myStep.validarBusqueda();
    }
}

