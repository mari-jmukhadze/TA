//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElements {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

        WebElements element = (WebElements) driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        for (int i = 0; i < 3; i++) {
            element.click();
        }
        WebElements lastDelete = (WebElements) driver.findElement(By.xpath("//*[@id=\"elements\"]/button[3]"));

        System.out.println(lastDelete.getText());

        WebElements lastDeletecss = (WebElements) driver.findElements(By.cssSelector("//body[starts-with(@class, 'added')"));
        System.out.println(lastDeletecss.getText());
    }

    @Test
    public void secondTEst(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://the-internet.herokuapp.com/challenging_dom");

        WebElements elementRow= (WebElements) driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]"));
        WebElements elementRow2= (WebElements) driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]following-sibling::tr"));

    }

}

//dro ar meko samwuxarod, dzlivs davasetupe project.