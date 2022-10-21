package org.medioAmbiente.PPB002.CAP_F_002_06.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_06.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00206 - Accedemos el Portal Web CD$")
    public void Accedemos_El_Portal_WebCD() throws InterruptedException{
        myStep.accedemosalPortal();
    }

    @Cuando("^PPB002-CAPF00206 - Aceptamos Cookies$")
    public void Aceptamos_Cookies() throws InterruptedException{
        myStep.acceptCookies();
    }
    @Y("^PPB002-CAPF00206 - Ubicar Contenido destacado$")
    public void Ubicar_Contenido_Destacado() throws InterruptedException{
        myStep.ubicarContenidoDestacado();
    }
    @Y("^PPB002-CAPF00206 - Clickar en lo.mas.buscado$")
    public void Clickar_En_Lo_Mas_Buscado() throws InterruptedException{
        myStep.clickarMasBuscado();
    }
}

