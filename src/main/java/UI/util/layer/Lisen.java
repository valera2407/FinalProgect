package UI.util.layer;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lisen implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("OK, everything is success. ");
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Sorry, but something isn`t OK, you`r test is failure, please look your test"
                + result.getTestName());
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Sorry, but something isn`t OK, you`r test is skipped, please look your test"
                + result.getTestName());
        ITestListener.super.onTestSkipped(result);
    }
}
