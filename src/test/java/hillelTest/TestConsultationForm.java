package hillelTest;

import Configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestConsultationForm extends BaseClass {
    private static final String urlHillel = "https://ithillel.ua/";
    private static final String titleHillel = "Комп'ютерна школа Hillel у Києві: Курси IT-технологій";
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(urlHillel);

        if(!driver.getTitle().equals(titleHillel)){
            System.out.println("Title not equals");
        }
        WebElement freeConsultation = driver.findElement(By.id("btn-consultation-hero"));
        freeConsultation.click();
        WebElement name = driver.findElement(By.id("input-name-consultation"));
        name.sendKeys("Anastasiia");
        WebElement email = driver.findElement(By.id("input-email-consultation"));
        email.sendKeys("anastasiia@gmail.com");
        WebElement phone = driver.findElement(By.id("input-tel-consultation"));
        phone.sendKeys("63 533 8242");
        WebElement socIcon = driver.findElement(By.xpath("//button[contains(@data-name,\"tg\")]"));
        socIcon.click();
        WebElement socIconInput = driver.findElement(By.name("tg"));
        socIconInput.sendKeys("@AZ");
        WebElement course = driver.findElement(By.id("listbox-btn-input-course-consultation"));
        course.click();
        WebElement searchCourse = driver.findElement(By.className("listbox_search-input"));
        searchCourse.sendKeys("QA");
        WebElement aqaJava = driver.findElement(By.xpath("//li[contains(@data-entry-id,'129290')]"));
        aqaJava.click();
        WebElement checkBox = driver.findElement(By.className("checkbox_checkmark"));
        checkBox.click();
        Thread.sleep(5000);
        driver.quit();



    }
}
