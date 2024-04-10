package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class confirmRegister {

    public static final Target programValidate=Target.the("Campo donde se visualiza el programa elegido")
            .locatedBy("//p[@id='program']");
    public static final Target dateValidate=Target.the("Campo para verificar la fecha elegida")
            .locatedBy("//p[@id='visit_date']");
    public static final Target commentValidate = Target.the("Campo para verificar el comentario")
            .locatedBy("//p[@id='comment']");

}
