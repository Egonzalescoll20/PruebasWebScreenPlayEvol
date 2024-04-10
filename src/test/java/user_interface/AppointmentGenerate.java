package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AppointmentGenerate {

    public static final Target selectProgram =Target.the("Seleccion de programa de salud")
            .locatedBy("//*[@id='appointment']/div/div/form/div[3]/div");
    public static final Target enterDateProgram=Target.the("Campo para ingresar la fecha de la cita")
            .located(By.id("txt_visit_date"));
    public static final Target commentedText=Target.the("Campo para ingresar comentario")
            .located(By.id("txt_comment"));
    public static final Target btnAppointment=Target.the("Boton para generar cita medica")
            .located(By.id("btn-book-appointment"));
}
