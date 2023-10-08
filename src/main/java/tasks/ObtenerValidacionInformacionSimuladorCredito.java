package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.ValidarInformacionSimuladorCredito;

public class ObtenerValidacionInformacionSimuladorCredito implements Task {


    private String cuotaMensualAValidarFeature;
    private String seguroDeVidaValidar;
    private String cuotaTotalValidar;

    public ObtenerValidacionInformacionSimuladorCredito(String cuotaMensualAValidarFeature, String seguroDeVidaValidar, String cuotaTotalValidar) {
        this.cuotaMensualAValidarFeature = cuotaMensualAValidarFeature;
        this.seguroDeVidaValidar = seguroDeVidaValidar;
        this.cuotaTotalValidar = cuotaTotalValidar;
    }

    public static ObtenerValidacionInformacionSimuladorCredito conValidacion(String cuotaMensualAValidarFeature, String seguroDeVidaValidar, String cuotaTotalValidar) {
        return new ObtenerValidacionInformacionSimuladorCredito(cuotaMensualAValidarFeature, seguroDeVidaValidar, cuotaTotalValidar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ValidarInformacionSimuladorCredito.validacionCadenasIguales(cuotaMensualAValidarFeature,seguroDeVidaValidar,cuotaTotalValidar);
    }
}
