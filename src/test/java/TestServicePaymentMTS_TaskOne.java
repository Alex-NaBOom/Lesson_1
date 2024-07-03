import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServicePaymentMTS_TaskOne {
    private static final String PAGE_URL = "https://mts.by";
    private static final By ACCEPT_BUTTON = By.cssSelector("#cookie-agree");
    private static final By BUTTON_PAYMET = By.xpath("//button[@class = 'select__header']");
    private static final By SELECTION_PAYMET_USLYGI_SVYAZI = By.xpath("//p[@class='select__option'][text()='Услуги связи']");
    private static final By FIELD_CONNECTION_PHONE = By.xpath("//input[@id = 'connection-phone']");
    private static final By FIELD_CONNECTION_SUM = By.xpath("//input[@id = 'connection-sum']");
    private static final By FIELD_CONNECTION_EMAIL = By.xpath("//input[@id = 'connection-email']");
    private static final By SELECTION_PAYMET_DOMASHNIY_INTERNET = By.xpath("//p[@class='select__option'][text()='Домашний интернет']");
    private static final By FIELD_INTERNET_PHONE = By.xpath("//input[@id = 'internet-phone']");
    private static final By FIELD_INTERNET_SUM = By.xpath("//input[@id = 'internet-sum']");
    private static final By FIELD_INTERNET_EMAIL = By.xpath("//input[@id = 'internet-email']");
    private static final By SELECTION_PAYMET_RASSROCHKA = By.xpath("//p[@class='select__option'][text()='Рассрочка']");
    private static final By FIELD_INSTALMENT_SCORE = By.xpath("//input[@id = 'score-instalment']");
    private static final By FIELD_INSTALMENT_SUM = By.xpath("//input[@id = 'instalment-sum']");
    private static final By FIELD_INSTALMENT_EMAIL = By.xpath("//input[@id = 'instalment-email']");
    private static final By BUTTON_PAYMET_ZADOLZHENNOST = By.xpath("//p[@class='select__option'][text()='Задолженность']");
    private static final By FIELD_ARREARS_SCORE = By.xpath("//input[@id = 'score-arrears']");
    private static final By FIELD_ARREARS_SUM = By.xpath("//input[@id = 'arrears-sum']");
    private static final By FIELD_ARREARS_EMAIL = By.xpath("//input[@id = 'arrears-email']");

    private WebDriver driver;

    @BeforeEach
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(PAGE_URL);
        driver.findElement(ACCEPT_BUTTON).click();

    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : Услуги связи")
    void testPaymetUslugiSvyaziField() {

        driver.findElement(BUTTON_PAYMET).click();
        driver.findElement(SELECTION_PAYMET_USLYGI_SVYAZI).click();
        WebElement phoneInputField = driver.findElement(FIELD_CONNECTION_PHONE);
        assertEquals("Номер телефона", phoneInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Номер телефона\"");
        WebElement sumInputField = driver.findElement(FIELD_CONNECTION_SUM);
        assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Сумма\"");
        WebElement emailInputField = driver.findElement(FIELD_CONNECTION_EMAIL);
        assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"E-mail для отправки чека\".");

    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : Домашний интернет")
    void testPaymetDomashniyInternet() {

        driver.findElement(BUTTON_PAYMET).click();
        driver.findElement(SELECTION_PAYMET_DOMASHNIY_INTERNET).click();
        WebElement phoneInputField = driver.findElement(FIELD_INTERNET_PHONE);
        assertEquals("Номер абонента", phoneInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Номер абонента\"");
        WebElement sumInputField = driver.findElement(FIELD_INTERNET_SUM);
        assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Сумма\"");
        WebElement emailInputField = driver.findElement(FIELD_INTERNET_EMAIL);
        assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"E-mail для отправки чека\"");

    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : Рассрочка")
    void testPaymetRassrochka() {

        driver.findElement(BUTTON_PAYMET).click();
        driver.findElement(SELECTION_PAYMET_RASSROCHKA).click();
        WebElement accountNumberInputField = driver.findElement(FIELD_INSTALMENT_SCORE);
        assertEquals("Номер счета на 44", accountNumberInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Номер счета на 44\"");
        WebElement sumInputField = driver.findElement(FIELD_INSTALMENT_SUM);
        assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                "Текст не совпадает с ожидаемым \"Сумма\"");
        WebElement emailInputField = driver.findElement(FIELD_INSTALMENT_EMAIL);
        assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                "Текст  не совпадает с \"E-mail для отправки чека\"");

    }


    @Test
    @DisplayName("Проверить надписи в незаполненных полях : Задолженность")
    void testPaymetZadolzhennost() {

        driver.findElement(BUTTON_PAYMET).click();
        driver.findElement(BUTTON_PAYMET_ZADOLZHENNOST).click();
        WebElement accountNumberInputField = driver.findElement(FIELD_ARREARS_SCORE);
        assertEquals("Номер счета на 2073", accountNumberInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Номер счета на 2073\"");
        WebElement sumInputField = driver.findElement(FIELD_ARREARS_SUM);
        assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"Сумма\"");
        WebElement emailInputField = driver.findElement(FIELD_ARREARS_EMAIL);
        assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                "Текст не совпадает с \"E-mail для отправки чека\"");

    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

}
