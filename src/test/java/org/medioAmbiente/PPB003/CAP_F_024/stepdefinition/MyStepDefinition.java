package org.medioAmbiente.PPB003.CAP_F_024.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_024.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF024 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF024 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF024 - Clickar pestaña Publicaciones$")
    public void Clickar_Pestaña_Publicaciones()throws InterruptedException {
        myStep.clickarPublicaciones();
    }
    @Y("^PPB003-CAPF024 - Clickar Cuidado con las garrapatas$")
    public void Clickar_Cuidado_Con_Las_Garrapatas()throws InterruptedException {
        myStep.clickarBuenasPracticas();
    }
}

