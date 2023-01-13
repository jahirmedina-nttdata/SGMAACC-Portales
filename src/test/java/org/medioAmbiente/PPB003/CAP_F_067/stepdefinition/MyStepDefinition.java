package org.medioAmbiente.PPB003.CAP_F_067.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_067.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF067 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF067 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF067 - Visualizar sugerencia del mes$")
    public void Visualizar_Sugerencia_Del_Mes()throws InterruptedException {
        myStep.visualizarSugerenciaDelMes();
    }

    @Y("^PPB003-CAPF067 - Clickar enlace Ver Mas$")
    public void Clickar_Enlace_Ver_Mas()throws InterruptedException {
        myStep.clickarVerMas();
    }

    @Y("^PPB003-CAPF067 - Clickar descargar documento$")
    public void Clickar_Descargar_Documento()throws InterruptedException {
        myStep.clickarDescargarDocumento();
    }
}

