package userinterfaces;


import org.openqa.selenium.By;

public class CreditoConsumoPagina {

    public static final By MENU_VEHICULOS = By.xpath("//a[@id='tab-categoria-vehiculo']");
    public static final By SECCIION_CREDITOS_MOTO = By.xpath("//h2[contains(text(),'Créditos para moto')]");
    public static final By BOTON_SOLICITAR_CREDITO_MOTO_ALTO_CILINDRAJE = By.xpath("(//a[@href='https://sufi.grupobancolombia.com/sufi/creditos/rotativo/simulador'])[1]");
}
