package org.medioAmbiente.PPB001.CAP_F_116.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_116.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF116 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF116 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF116 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF116 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB001-CAPF116 - Clickar siguiente$")
    public void Clickar_Siguiente()throws InterruptedException {
    }

    @Y("^PPB001-CAPF116 - Clickar siguiente en la ultima pagina$")
    public void Clickar_Siguiente_En_La_Ultima_Pagina()throws InterruptedException {
    }

    @Y("^PPB001-CAPF116 - Clickar anterior$")
    public void Clickar_Anterior()throws InterruptedException {
    }

    @Y("^PPB001-CAPF116 - Clickar anterior en la primera pagina$")
    public void Clickar_Anterior_En_La_Primera_Pagina()throws InterruptedException {
    }

    @Y("^PPB001-CAPF116 - Avanzar una pagina$")
    public void Avanzar_Una_Pagina()throws InterruptedException {
    }

    @Y("^PPB001-CAPF116 - Clickar mismo paginador$")
    public void Clickar_Mismo_Paginador()throws InterruptedException {
    }
}

