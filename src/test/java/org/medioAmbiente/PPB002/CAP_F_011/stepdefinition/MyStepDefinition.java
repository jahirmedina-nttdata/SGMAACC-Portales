package org.medioAmbiente.PPB002.CAP_F_011.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_011.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF011 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF011 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF011 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("PPB002-CAPF011 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException{
        myStep.buscarPorTexto();
    }

    @Y("PPB002-CAPF011 - Buscar por Provincia$")
    public void Buscar_Por_Provincia() throws InterruptedException{
    }

    @Y("PPB002-CAPF011 - Buscar por fecha desde$")
    public void Buscar_Por_Fecha_Desde() throws InterruptedException{
    }

    @Y("PPB002-CAPF011 - Buscar por fecha hasta$")
    public void Buscar_Por_Fecha_Hasta() throws InterruptedException{
    }

    @Y("PPB002-CAPF011 - Buscar por todos los campos$")
    public void Buscar_Por_Todos_Los_Campos() throws InterruptedException{
    }
}

