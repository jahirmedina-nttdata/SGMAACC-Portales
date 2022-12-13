package org.medioAmbiente.PPB003.CAP_F_015.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_015.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF015 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF015 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF015 - Autenticar usuario$")
    public void Autenticar_Usuario() throws InterruptedException{
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF015 - Ejecutar CAPF003$")
    public void Ejecutar_CAPF003()throws InterruptedException, URISyntaxException {
        myStep.ejecutarCAPF003();
    }
    @Y("^PPB003-CAPF015 - Consultar codigo RENPA para validar Fecha de Declaracion$")
    public void Consultar_Codigo_RENPA_Para_Validar_Fecha_De_Declaracion()throws InterruptedException {

    }

    @Y("^PPB003-CAPF015 - Consultar codigo RENPA para validar Datos Tecnicos$")
    public void Consultar_Codigo_RENPA_Para_Validar_Datos_Tecnicos()throws InterruptedException {

    }

    @Y("^PPB003-CAPF015 - Consultar codigo RENPA para validar Superficie Total$")
    public void Consultar_Codigo_RENPA_Para_Validar_Superficie_Total()throws InterruptedException {

    }
}

