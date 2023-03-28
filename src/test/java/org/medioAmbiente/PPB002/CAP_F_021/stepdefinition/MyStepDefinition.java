package org.medioAmbiente.PPB002.CAP_F_021.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_021.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF021 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF021 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF021 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF021 - Visualizar Contenido$")
    public void Visualizar_Contenido() throws InterruptedException{
        myStep.visualizarContenido();
    }
}
