package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.GetCommentTxt;
import questions.GetDateTxt;
import questions.GetProgramTxt;
import task.LoginPageTask;
import task.Navegar;
import task.PreLoginTask;
import task.RegisterTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static user_interface.Options.OPENCART;

public class HealthcareSteps {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario ingresa a la aplicacion(.*)$")
    public void elUsuarioIngresaALaAplicacion(String nameActor) {
        theActorCalled(nameActor).attemptsTo(Navegar.a(OPENCART));

    }

    @And("^el usuario realiza el logueo de la aplicacion ingresando (.*) y (.*)$")
    public void enterLoginPage(String usuario, String contrasena){
        theActorInTheSpotlight().attemptsTo(PreLoginTask.preLoginTask());
        theActorInTheSpotlight().attemptsTo(LoginPageTask.loginPageTask(usuario, contrasena));


        
    }

    @When("^realiza el registro ingresando los siguientes datos (.*) y (.*)$")
    public void realizaElRegistroIngresandoLosSiguientesDatos(String fecha, String comentario) {
        theActorInTheSpotlight().attemptsTo(RegisterTask.registerTask(fecha, comentario));
        
    }

    @Then("^se verifica que se ha registrado con exito la cita de salud con (.*)$")
    public void seVerificaQueSeHaRegistradoConExitoLaCitaDeSalud(String fecha) {
        String textDate = theActorInTheSpotlight().asksFor(GetDateTxt.getDateTxt());
        theActorInTheSpotlight().should(seeThat("el registro es correcto", textActualDate ->textDate,equalTo(fecha)));

    }

}
