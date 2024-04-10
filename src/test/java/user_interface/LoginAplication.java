package user_interface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginAplication {

    public static final Target enterUserLogin=Target.the("campo para ingresar el usuario")
            .located(By.id("txt-username"));
    public static final Target enterPasswordLogin=Target.the("campo para ingresar la contraseña")
            .located(By.id("txt-password"));
    public static final Target btnLoginAplication=Target.the("boton para logueo a la aplicacion")
            .located(By.id("btn-login"));
}
