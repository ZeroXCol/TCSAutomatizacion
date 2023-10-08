package tasks;

import interactions.Interacciones;
import io.cucumber.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CreditoConsumoPagina;
import userinterfaces.InicioBancolombiaPagina;

public class SeleccionarSolicitarCreditoMotoAltoCC implements Task {

    Interacciones interacciones = new Interacciones();

    public static SeleccionarSolicitarCreditoMotoAltoCC irASaberMasParaSolicitar() {

        return new SeleccionarSolicitarCreditoMotoAltoCC();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(InicioBancolombiaPagina.SECCION_MAS_DE_NUESTROS_PRODUCTOS));
        interacciones.bordearElemento(InicioBancolombiaPagina.BOTON_SABER_MAS);

        actor.attemptsTo(
                Click.on(InicioBancolombiaPagina.BOTON_SABER_MAS));

        interacciones.bordearElemento(CreditoConsumoPagina.MENU_VEHICULOS);
        actor.attemptsTo(
                Click.on(CreditoConsumoPagina.MENU_VEHICULOS),
                Scroll.to(CreditoConsumoPagina.SECCIION_CREDITOS_MOTO));

        interacciones.bordearElemento(CreditoConsumoPagina.BOTON_SOLICITAR_CREDITO_MOTO_ALTO_CILINDRAJE);
        actor.attemptsTo(
                Click.on(CreditoConsumoPagina.BOTON_SOLICITAR_CREDITO_MOTO_ALTO_CILINDRAJE));


    }
}
