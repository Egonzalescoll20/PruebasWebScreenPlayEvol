package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProgramOption implements Interaction {

    private final Target target;

    private final String value;

    public SelectProgramOption(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> elementList = target.resolveAllFor(actor);
        for (WebElementFacade elementFacade : elementList) {
            if (elementFacade.getText().contentEquals(value)){
                elementFacade.click();
            }
            break;
        }

    }

    public static SelectProgramOption selectProgramOption(Target target, String value){
        return instrumented(SelectProgramOption.class, target, value);
    }
}
