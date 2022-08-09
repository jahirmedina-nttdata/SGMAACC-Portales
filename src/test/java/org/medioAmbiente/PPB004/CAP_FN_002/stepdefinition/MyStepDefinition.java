package org.medioAmbiente.PPB004.CAP_FN_002.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPFN002 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPFN002 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFN002 - Escribo \"([^\"]*)\" en el cuadro de texto Nombre de Usuario$")
    public void Escribo_En_El_Cuadro_De_Texto_NombreDeUsuario(String usuario) throws InterruptedException {
        myStep.escriboUsuario(usuario);
    }

    @Y("^PPB004-CAPFN002 - Escribo \"([^\"]*)\" en el cuadro de texto Contraseña$")
    public void Escribo_En_El_Cuadro_De_Texto_Contraseña(String contraseña) throws InterruptedException {
        myStep.escriboContraseña(contraseña);
    }

    @Entonces("^PPB004-CAPFN002 - Validamos el usuario$")
    public void Validamos_El_Usuario() throws InterruptedException{

    }


}

