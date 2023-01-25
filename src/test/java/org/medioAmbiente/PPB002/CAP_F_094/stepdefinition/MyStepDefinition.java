package org.medioAmbiente.PPB002.CAP_F_094.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_094.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF094 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF094 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF094 - Posicionar sobre el menu Servicios")
    public void Posicionar_Sobre_El_Menu_Servicios() throws InterruptedException {
        myStep.posicionarServicios();
    }
    @Y("^PPB002-CAPF094 - Clickar submenu Biblioteca Publicaciones y Multimedia")
    public void Clickar_Submenu_Biblioteca_Publicaciones_Y_Multimedia() throws InterruptedException {
        myStep.clickarBlibliotecaPublicacionesyMultimedia();
    }

    @Y("^PPB002-CAPF094 - Clickar componente Informes periodicos")
    public void Clickar_Componente_Informes_Periodicos() throws InterruptedException {
        myStep.clickarInformesPeriodicos();
    }

    @Y("^PPB002-CAPF094 - Clickar componente Informe de Medio Ambiente en Andalucia")
    public void Clickar_Componente_Informe_De_Medio_Ambiente_En_Andalucia() throws InterruptedException {
        myStep.clickarInformeMA();
    }

    @Y("^PPB002-CAPF094 - Clickar componente Informe de Medio Ambiente en Andalucia 2020")
    public void Clickar_Componente_Informe_De_Medio_Ambiente_En_Andalucia_2020() throws InterruptedException {
        myStep.clickarInformeMA2020();
    }

    @Y("^PPB002-CAPF094 - Clickar icono descargar PDF")
    public void Clickar_Icono_Descargar_PDF() throws InterruptedException {
        myStep.clickarDescargarPDF();
    }

}

