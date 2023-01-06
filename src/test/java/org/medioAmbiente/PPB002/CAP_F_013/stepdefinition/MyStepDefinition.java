package org.medioAmbiente.PPB002.CAP_F_013.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF013 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF013 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF013 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("PPB002-CAPF013 - Selecciono mes posterior$")
    public void Selecciono_Mes_Posterior() throws InterruptedException{
        myStep.seleccionarMesPosterior();
    }

    @Y("PPB002-CAPF013 - Selecciono año posterior$")
    public void Selecciono_Año_Posterior() throws InterruptedException{
        myStep.seleccionarAñoPosterior();
    }

    @Y("PPB002-CAPF013 - Clickar sobre un dia$")
    public void Clickar_Sobre_Un_Dia() throws InterruptedException{
        myStep.clickarSobreDia();
    }

}

