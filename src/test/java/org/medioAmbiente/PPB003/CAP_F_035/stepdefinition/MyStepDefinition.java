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

    @Y("^PPB003-CAPF035 - Autenticar usuario$")
    public void Autenticar_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF035 - Ejecutar CAPF003$")
    public void Ejecutar_CAPF003()throws InterruptedException, URISyntaxException {
        myStep.EjecutarCAPF003();
    }

    @Y("^PPB003-CAPF035 - Consultar codigo Equipamiento para validar Espacios relacionados$")
    public void Consultar_Codigo_Equipamiento_Para_Validar_Espacios_Relacionados()throws InterruptedException {
        myStep.consultarCodigoEquipamientoParaValidarEspaciosRelacionados();
    }

    @Y("^PPB003-CAPF035 - Consultar codigo Equipamiento para validar Espacio natural$")
    public void Consultar_Codigo_Equipamiento_Para_Validar_Espacio_Natural()throws InterruptedException {
        myStep.consultarCodigoEquipamientoParaValidarEspacioNatural();
    }
}

