package org.medioAmbiente.PPB004.CAP_FC_012.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/caza")



public class MyPage extends PageObject {

    public void mostrarContenido() throws InterruptedException{
        waitFor(8).second();
    }
}
