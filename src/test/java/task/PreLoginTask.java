package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.BeforeLoginAplication.buttonMakeAppointment;

public class PreLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(buttonMakeAppointment, isVisible()),
                Click.on(buttonMakeAppointment));
    }

    public static PreLoginTask preLoginTask(){
        return Tasks.instrumented(PreLoginTask.class);
    }
}
