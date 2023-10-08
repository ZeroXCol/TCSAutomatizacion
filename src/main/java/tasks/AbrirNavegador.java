package tasks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador implements Task {
    private String url;


    public AbrirNavegador(String url) {
        this.url = url;
    }

    public static AbrirNavegador abrirNavegador(String url) {

        return new AbrirNavegador(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb navegarEnLaWeb = actor.abilityTo(BrowseTheWeb.class);
        actor.attemptsTo(Open.url(url));
    }
}
