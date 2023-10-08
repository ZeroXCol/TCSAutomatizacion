package userinterfaces;

import org.openqa.selenium.By;

public class SimuladorCreditoPagina {


    public static final By LISTA_VEHICULO_COMPRA = By.xpath("//select[@name='tipoCredito']");
    public static final By CAJA_TEXTO_VALOR_SOLICITADO = By.xpath("//input[@name='valorSolicitado']");
    public static final By LISTA_CANTIDAD_CUOTAS = By.xpath("//select[@class='form-control ng-pristine ng-valid']");
    public static final By BTN_SIMULAR_CREDITO = By.xpath("//button[@id='btnSubmit']");
    public static final By VALOR_CUOTA_MENSUAL = By.xpath("(//strong[@class='val-number ng-binding'])[1]");
    public static final By VALOR_SEGURO_DE_VIDA = By.xpath("(//strong[@class='val-number ng-binding'])[2]");
    public static final By VALOR_CUOTA_TOTAL = By.xpath("(//strong[@class='result ng-binding'])[2]");

    public static By seleccionarVehiculo;
    public static By cantidadCuotas;

    public static By getCantidadCuotas() {
        return cantidadCuotas;
    }

    public static void setCantidadCuotas(String Cuotas) {
        cantidadCuotas = By.xpath("//option[contains(text(),'*')]".replace("*", Cuotas));
    }

    public By getSeleccionarVehiculo() {
        return seleccionarVehiculo;
    }

    public static void setSeleccionarVehiculo(String vehiculo) {
        seleccionarVehiculo = By.xpath("//option[contains(text(),'*')]".replace("*", vehiculo));
    }


}
