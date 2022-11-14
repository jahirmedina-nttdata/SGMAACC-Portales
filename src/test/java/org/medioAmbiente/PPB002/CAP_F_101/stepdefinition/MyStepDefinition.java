package org.medioAmbiente.PPB002.CAP_F_101.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_101.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF101 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF101 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF101 - Posicionar sobre el menu Areas Tematicas")
    public void Posicionar_Sobre_El_Menu_Areas_Tematicas() throws InterruptedException {
        myStep.posicionarAreasTematicas();
    }
    @Y("^PPB002-CAPF101 - Pulsar sobre el submenu Atmosfera")
    public void Pulsar_Sobre_El_Submenu_Atmosfera() throws InterruptedException {
        myStep.pulsarSubmenuAtmosfera();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Planificacion")
    public void Marca_Check_En_El_Filtro_Planificacion() throws InterruptedException {
        myStep.checkPlanificacion();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Visualizadores")
    public void Marca_Check_En_El_Filtro_Visualizadores() throws InterruptedException {
        myStep.checkVisualizadores();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Listados")
    public void Marca_Check_En_El_Filtro_Listados() throws InterruptedException {
        myStep.checkListados();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Datos en el tiempo real")
    public void Marca_Check_En_El_Filtro_Datos_En_El_Tiempo_Real() throws InterruptedException {
        myStep.checkDatosTiempoReal();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Informes y memorias")
    public void Marca_Check_En_El_Filtro_Informes_Y_Memorias() throws InterruptedException {
        myStep.checkInformesyMemorias();
    }

    @Y("^PPB002-CAPF101 - Marca check en el filtro Estadisticas")
    public void Marca_Check_En_El_Filtro_Estadisticas() throws InterruptedException {
        myStep.checkEstadisticas();
    }

    @Y("^PPB002-CAPF101 - Marca check en todos los filtros")
    public void Marca_Check_En_Todos_Los_Filtros() throws InterruptedException {
        myStep.checkTodoslosFiltros();
    }
}

