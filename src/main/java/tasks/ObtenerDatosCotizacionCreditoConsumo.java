package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class ObtenerDatosCotizacionCreditoConsumo implements Task {


    public static String getValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public static String getValorSeguroDeVida() {
        return valorSeguroDeVida;
    }

    public static String getValorTotalCuota() {
        return valorTotalCuota;
    }


    private static String valorCuotaMensual;
    private static String valorSeguroDeVida;
    private static String valorTotalCuota;
    private By elementoWebXpathCuota;
    private By elementoWebXpathSeguro;
    private By elementoWebXpathCuotaTotal;

    public ObtenerDatosCotizacionCreditoConsumo(By elementoWebXpathCuota, By elementoWebXpathSeguro, By elementoWebXpathCuotaTotal) {
        this.elementoWebXpathCuota = elementoWebXpathCuota;
        this.elementoWebXpathSeguro = elementoWebXpathSeguro;
        this.elementoWebXpathCuotaTotal = elementoWebXpathCuotaTotal;
    }
    public ObtenerDatosCotizacionCreditoConsumo() {

    }


    public static ObtenerDatosCotizacionCreditoConsumo guardarDatos(By elementoWebXpathCuota, By elementoWebXpathSeguro, By elementoWebXpathCuotaTotal) {
        return new ObtenerDatosCotizacionCreditoConsumo(elementoWebXpathCuota, elementoWebXpathSeguro, elementoWebXpathCuotaTotal);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        valorCuotaMensual = BrowseTheWeb.as(actor).find(elementoWebXpathCuota).getText();
        valorSeguroDeVida = BrowseTheWeb.as(actor).find(elementoWebXpathSeguro).getText();
        valorTotalCuota = BrowseTheWeb.as(actor).find(elementoWebXpathCuotaTotal).getText();

    }
}
