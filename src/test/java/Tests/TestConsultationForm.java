package Tests;

import Configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import javax.xml.crypto.Data;

public class TestConsultationForm extends BaseClass {
    private static final String urlHillel = "https://ithillel.ua/";
    private static final String titleHillel = "Комп'ютерна школа Hillel у Києві: Курси IT-технологій";

    @BeforeClass
    public static void startSite() {
        driver.manage().window().maximize();
        driver.get(urlHillel);
        if(!driver.getTitle().equals(titleHillel)){
            System.out.println("Title not equals");
        }
        driver.findElement(By.id("btn-consultation-hero")).click();
    }
    @Test
    public void testNameField(){
        WebElement name = driver.findElement(By.id("input-name-consultation"));
        name.sendKeys("Anastasiia");
    }
    @Test
    public void testEmailField()
    {
        WebElement email = driver.findElement(By.id("input-email-consultation"));
        email.sendKeys("anastasiia@gmail.com");
    }
    @Test
    public void testPhoneField(){
        WebElement phone = driver.findElement(By.id("input-tel-consultation"));
        phone.sendKeys("63 533 8242");
    }
    @Test
    public void testSocialIcon(){
        WebElement socIcon = driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]/button[1]"));
        socIcon.click();
        WebElement socIconInput = driver.findElement(By.name("tg"));
        socIconInput.sendKeys("@AZ");
    }
    @Test
    public void testSelectedCourse(){
        WebElement course = driver.findElement(By.id("listbox-btn-input-course-consultation"));
        course.click();
        WebElement searchCourse = driver.findElement(By.className("listbox_search-input"));
        searchCourse.sendKeys("QA");
        WebElement aqaJava = driver.findElement(By.xpath("//*[@id=\"container-input-course-consultation\"]/div/ul/li[18]"));
        aqaJava.click();
    }
    @Test
    public void testCheckbox(){
        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"form-consultation\"]/div[1]/footer/div[1]/label/span"));
        checkBox.click();
    }
}
