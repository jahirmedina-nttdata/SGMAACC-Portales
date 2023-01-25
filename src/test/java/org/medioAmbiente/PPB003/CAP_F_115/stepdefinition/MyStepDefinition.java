package org.medioAmbiente.PPB003.CAP_F_115.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_115.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF115 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF115 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF115 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB003-CAPF115 - Seleccionar material divulgativo$")
    public void Seleccionar_Material_Divulgativo()throws InterruptedException {
        myStep.seleccionarMaterialDivulgativos();
    }

    @Y("^PPB003-CAPF115 - Retroceder pagina$")
    public void Retroceder_Pagina()throws InterruptedException {
        myStep.retrocederPagina();
    }
}

