package task;

import io.cucumber.java.af.En;
import model.Register;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.LoginAplication.*;

public class LoginPageTask implements Task {

    private final String usuario;
    private final String contrasena;

    public LoginPageTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(enterUserLogin, isVisible()),
                Enter.theValue(usuario).into(enterUserLogin),
                Enter.theValue(contrasena).into(enterPasswordLogin),
                Click.on(btnLoginAplication));

    }

    public static LoginPageTask loginPageTask(String usuario, String contrasena){
        return Tasks.instrumented(LoginPageTask.class,usuario, contrasena);
    }
}
