package org.medioAmbiente.PPB003.CAP_F_102.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_102.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF102 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF102 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF102 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF102 - Acceder al submenu Avisos$")
    public void Acceder_Al_Submenu_Avisos()throws InterruptedException {
        myStep.accederSubmenuAvisos();
    }

    @Y("^PPB003-CAPF102 - Seleccionar paginador$")
    public void Seleccionar_Paginador()throws InterruptedException {
        myStep.seleccionarPaginador();
    }
}

