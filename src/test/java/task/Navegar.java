package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import user_interface.Options;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Navegar implements Task {

    private final Options options;

    public Navegar(Options options) {
        this.options = options;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(options.url()));

    }
    public static Performable a(Options options){
        return instrumented(Navegar.class, options);
    }
}
