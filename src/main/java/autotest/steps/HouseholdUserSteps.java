package autotest.steps;

import autotest.screen.elements.*;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.navigator;

import static com.codeborne.selenide.Condition.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HouseholdUserSteps extends StepBase {

    public HouseholdUserSteps(AppiumDriver driver) {
        super(driver);
    }

    protected ApartmentForm apartmentForm = new ApartmentForm();
    protected Controls controls = new Controls();
    protected MenuForm menuForm = new MenuForm();
    protected AddHomeForm addHomeForm = new AddHomeForm();
    protected ManageHouseForm manageHouseForm = new ManageHouseForm();
    protected StatisticsForm statisticsForm = new StatisticsForm();

    @Step("Проверка экрана домовладения")
    public void shouldBeApartmentScreen() {
        apartmentForm.textHeaders()
                .waitUntil(visible, 12000);
        apartmentForm.atHome().shouldBe(appears);
        apartmentForm.textInHouse().shouldBe(appears);
        apartmentForm.textHeat().shouldBe(appears);
        apartmentForm.textHeat().should(selected);
        apartmentForm.textWater().shouldBe(appears);
        apartmentForm.buttonAddDevice().shouldBe(appears);
        controls.buttonBack().shouldBe(appears);
        controls.buttonNext().shouldBe(appears);
    }

    @Step("Добавить новое домовладение с настройкой Wi-Fi")
    public void addNewHomeWithWiFi(String name, String passWiFi) {
        controls.buttonMenu().click();
        menuForm.addPlace()
                .waitUntil(visible, 30000)
                .click();
        addHomeForm.textHeader()
                .waitUntil(visible, 60000);
        addHomeForm.textWelcome().shouldBe(appears);
        addHomeForm.textQuestion().shouldBe(appears);
        addHomeForm.create().should(appears);
        addHomeForm.houseName().sendKeys(name);
        addHomeForm.create()
                .should(enabled)
                .click();
        addHomeForm.textHeaderNewHouse(name)
                .waitUntil(visible, 30000);
        controls.buttonBackScreen().shouldBe(appears);
        addHomeForm.nameHouse().shouldBe(appears);
        assertThat("Имя домовладения соответствует введенному", addHomeForm.nameHouse().getText(), equalTo(name));
        addHomeForm.createWiFi().should(appears);
        addHomeForm.nameWiFi().sendKeys(name);
        addHomeForm.passwordWiFi().sendKeys(passWiFi);
        addHomeForm.showPassword().click();
        assertThat("Отображается введенный пароль", addHomeForm.passwordWiFi().getText(), equalTo(passWiFi));
        addHomeForm.createWiFi().click();
        controls.buttonMenu()
                .waitUntil(visible, 30000);
        addHomeForm.textHeaderNewHouse(name).should(appears);
    }

    @Step("Добавить новое домовладение с настройкой Wi-Fi")
    public void addNewHomeWithoutWiFi(String name) {
        controls.buttonMenu().click();
        menuForm.addPlace()
                .waitUntil(visible, 30000)
                .click();
        addHomeForm.textHeader()
                .waitUntil(visible, 60000);
        addHomeForm.textWelcome().shouldBe(appears);
        addHomeForm.textQuestion().shouldBe(appears);
        addHomeForm.create().should(appears);
        addHomeForm.houseName().sendKeys(name);
        addHomeForm.create()
                .should(enabled)
                .click();
        addHomeForm.textHeaderNewHouse(name)
                .waitUntil(visible, 30000);
        controls.buttonBackScreen().shouldBe(appears);
        addHomeForm.nameHouse().shouldBe(appears);
        assertThat("Имя домовладения соответствует введенному", addHomeForm.nameHouse().getText(), equalTo(name));
        addHomeForm.skipCreateWiFi().click();
        controls.buttonMenu()
                .waitUntil(visible, 30000);
        addHomeForm.textHeaderNewHouse(name).should(appears);
    }

    @Step("Удалить созданное домовладение")
    public void DeleteHouse(String name) {
        controls.buttonSettings()
                .waitUntil(visible, 30000)
                .click();
        manageHouseForm.textHeader()
                .waitUntil(visible, 30000);
        manageHouseForm.houseName().shouldBe(appears);
        assertThat("Имя домовладения совпадает с удаляемым", manageHouseForm.houseName().getText(), equalTo(name));
        manageHouseForm.deleteHome().click();
        manageHouseForm.alertDeleteHome()
                .waitUntil(visible, 30000);
        manageHouseForm.messageDeleteHome().shouldBe(appears);
        manageHouseForm.buttonYes().click();
    }

    @Step("Переключение между экранами домовладения")
    public void SwitchHouse() {
        apartmentForm.textHeaders()
                .waitUntil(visible, 12000);
        String nameHoseOne = apartmentForm.textHeaders().getText();
        controls.buttonNext().click();
        controls.buttonSettings().click();
        manageHouseForm.houseName()
                .waitUntil(visible, 3000);
        String nameHoseTwo = manageHouseForm.houseName().getText();

        navigator.back();

        assertThat("Проверка что назвние домовладения изменилось", apartmentForm.textHeaders().getText(), equalTo(nameHoseTwo));
        controls.buttonBack().click();
        assertThat("Проверка что мы вернулись на предыдущий экран", apartmentForm.textHeaders().getText(), equalTo(nameHoseOne));

        controls.buttonMenu().click();
        menuForm.housePlace(nameHoseTwo)
                .waitUntil(visible, 30000)
                .click();
        assertThat("Проверка что назвние домовладения изменилось", apartmentForm.textHeaders().getText(), equalTo(nameHoseTwo));

        controls.buttonMenu().click();
        menuForm.housePlace(nameHoseOne)
                .waitUntil(visible, 30000)
                .click();
        apartmentForm.textHeaders()
                .waitUntil(visible, 30000);
        assertThat("Проверка что мы вернулись на предыдущий экран", apartmentForm.textHeaders().getText(), equalTo(nameHoseOne));
    }

    @Step("Открыть управление домом")
    public void OpenManageHouseScreen() {
        controls.buttonSettings()
                .waitUntil(visible, 30000)
                .click();
        manageHouseForm.textHeader().shouldBe(appears);
        manageHouseForm.houseName().shouldBe(appears);
        manageHouseForm.notificationsSettings().shouldBe(appears);
        manageHouseForm.addFamilyMembers().shouldBe(appears);
        manageHouseForm.nobodyIsAtHomeSettings().shouldBe(appears);
        manageHouseForm.workdaysSettings().shouldBe(appears);
        manageHouseForm.countersReportDay().shouldBe(appears);
        manageHouseForm.wifiSettings().shouldBe(appears);
        manageHouseForm.statistics().shouldBe(appears);
        manageHouseForm.deleteHome().shouldBe(appears);
    }

    @Step("Переименовать домовладение")
    public void RenameHouse(String name) {
        controls.buttonSettings()
                .waitUntil(visible, 30000)
                .click();
        manageHouseForm.houseName()
                .waitUntil(visible, 30000)
                .click();
        manageHouseForm.houseNameEditText().shouldBe(appears);
        manageHouseForm.houseNameEditText().clear();
        manageHouseForm.houseNameEditText().sendKeys(name + "\n");
        assertThat("Проверка что домовладение переименовано", manageHouseForm.houseName().getText().replaceAll("\n", ""), equalTo(name));

        navigator.back();
    }

    @Step("Проверить что домовладение переименованно")
    public void CheckRenameHouse(String name) {
        apartmentForm.textHeaders()
                .waitUntil(visible, 60000)
                .shouldHave(text(name));
        controls.buttonMenu().click();
        menuForm.housePlace(name).click();
    }

    @Step("Добавление членов семьи")
    public void addFamilyMembers() {
        manageHouseForm.addFamilyMembers().click();
//        manageHouseForm.textComment()
//                .waitUntil(visible,30000);
        manageHouseForm.buttonInvite().click();
        manageHouseForm.textSend()
                .waitUntil(visible,30000);
    }

    @Step("Добавить из списка контактов")
    public void addFamilyMembersFromContact(String email) {
        manageHouseForm.buttonContact().click();
        manageHouseForm.buttonAllow()
                .waitUntil(visible,30000)
                .click();
        manageHouseForm.headerContact()
                .waitUntil(visible,30000);
        manageHouseForm.contact("test").click();
        manageHouseForm.editTextName()
                .waitUntil(visible,30000);
        assertThat("Проверка имени контакта test", manageHouseForm.editTextName().getText(), equalTo("test"));
        manageHouseForm.editTextEmail().sendKeys(email);
        manageHouseForm.spinnerRole().click();
        manageHouseForm.valueView()
                .waitUntil(visible,30000)
                .click();
        manageHouseForm.buttonInvite().click();
        manageHouseForm.messageAdded()
                .waitUntil(visible,30000);
        manageHouseForm.buttonYes().click();
    }

    @Step("Добавить из списка контактов")
    public void addFamilyMembersEmail(String email) {
        manageHouseForm.buttonEnterEmail().click();
        manageHouseForm.editTextName()
                .waitUntil(visible,30000)
                .sendKeys("test2");
        assertThat("Проверка имени контакта test2", manageHouseForm.editTextName().getText(), equalTo("test2"));
        manageHouseForm.editTextEmail().sendKeys(email);
        manageHouseForm.spinnerRole().click();
        manageHouseForm.valueManage()
                .waitUntil(visible,30000)
                .click();
        manageHouseForm.buttonInvite().click();
        manageHouseForm.messageSent()
                .waitUntil(visible,30000);
        manageHouseForm.buttonYes().click();
    }

    @Step("Проверить добавленного члена семьи")
    public void checkFamilyMembers(String email, String role) {
        manageHouseForm.checkAdded(email).shouldBe();
        manageHouseForm.textRole(role).shouldBe();
    }

    @Step("Добавить Wi-Fi")
    public void addWifi(String pass, String name) {
        manageHouseForm.wifiSettings().click();
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.textWiFiList().shouldBe(appears);
        manageHouseForm.buttonAddWiFi().click();
        manageHouseForm.picConnectionWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.fieldNameWiFi().sendKeys(name);
        manageHouseForm.passWiFi().sendKeys(pass);
        manageHouseForm.showPassWiFi().click();
        manageHouseForm.passWiFi().shouldHave(text(pass));
        manageHouseForm.buttonSaveWiFi().click();
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
    }

    @Step("Проверить отображение WiFi")
    public void checkWiFi(String name, int i) {
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.nameWiFi(name).shouldBe(appears);
        manageHouseForm.buttonSettingWiFi(i).shouldBe(appears);
        manageHouseForm.connectedDevices(i).shouldBe(appears);
    }

    @Step("Редактировать Wi-Fi")
    public void editWifi(String pass, String name, int i) {
        manageHouseForm.wifiSettings().click();
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.textWiFiList().shouldBe(appears);
        manageHouseForm.buttonSettingWiFi(i).click();
        manageHouseForm.textEditWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.fieldNameWiFi().shouldHave(text(name));
        manageHouseForm.fieldNameWiFi().sendKeys(name + "test");
        manageHouseForm.showPassWiFi().click();
        manageHouseForm.passWiFi().shouldHave(text(pass));
        manageHouseForm.passWiFi().sendKeys(name);
        manageHouseForm.buttonSaveWiFi().click();
    }

    @Step("Проверить настройки Wi-Fi")
    public void checkEditWifi(String name, int i) {
        manageHouseForm.buttonSettingWiFi(i).click();
        manageHouseForm.textEditWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.fieldNameWiFi().shouldHave(text(name + "test"));
        manageHouseForm.showPassWiFi().click();
        manageHouseForm.passWiFi().shouldHave(text(name));
    }

    @Step("Удалить Wi-Fi")
    public void deleteWifi(String name, int i) {
        manageHouseForm.wifiSettings().click();
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.textWiFiList().shouldBe(appears);
        manageHouseForm.buttonSettingWiFi(i).click();
        manageHouseForm.textEditWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.buttonDeleteWiFi().click();
        manageHouseForm.picWiFi()
                .waitUntil(visible,30000);
        manageHouseForm.nameWiFi(name).shouldNotBe(appears);
    }


    @Step("Проверка статистики потребления")
    public void consumptionStatistic(String name, int i) {
        manageHouseForm.statistics().click();
        statisticsForm.textHeader("Statistic")
                .waitUntil(visible,30000);
        statisticsForm.calendar().shouldBe(appears);
        statisticsForm.statisticChart().shouldBe(appears);
        statisticsForm.tabDots(i).click();
        statisticsForm.consumption(name).shouldBe(appears);
        statisticsForm.calendar().click();
    }

}
