import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    AndroidElement btn7;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement btn5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/eq")
    AndroidElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    AndroidElement btn1;
    @FindBy(id = "com.google.android.calculator:id/digit_0")
    AndroidElement btn0;
    @FindBy(id="com.google.android.calculator:id/op_sub")
    AndroidElement btnMinus;

    public CalcPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void doSum() throws InterruptedException {
        Thread.sleep(3000);
        btn5.click();
        btnPlus.click();
        btn7.click();
        btnEqual.click();


    }
    public void doSubtraction() throws InterruptedException {
        Thread.sleep(3000);
        btn1.click();
        btn0.click();
        btnMinus.click();
        btn5.click();
        btnEqual.click();
    }
}
