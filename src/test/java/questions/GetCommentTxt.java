package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static user_interface.confirmRegister.commentValidate;

public class GetCommentTxt implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String commentTxt = WebElementQuestion.the(commentValidate).answeredBy(actor).getText();
        return commentTxt;
    }
    public static GetCommentTxt getCommentTxt(){
        return new GetCommentTxt();
    }
}
