package org.medioAmbiente.PPB007.CAP_F_004.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_004.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF004 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF004 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF004 - Visualizar CAPF038 Componentes Basicos$")
    public void Visualizar_CAPF038_Componentes_Basicos() throws InterruptedException{
        myStep.visualizarCAPF038();
    }

    @Y("^PPB007-CAPF004 - Visualizar CAPF039 Componentes Destacados$")
    public void Visualizar_CAPF039_Componentes_Destacados() throws InterruptedException{
        myStep.visualizarCAPF039();
    }
}

