package questions;

import tasks.ObtenerDatosCotizacionCreditoConsumo;

import static org.assertj.core.api.Assertions.fail;

public class ValidarInformacionSimuladorCredito {
    private static final String capturaValorCuotaMensualPagina = ObtenerDatosCotizacionCreditoConsumo.getValorCuotaMensual();
    private static final String capturaValorSeguroDeVida = ObtenerDatosCotizacionCreditoConsumo.getValorSeguroDeVida();
    private static final String capturaValorCuotaTotal = ObtenerDatosCotizacionCreditoConsumo.getValorTotalCuota();

    public static void validacionCadenasIguales(String valorCuotaMensualFeature, String capturaValorSeguroDeVidaFeature, String capturaValorTotalFeature) {

        String limpiarcapturaValorCuotaMensualPagina = capturaValorCuotaMensualPagina.substring(1);
        String limpiarcapturaValorSeguroDeVida = capturaValorSeguroDeVida.substring(1);
        String limpiarcapturaValorCuotaTotal = capturaValorCuotaTotal.substring(1);

        if (limpiarcapturaValorCuotaMensualPagina.equals(valorCuotaMensualFeature)
                && (limpiarcapturaValorSeguroDeVida.equals(capturaValorSeguroDeVidaFeature))
                && (limpiarcapturaValorCuotaTotal.equals(capturaValorTotalFeature))
        ) {
        }else {
            fail("Las cadenas de la simulación de credito y las proporcionadas por el feature no son iguales");
        }
    }
}
