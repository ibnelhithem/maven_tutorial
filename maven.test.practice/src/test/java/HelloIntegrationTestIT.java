
public class HelloIntegrationTestIT {
    // when we try to run the integration test with junit5 it will not run
    // because in this project we use sop which use junit4
    @org.testng.annotations.Test
    public void test1(){
        System.out.println("Hello integration test with failsafe");
    }

    @org.testng.annotations.Test
    public void testCallModues(){
        CallModules callModules = new CallModules();
        callModules.calledMethods();
        OutPutClass outPutClass = new OutPutClass();
        outPutClass.sayHallo();
    }
    User UserCommandToUser (UserCommand userCommand){
        return new User();
    }
}
