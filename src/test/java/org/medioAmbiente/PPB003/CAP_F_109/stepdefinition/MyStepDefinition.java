package org.medioAmbiente.PPB003.CAP_F_109.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_109.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF109 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF109 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF109 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF109 - Acceder al menu vertical contenido Web$")
    public void Acceder_Al_Menu_Vertical_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB003-CAPF109 - Modificar campo Observacion y Fotografia de fauna$")
    public void Modificar_Campo_Observacion_Y_Fotografia_De_Fauna()throws InterruptedException {
    }

    @Y("^PPB003-CAPF109 - Dejar campo vacio$")
    public void Dejar_Campo_Vacio()throws InterruptedException {
    }
}

