package user_interface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BeforeLoginAplication {
    public static final Target buttonMakeAppointment=Target.the("boton para dirifirse al campo de logueo")
            .located(By.id("btn-make-appointment"));
}
