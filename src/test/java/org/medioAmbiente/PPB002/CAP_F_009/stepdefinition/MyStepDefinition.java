package org.medioAmbiente.PPB002.CAP_F_009.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_009.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF009 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF009 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF009 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("PPB002-CAPF009 - Ir a la seccion noticia$")
    public void Ir_A_La_Seccion_Noticia() throws InterruptedException{
        myStep.irSeccionNoticia();
    }

    @Y("PPB002-CAPF009 - Clickar sobre texto$")
    public void Clickar_Sobre_Texto() throws InterruptedException{
        myStep.clickarSobreTexto();
    }

    @Y("PPB002-CAPF009 - Clickar categoria$")
    public void Clickar_Categoria() throws InterruptedException{
        myStep.clickarCategoria();
    }

    @Y("PPB002-CAPF009 - Clickar ver todas las noticias$")
    public void Clickar_Ver_Todas_Las_Noticias() throws InterruptedException{
        myStep.clickarVerTodasLasNoticias();
    }
}

