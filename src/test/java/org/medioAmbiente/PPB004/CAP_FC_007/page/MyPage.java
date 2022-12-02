package org.medioAmbiente.PPB004.CAP_FC_007.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    public void mostrarCarrusel()throws InterruptedException {
        waitFor(5).second();
    }
}
