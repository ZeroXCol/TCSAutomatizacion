package tasks;


import interactions.Interacciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import userinterfaces.SimuladorCreditoPagina;

import java.io.FileOutputStream;
import java.io.IOException;

import static tasks.ObtenerDatosCotizacionCreditoConsumo.*;

public class GuardarDatos implements Task {
    Interacciones interacciones = new Interacciones();

    private String valorCuotaMensual;
    private String valorSeguroDeVida;
    private String valorCuotaTotal;

    public static GuardarDatos enExcel() {
        return new GuardarDatos();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        interacciones.bordearElemento(SimuladorCreditoPagina.VALOR_CUOTA_MENSUAL);
        interacciones.bordearElemento(SimuladorCreditoPagina.VALOR_SEGURO_DE_VIDA);
        interacciones.bordearElemento(SimuladorCreditoPagina.VALOR_CUOTA_TOTAL);

        Workbook libroExcel = new XSSFWorkbook();
        Sheet hojaNueva = libroExcel.createSheet("Simulacion Credito Consumo");

        Row titulosExcel = hojaNueva.createRow(0);
        Cell datosTitulos = titulosExcel.createCell(0);
        datosTitulos.setCellValue("Cuota Mensual");
        datosTitulos = titulosExcel.createCell(1);
        datosTitulos.setCellValue("Seguro de vida");
        datosTitulos = titulosExcel.createCell(2);
        datosTitulos.setCellValue("Total");

        Row datosExcel = hojaNueva.createRow(1);
        Cell datosCredito = datosExcel.createCell(0);
        datosCredito.setCellValue(getValorCuotaMensual());
        datosCredito = datosExcel.createCell(1);
        datosCredito.setCellValue(getValorSeguroDeVida());
        datosCredito = datosExcel.createCell(2);
        datosCredito.setCellValue(getValorTotalCuota());


        try (FileOutputStream fileOut = new FileOutputStream("/TCSAutomatizacion/src/test/resources/files/ResultadoSimulacionCredito.xlsx")) {
            libroExcel.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
