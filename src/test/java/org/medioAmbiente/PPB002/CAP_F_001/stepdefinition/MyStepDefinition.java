package org.medioAmbiente.PPB002.CAP_F_001.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_001.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB002-CAPF001 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB002-CAPF001 - acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF001 - escribimos \"([^\"]*)\" en el cuadro de texto Nombre de Usuario$")
    public void Escribimos_En_El_Cuadro_De_Texto_NombreDeUsuario(String usuario) throws InterruptedException {
        myStep.escribimosUsuario(usuario);
    }

    @Y("^PPB002-CAPF001 - escribimos \"([^\"]*)\" en el cuadro de texto Contraseña$")
    public void Escribimos_En_El_Cuadro_De_Texto_Contraseña(String contraseña) throws InterruptedException {
        myStep.escribimosContraseña(contraseña);
    }

    @Entonces("^PPB002-CAPF001 - realizamos click en el boton Acceder$")
    public void Realizamos_Click_En_El_Boton_Acceder() throws InterruptedException {
        myStep.clickAcceder();
    }


}

