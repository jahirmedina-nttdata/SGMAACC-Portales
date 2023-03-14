package org.medioAmbiente.PPB002.CAP_F_127.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_127.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB002-CAPF127 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB002-CAPF127 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF127 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB002-CAPF127 - Seleccionar contenido$")
    public void Seleccionar_Contenido()throws InterruptedException {
        myStep.seleccionarContenido();
    }

    @Y("^PPB002-CAPF127 - Retroceder pagina$")
    public void Retroceder_Pagina()throws InterruptedException {
        myStep.retrocederPagina();
    }
}

