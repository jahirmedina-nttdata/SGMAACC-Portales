package org.medioAmbiente.PPB006.CAP_FN_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN003 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN003 - Visualizar cabecera CAPFC001$")
    public void Visualizar_Cabecera_CAPFC001()throws InterruptedException {
        myStep.visualizarCAPFC01();
    }

    @Y("^PPB006-CAPFN003 - Visualizar menu CAPFC012$")
    public void Visualizar_Menu_CAPFC012()throws InterruptedException {
        myStep.visualizarCAPFC12();
    }

    @Y("^PPB006-CAPFN003 - Visualizar migas CAPFC011$")
    public void Visualizar_Migas_CAPFC011()throws InterruptedException {
        myStep.visualizarCAPFC11();
    }

    @Y("^PPB006-CAPFN003 - Visualizar piepag CAPFC013$")
    public void Visualizar_Piepag_CAPFC013()throws InterruptedException {
        myStep.visualizarCAPFC13();
    }

}

