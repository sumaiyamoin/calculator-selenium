import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {
    @Test
    public void doCalculation() throws InterruptedException {
        CalcPage calcPage=new CalcPage(driver);
        calcPage.doSum();
        calcPage.doSubtraction();
    }
}
