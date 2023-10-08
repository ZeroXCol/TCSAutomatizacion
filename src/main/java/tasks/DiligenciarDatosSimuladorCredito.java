package tasks;

import interactions.Interacciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;
import userinterfaces.SimuladorCreditoPagina;


public class DiligenciarDatosSimuladorCredito implements Task {

    private String seleccionAComprar;
    private String valorSolicitar;
    private String cantidadCuotas;

    public DiligenciarDatosSimuladorCredito(String seleccionAComprar, String valorSolicitar, String cantidadCuotas) {

        this.seleccionAComprar = seleccionAComprar;
        this.valorSolicitar = valorSolicitar;
        this.cantidadCuotas = cantidadCuotas;
    }

    public static DiligenciarDatosSimuladorCredito diligenciarDatosCompra(String seleccionAComprar, String valorSolicitar, String cantidadCuotas) {
        return new DiligenciarDatosSimuladorCredito(seleccionAComprar, valorSolicitar, cantidadCuotas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SimuladorCreditoPagina.setSeleccionarVehiculo(seleccionAComprar);
        SimuladorCreditoPagina.setCantidadCuotas(cantidadCuotas);

        //Interacciones.esperarElementoVisible(SimuladorCreditoPagina.LISTA_VEHICULO_COMPRA);
        actor.attemptsTo(
                Scroll.to(SimuladorCreditoPagina.LISTA_VEHICULO_COMPRA),
                Click.on(SimuladorCreditoPagina.seleccionarVehiculo),
                Enter.theValue(valorSolicitar).into(SimuladorCreditoPagina.CAJA_TEXTO_VALOR_SOLICITADO),
                Click.on(SimuladorCreditoPagina.cantidadCuotas),
                Click.on(SimuladorCreditoPagina.BTN_SIMULAR_CREDITO)
        );

    }
}
