package org.medioAmbiente.PPB005.CAP_F_001_01.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_01.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00101 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00101 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00101 - Escribimos \"([^\"]*)\" en Nombre de Usuario$")
    public void Escribimos_En_NombreDeUsuario(String usuario) throws InterruptedException {
        myStep.escribimosUsuario(usuario);
    }

    @Y("^PPB005-CAPF00101 - Escribimos \"([^\"]*)\" en Contraseña$")
    public void Escribimos_En_Contraseña(String contraseña) throws InterruptedException {
        myStep.escribimosContraseña(contraseña);
    }

    @Entonces("^PPB005-CAPF00101 - realizamos click en el boton Acceder$")
    public void Realizamos_Click_En_El_Boton_Acceder() throws InterruptedException {
        myStep.clickAcceder();
    }


}

