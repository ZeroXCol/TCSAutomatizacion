package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import tasks.AbrirNavegador;

public class BrackgroundCreditoMotoAltoCilindrajeStepdefs {


    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el cliente potencial acceder a la url de bancolombia")
    public void elClientePotencialAccederALaUrlDeBancolombia() {
        OnStage.theActorCalled("Cliente potencial").attemptsTo(AbrirNavegador.abrirNavegador("https://www.bancolombia.com/personas"));

    }
}

   
