package org.medioAmbiente.PPB002.CAP_F_012.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_012.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF012 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF012 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF012 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("PPB002-CAPF012 - Ubicarse en la seccion Proximos Eventos$")
    public void Ubicarse_En_La_Seccion_Proximos_Eventos() throws InterruptedException{
        myStep.ubicarseProximosEventos();
    }

    @Y("PPB002-CAPF012 - Clickar titulo$")
    public void Clickar_Titulo() throws InterruptedException{
        myStep.clickarTitulo();
    }

    @Y("PPB002-CAPF012 - Clickar en el icono mas$")
    public void Clickar_En_El_Icono_Mas() throws InterruptedException{
        myStep.clickarIconoMas();
    }
}
