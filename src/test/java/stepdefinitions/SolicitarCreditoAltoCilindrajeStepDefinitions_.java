package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;
import userinterfaces.SimuladorCreditoPagina;

public class SolicitarCreditoAltoCilindrajeStepDefinitions_ {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cliente potencial");

    }

    @When("Selecciona la opcion vehiculos para solicitar un credito de moto alto cilindraje")
    public void seleccionaLaOpcionVehiculosParaSolicitarUnCreditoDeMotoAltoCilindraje() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarSolicitarCreditoMotoAltoCC.irASaberMasParaSolicitar());

    }

    @And("ingresa los datos {string} {string} {string}")
    public void ingresaLosDatos(String seleccionVehiculo, String montoPrestamo, String numeroCuotas) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarDatosSimuladorCredito.diligenciarDatosCompra(seleccionVehiculo, montoPrestamo, numeroCuotas));
    }

    @Then("debe generarse una cotizacion de la cual se guardaran los valores")
    public void debeGenerarseUnaCotizacionDeLaCualSeGuardaranLosValores() {
        OnStage.theActorInTheSpotlight().attemptsTo(ObtenerDatosCotizacionCreditoConsumo.guardarDatos(SimuladorCreditoPagina.VALOR_CUOTA_MENSUAL,
                SimuladorCreditoPagina.VALOR_SEGURO_DE_VIDA,
                SimuladorCreditoPagina.VALOR_CUOTA_TOTAL));
    }

    @And("se debe guardar la informacion obtenida en excel")
    public void seDebeGuardarLaInformacionObtenidaEnExcel() {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarDatos.enExcel());
    }

    @And("se debe validar {string} {string}{string}")
    public void seDebeValidar(String cuotaMensualAValidar, String seguroDeVidaValidar, String cuotaTotalValidar) {
        OnStage.theActorInTheSpotlight().attemptsTo(ObtenerValidacionInformacionSimuladorCredito.conValidacion(cuotaMensualAValidar, seguroDeVidaValidar, cuotaTotalValidar));
    }
}




