package org.medioAmbiente.PPB003.CAP_F_028.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_028.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF028 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF028 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF028 - Desplazar al apartado No te vayas sin$")
    public void Desplazar_Al_Apartado_No_Te_Vayas_Sin() throws InterruptedException{
        myStep.desplazarAlApartado();
    }

    @Y("^PPB003-CAPF028 - Clickar Disfruta de sus playas$")
    public void Clickar_Disfruta_De_Sus_Playas()throws InterruptedException {
        myStep.clickarFicha();
    }

    @Entonces("^PPB003-CAPF028 - Validar Ficha$")
    public void Validar_Ficha() throws InterruptedException  {
        myStep.validarFicha();
    }
}

