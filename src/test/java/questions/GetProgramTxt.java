package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.confirmRegister.programValidate;

public class GetProgramTxt implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(programValidate, isVisible()));
        String programTxt = WebElementQuestion.the(programValidate).answeredBy(actor).getText();
        return programTxt;
    }

    public static GetProgramTxt getProgramTxt(){
        return new GetProgramTxt();
    }
}
