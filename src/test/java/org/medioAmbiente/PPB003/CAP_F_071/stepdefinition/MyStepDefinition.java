package org.medioAmbiente.PPB003.CAP_F_071.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_071.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF071 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF071 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF071 - Clickar icono$")
    public void Clickar_Icono()throws InterruptedException {
        myStep.clickarIcono();
    }

    @Y("^PPB003-CAPF071 - Acceder usuario$")
    public void Acceder_Usuario()throws InterruptedException {
        myStep.accederUsuario();
    }

    @Y("^PPB003-CAPF071 - Acceder usuario invalido$")
    public void Acceder_Usuario_Invalido()throws InterruptedException {
        myStep.accederUserInvalido();
    }

    @Y("^PPB003-CAPF071 - Clickar He olvidado mi contraseña$")
    public void Clickar_He_Olvidado_Mi_Contraseña()throws InterruptedException {
        myStep.clickarOlvideContraseña();
    }

    @Y("^PPB003-CAPF071 - Rellenar formulario recuperacion de contraseña$")
    public void Rellenar_Formulario_Recuperacion_De_Contraseña()throws InterruptedException {
        myStep.rellenarFormulario();
    }

    @Y("^PPB003-CAPF071 - Clickar Acceder$")
    public void Clickar_Acceder()throws InterruptedException {
        myStep.clickarAcceder();
    }
}

