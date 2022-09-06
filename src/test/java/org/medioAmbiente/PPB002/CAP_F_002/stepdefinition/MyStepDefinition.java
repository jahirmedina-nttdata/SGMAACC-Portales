package org.medioAmbiente.PPB002.CAP_F_002.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF002 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }

    @Dado("^PPB002-CAPF00201 - Cargando el Portal Web$")
    public void Cargando_El_Portal_Web() throws InterruptedException {
        myStep.cargandoPortal();
    }
    @Y("^PPB002-CAPF002 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }
    @Cuando("^PPB002-CAPF00201 - Aceptar las cookies01")
    public void Aceptar_Cookies01() throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00201 - hacemos click en buscador$")
    public void Hacemos_Click_En_Buscador() throws InterruptedException {
        myStep.clickBuscador();
    }

    @Y("^PPB002-CAPF00201 - escribimos \"([^\"]*)\" en el buscador y pulsamos enter$")
    public void Escribimos_En_El_Buscador_Ypulsamos_Enter(String tema) throws InterruptedException {
        myStep.escribimosenelBuscador(tema);
    }

    @Entonces("^PPB002-CAPF00201 - visualizamos la filtracion de la busquedad")
    public void Visualizamos_La_Filtracion_De_La_Busquedad() throws InterruptedException{
        myStep.filtracionBusquedad();
    }

    @Dado("^PPB002-CAPF00202 - Cargando el Navegador$")
    public void Cargando_ElNavegador() throws InterruptedException{
        myStep.cargandoPortal();
    }

    @Cuando("^PPB002-CAPF00202 - Aceptar las cookies0$")
    public void Aceptar_Las_Cookies0() throws InterruptedException{
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00202 - Ubicarnos en el carrusel")
    public void Ubicarnos_En_El_Carrusel() throws InterruptedException {
        myStep.ubicarCarrusel();
    }

    @Dado("^PPB002-CAPF00203 - Cargando el Navegador$")
    public void CargandoEl_Navegador() throws InterruptedException {
        myStep.cargandoPortal();
    }

    @Cuando("^PPB002-CAPF00203 - Aceptamos las cookies$")
    public void Aceptamos_Las_Cookies() throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00203 - Ubicarnos en el carrusel$")
    public void Ubicarnos_En_ElCarrusel() throws InterruptedException {
        myStep.ubicarCarrusel();
    }

    @Y("^PPB002-CAPF00203 - Clickar en elemento Geodiversidad$")
    public void Clickar_En_Elemento_Geodiversidad() throws InterruptedException {
        myStep.clickarGeodiversidad();
    }
    @Y("^PPB002-CAPF00203 - Deslizar de izquierda a derecha$")
    public void Deslizar_De_Izquierda_A_Derecha()throws InterruptedException  {
        myStep.deslizarElemento();
    }

    @Y("^PPB002-CAPF00203 - Clickar en elemento$")
    public void Clickar_En_Elemento()throws InterruptedException {
        myStep.clickarElemento();
    }

    @Dado("^PPB002-CAPF00204 - Cargando el Navegador$")
    public void CargandoElNavegador() throws InterruptedException {
        myStep.cargandoPortal();
    }
    @Cuando("^PPB002-CAPF00204 - Aceptamos las cookies$")
    public void AceptamosLasCookies()throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00204 - Ubicarnos seccion noticia$")
    public void Ubicarnos_Seccion_Noticia() throws InterruptedException{
        myStep.ubicarNoticia();

    }

    @Y("^PPB002-CAPF00204 - Deslizar de izquierda a derecha noticia$")
    public void Deslizar_De_Izquierda_A_Derecha_Noticia()throws InterruptedException {
        myStep.deslizarnoticia();
    }

    @Y("^PPB002-CAPF00204 - Clickar en noticia$")
    public void Clickar_En_Noticia()throws InterruptedException {
        myStep.clickarNoticia();
    }

    @Y("^PPB002-CAPF00204 - Clickar en categoria noticia$")
    public void Clickar_En_Categoria_Noticia()throws InterruptedException {
        myStep.clickarCategoriaNoti();
    }

    @Y("^PPB002-CAPF00204 - Clickar en todas las noticias$")
    public void Clickar_En_Todas_Las_Noticias()throws InterruptedException {
        myStep.clickarTodos();
    }




    @Dado("^PPB002-CAPF00205 - Accedemos el Portal Web DA$")
    public void Accedemos_El_Portal_Web_DA() throws InterruptedException{
        myStep.cargandoNavegador();
    }

    @Cuando("^PPB002-CAPF00205 - Ubicar Directo A$")
    public void Ubicar_DirectoA() throws InterruptedException{
        myStep.ubicarDirectoA();
    }

    @Y("^PPB002-CAPF00205 - Clickar en Ventana del Visitante$")
    public void Clickar_En_Ventana_Del_Visitante() throws InterruptedException{
        myStep.clickarVentanaVisitante();
    }


    @Dado("^PPB002-CAPF00206 - Accedemos el Portal Web CD$")
    public void Accedemos_El_Portal_WebCD() throws InterruptedException{
        myStep.accedemosalPortal();
    }


    @Cuando("^PPB002-CAPF00206 - Ubicar Contenido destacado$")
    public void Ubicar_Contenido_Destacado() throws InterruptedException{
        myStep.ubicarContenidoDestacado();
    }

    @Y("^PPB002-CAPF00206 - Clickar en lo.mas.buscado$")
    public void Clickar_En_Lo_Mas_Buscado() throws InterruptedException{
        myStep.clickarMasBuscado();
    }


    @Dado("^PPB002-CAPF00207 - Accedemos el Portal Web LU$")
    public void Accedemos_El_Portal_WebLU() throws InterruptedException {
    myStep.accedemosalPortal();

    }

    @Y("^PPB002-CAPF00207 - Aceptar las cookies02$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00207 - Clickar en lo ultimo$")
    public void Clickar_En_LoUltimo() throws InterruptedException {
        myStep.clickarLoUltimo();
    }


    @Y("^PPB002-CAPF00207 - Clickar en Plan Forestal Andaluz$")
    public void Clickar_En_Plan_Forestal_Andaluz() throws InterruptedException {
        myStep.clickarPlanForestal();
    }

    @Y("^PPB002-CAPF00207 - Clickar en Inicio LU$")
    public void Clickar_En_InicioLU() throws InterruptedException {
        myStep.clickarInicioLU();

    }

    @Y("^PPB002-CAPF00207 - Clickar en Ver Mas$")
    public void Clickar_En_VerMas() throws InterruptedException {
        myStep.clickarVerMas();
    }


    @Dado("^PPB002-CAPF00208 - Accedemos el Portal Web MV$")
    public void Accedemos_El_Portal_WebMV() throws InterruptedException{
        myStep.accedemosalPortal();
    }

    @Y("^PPB002-CAPF00208 - Aceptar las cookies03$")
    public void Aceptar_Las_Cookies03()throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00208 - Clickar en lo Mas Valorado$")
    public void Clickar_En_Lo_MasValorado() throws InterruptedException {
        myStep.clickarMasValorado();
    }

    @Y("^PPB002-CAPF00208 - Clickar en Gestores de los Residuos$")
    public void Clickar_En_Gestores_De_Los_Residuos() throws InterruptedException{
        myStep.clickarGestoresResiduos();
    }


    @Dado("^PPB002-CAPF00209 - Accedemos el Portal Web MB$")
    public void Accedemos_El_PortalWebMB() throws InterruptedException {
        myStep.accedemosalPortal();
    }

    @Y("^PPB002-CAPF00209 - Aceptar las cookies04$")
    public void Aceptar_Las_Cookies04() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00209 - Clickar en lo Mas Buscado$")
    public void Clickar_En_Lo_MasBuscado() throws InterruptedException{
        myStep.clickarMasBuscado();
    }

    @Y("^PPB002-CAPF00209 - Clickar en Servicios$")
    public void Clickar_En_Servicios() throws InterruptedException{
        myStep.clickarServicios();
    }



}

