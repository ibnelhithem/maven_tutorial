import org.junit.jupiter.api.Test;

public class RegexTest {
    @Test
    void regexTest(){
        String s = "2:10pm";
        String pattern = "(\\d{1,2}):(\\d{1,2})(am|pm)";
        String ss = s.replaceAll(pattern, "$1$3");
        System.out.println(s);
        System.out.println(ss);
    }

    @org.junit.Test
    public void name() {
        System.out.println("junit4 test");
    }


    @org.testng.annotations.Test
    public void testMethod2() {
        System.out.println("run testng");
    }
}
