package org.medioAmbiente.PPB002.CAP_F_020.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_020.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF020 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF020 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF020 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF020 - Clickar detalle de contenido$")
    public void Clickar_Detalle_De_Contenido() throws InterruptedException{
        myStep.clickarDetalleContenido();
    }

    @Y("^PPB002-CAPF020 - Clickar todos los eventos$")
    public void Clickar_Todos_Los_Eventos() throws InterruptedException{
        myStep.clickarBotonTodosLosEventos();
    }

}

