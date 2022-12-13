package org.medioAmbiente.PPB001.CAP_F_115.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_115.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF115 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF115 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF115 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF115 - Clickar boton lupa$")
    public void Clickar_Boton_Lupa()throws InterruptedException {
        myStep.clickarLupa();
    }

    @Y("^PPB001-CAPF115 - Seleccionar opcion CUALQUIERA del listado Correspondencia$")
    public void Seleccionar_Opcion_CUALQUIERA_Del_Listado_Correspondencia()throws InterruptedException {
        myStep.seleccionarCorrespondenciaCualquiera();
    }

    @Y("^PPB001-CAPF115 - Escribir Admin CMAOT en el cuadro de texto usuario creador$")
    public void Escribir_Admin_CMAOT_En_El_Cuadro_De_Texto_Usuario_Creador()throws InterruptedException {
        myStep.buscarPorUsuarioCreador();
    }

    @Y("^PPB001-CAPF115 - Seleccionar Estado Borrador$")
    public void Seleccionar_Estado_Borrador()throws InterruptedException {
        myStep.seleccionarEstadoBorrador();
    }

    @Y("^PPB001-CAPF115 - Clickar boton Buscar$")
    public void Clickar_Boton_Buscar()throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB001-CAPF115 - Validar Busqueda$")
    public void Validar_Busqueda()throws InterruptedException {
        myStep.validarBusqueda();
    }
}

