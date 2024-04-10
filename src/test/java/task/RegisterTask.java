package task;

import interactions.SelectProgramOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.AppointmentGenerate.*;

public class RegisterTask implements Task {

    private final String fecha;
    private final String comentario;

    public RegisterTask(String fecha, String comentario) {
        this.fecha = fecha;
        this.comentario = comentario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(selectProgram, isVisible()),
                SelectProgramOption.selectProgramOption(selectProgram, "Medicaid"),
                Enter.theValue(fecha).into(enterDateProgram),
                Enter.theValue(comentario).into(commentedText),
                Click.on(btnAppointment));

    }

    public static RegisterTask registerTask(String fecha, String comentario){
        return Tasks.instrumented(RegisterTask.class, fecha, comentario);
    }
}
