package org.medioAmbiente.PPB003.CAP_F_035.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_035.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF035 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF035 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF035 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF035 - Ejecuta CAPF003$")
    public void Ejecuta_CAPF003()throws InterruptedException, URISyntaxException {
        myStep.EjecutaCAPF003();
    }

    @Y("^PPB003-CAPF035 - Obtener codigo RENPA$")
    public void Obtener_Codigo_RENPA()throws InterruptedException {
    }

    @Y("^PPB003-CAPF035 - Consulta codigo RENPA$")
    public void Consulta_Codigo_RENPA()throws InterruptedException {
    }
}

