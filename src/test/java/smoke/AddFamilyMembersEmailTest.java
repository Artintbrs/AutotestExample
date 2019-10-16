package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.HouseholdUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Добавить членов семьи (Ввод по email. Доступ на управление)
 */

public class AddFamilyMembersEmailTest extends TestBase {

    private String email = "test2@mail.com";


    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected HouseholdUserSteps householdUserSteps = new HouseholdUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void addFamilyMembersEmailTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        householdUserSteps.shouldBeApartmentScreen();
        householdUserSteps.OpenManageHouseScreen();
        householdUserSteps.addFamilyMembers();
        householdUserSteps.addFamilyMembersEmail(email);
    }

}
