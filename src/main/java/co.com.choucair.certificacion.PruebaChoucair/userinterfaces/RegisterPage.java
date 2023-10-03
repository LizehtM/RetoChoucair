package co.com.choucair.certificacion.PruebaChoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target BTN_JOIN_TODAY = Target.the("Button join today").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRST_NAME = Target.the("First name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Last name:").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the(" Email ").located(By.id("email"));
    public static final Target INPUT_lANGUAGE = Target.the("Languages").located(By.xpath("//input[@type='search']"));
    public static final Target LIST_MONTH = Target.the("Month").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("day").located(By.id("birthDay"));
    public static final Target LIST_YEAR= Target.the("year").located(By.id("birthYear"));
    public static final Target BTN_LOCATION= Target.the("Btn location").located(By.xpath("//div/a/span[contains(text(),'Location')]"));
    public static final Target AUTODETECTED_ADDRESS = Target.the("first autodetected").located(By.className("check-mark"));
    public static final Target BTN_DEVICES= Target.the("Btn devices").located(By.xpath("//div/a/span[contains(text(),'Devices')]"));
    public static final Target AUTODETECTED_DEVICES = Target.the("Second autodetected").located(By.className("check-mark"));
    public static final Target BTN_LAST_STEP= Target.the("Btn last step").located(By.xpath("//div/a/span[contains(text(),'Last')]"));
    public static final Target PASSWORD= Target.the("Password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target CHK_TERM_OF_USE= Target.the("check term of use").located(By.id("termOfUse"));
    public static final Target CHK_PRIVACY= Target.the("Chek privacy").located(By.id("privacySetting"));
    public static final Target BTN_COMPLETE_SETUP= Target.the("Btn complete setup").located(By.xpath("//div/a/span[contains(text(),'Setup')]"));
    public static final Target MESSAGE= Target.the("Mesaage").located(By.xpath("//div[@class='image-box-header']"));







}
