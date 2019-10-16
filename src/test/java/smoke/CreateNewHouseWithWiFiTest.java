package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.HouseholdUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Создание домовладения после регистрации с вводом параметров wifi
 */

public class CreateNewHouseWithWiFiTest extends TestBase {

    private String houseName = "NewHouseTest";
    private String passWiFi = "4815162342";

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected HouseholdUserSteps householdUserSteps = new HouseholdUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void createNewHouseWithWiFiTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        householdUserSteps.shouldBeApartmentScreen();
        householdUserSteps.addNewHomeWithWiFi(houseName, passWiFi);

    }

}
