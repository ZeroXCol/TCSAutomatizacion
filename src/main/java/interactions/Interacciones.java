package interactions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

import net.thucydides.core.pages.PageObject;

public class Interacciones extends PageObject {


    public void scrollAElemento(By elemento) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(elemento));
    }

    public void esperarElementoVisible(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
    }

    public String capturarTexto(By elemento) {
        String texto = getDriver().findElement(elemento).getText();
        return texto;
    }

    public void bordearElemento(By webLocalizador) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'",
                    element(webLocalizador));
        } catch (Exception e) {
            cerrarNavegador();
        }
    }
    public void cerrarNavegador() {
        getDriver().quit();
    }


}
