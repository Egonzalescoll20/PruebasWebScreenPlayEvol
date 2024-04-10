package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static user_interface.confirmRegister.dateValidate;

public class GetDateTxt implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String dateTxt = WebElementQuestion.the(dateValidate).answeredBy(actor).getText();
        return dateTxt;
    }

    public static GetDateTxt getDateTxt(){
        return new GetDateTxt();
    }
}
