package org.medioAmbiente.PPB001.CAP_F_115.stepdefinition;

import io.cucumber.java.es.Dado;
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
    }

    @Y("^PPB001-CAPF115 - Escribir Admin CMAOT en el cuadro de texto usuario creador$")
    public void Escribir_Admin_CMAOT_En_El_Cuadro_De_Texto_Usuario_Creador()throws InterruptedException {
    }

    @Y("^PPB001-CAPF115 - Escribir Borrador en el cuadro de texto estado$")
    public void Escribir_Borrador_En_El_Cuadro_De_Texto_Estado()throws InterruptedException {
    }

    @Y("^PPB001-CAPF115 - Clickar search$")
    public void Clickar_Search()throws InterruptedException {

    }
}

