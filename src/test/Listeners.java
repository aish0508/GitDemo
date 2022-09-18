package test;

import org.testng.ITest;
import org.testng.ITestListener;

//ITlistener interface which implement tesng listener
public class Listeners  implements ITestListener{
	public void onTestStart(ITest result) {
		
	}
public void onTestSucess(ITest result) {
	//System.out.println("I successfully excuted listener pass code");
		
	}
public void onTestFailure(ITest result) {
	//screenshot code
	System.out.println("I failed excuted listener pass code");

}
public void onTestSkipped(ITest result) {
	
}
public void onTestFailedButWithSuccessPercentage(ITest result) {
	
}
public void onStart(ITest result) {
	
}
public void onFinish(ITest result) {
	
}
	

}
