package org.medioAmbiente.PPB003.CAP_F_104.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_104.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF104 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF104 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF104 - Autenticar usuario$")
    public void Autenticar_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF104 - Ejecutar CAPF103$")
    public void Ejecutar_CAPF103()throws InterruptedException {
        myStep.ejecutarCAPF103();
    }

    @Y("^PPB003-CAPF104 - Seleccionar paginador$")
    public void Seleccionar_Paginador()throws InterruptedException {
        myStep.seleccionarPaginador();
    }
}

