package org.medioAmbiente.PPB002.CAP_F_014.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_014.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF014 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF014 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF014 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("PPB002-CAPF014 - Clickar titulo$")
    public void Clickar_Titulo() throws InterruptedException{

    }

    @Y("PPB002-CAPF014 - Clickar mas$")
    public void Clickar_Mas() throws InterruptedException{
    }
}

