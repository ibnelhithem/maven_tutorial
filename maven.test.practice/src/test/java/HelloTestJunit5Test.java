import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HelloTestJunit5Test {

    @Test
    void method1() {
        HelloTestJunit5 helloTestJunit5 = new HelloTestJunit5();
        System.out.println("normal junit5 test");
        assertEquals("hello world",helloTestJunit5.method1());
    }
    
    @Test
    void method2() {
        HelloTestJunit5 helloTestJunit5 = new HelloTestJunit5();
        System.out.println("normal junit5 test2 to check poll from SCM");
        assertEquals("hello world",helloTestJunit5.method1());
    }

    /*@Test
    void xolve(){
        String output = "";
        int count = 3;
        String challenge = "3aabacbebebe";
        System.out.println(solve(challenge));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0;i < challenge.length();i++){
            for (int j=i+1;j<=challenge.length();j++){
                arrayList.add(challenge.substring(i,j));
                System.out.println(challenge.substring(i,j));
            }
        }
        //System.out.println(challenge.chars().distinct().count());
        System.out.println(arrayList.size());
        for (int i = 0; i<arrayList.size();i++){
            if (arrayList.get(i).chars().distinct().count()==count && arrayList.get(i).length() > output.length()){
                output = arrayList.get(i);
            }
        }
        System.out.println(output + " = "+output.length());

    }

    @Test
    public void xolve2(){
        int outPut=-1;
        int[]stock = {10, 9, 8, 2};
        System.out.println(solve2(stock));

        for (int i=0;i<stock.length;i++){
            for (int j=i+1;j<stock.length;j++){
                if (stock[j]-stock[i]>outPut){
                    outPut=stock[j]-stock[i];
                }
            }
        }
        if (outPut<00){
            outPut=-1;
        }
        System.out.println(outPut);
        *

    }

    @Test
    public void xolve3(){

        int val = 0;
        String s = "2:10pm";
        val=Integer.parseInt(s.substring(0,s.indexOf(":")))*60+Integer.parseInt(s.substring(s.indexOf(":")+1,s.indexOf("m")-1));
        if (s.contains("pm")){
            val+=720;
        }
        System.out.println(val);
        *

        int outPut = Integer.MAX_VALUE;
        String []time = {"10:00am", "11:45pm", "5:00am", "12:01am"};
        int [] timeConverter = new int [time.length];
        for (int i=0;i<time.length;i++){
            timeConverter[i]=Integer.parseInt(time[i].substring(0,time[i].indexOf(":")))*60+Integer.parseInt(time[i].substring(time[i].indexOf(":")+1,time[i].indexOf("m")-1));
            if (time[i].contains("pm")&& !time[i].substring(0,time[i].indexOf(":")).equals("12")){
                timeConverter[i]+=720;
            }
            if (time[i].contains("am")&& time[i].substring(0,time[i].indexOf(":")).equals("12")){
                timeConverter[i]-=720;
            }
        }
        for (int min:timeConverter) {
            System.out.println(min);
        }
        Arrays.sort(timeConverter);
        for (int min:timeConverter) {
            System.out.println(min);
        }
        for (int i=timeConverter.length-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if(timeConverter[i]-timeConverter[j]<outPut){
                    outPut = timeConverter[i]-timeConverter[j];
                }
            }
        }
        System.out.println(outPut);
    }

    String solve(String challengeString){
        String output = "";
        int count = Integer.parseInt(challengeString.substring(0,1));
        String challenge = challengeString.substring(1);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0;i < challenge.length();i++){
            for (int j=i+1;j<=challenge.length();j++){
                arrayList.add(challenge.substring(i,j));
            }
        }
        for (int i = 0; i<arrayList.size();i++){
            if (arrayList.get(i).chars().distinct().count()==count && arrayList.get(i).length() > output.length()){
                output = arrayList.get(i);
            }
        }
        return output;
    }
    int solve2(int []stockWorth){
        int outPut=-1;
        int[]stock = stockWorth;
        for (int i=0;i<stock.length;i++){
            for (int j=i+1;j<stock.length;j++){
                if (stock[j]-stock[i]>outPut){
                    outPut=stock[j]-stock[i];
                }
            }
        }
        if (outPut<=0){
            outPut=-1;
        }
        return outPut;
    }
    int solve3(String[]times){
        int outPut = Integer.MAX_VALUE;
        String []time = {"10:00am", "11:45pm", "5:00am", "12:01am"};
        int [] timeConverter = new int [time.length];
        for (int i=0;i<time.length;i++){
            timeConverter[i]=Integer.parseInt(time[i].substring(0,time[i].indexOf(":")))*60+Integer.parseInt(time[i].substring(time[i].indexOf(":")+1,time[i].indexOf("m")-1));
            if (time[i].contains("pm")&& !time[i].substring(0,time[i].indexOf(":")).equals("12")){
                timeConverter[i]+=720;
            }
            if (time[i].contains("am")&& time[i].substring(0,time[i].indexOf(":")).equals("12")){
                timeConverter[i]-=720;
            }
        }

        Arrays.sort(timeConverter);
        for (int min:timeConverter) {
        }
        for (int i=timeConverter.length-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if(timeConverter[i]-timeConverter[j]<outPut){
                    outPut = timeConverter[i]-timeConverter[j];
                }
            }
        }
        return outPut;
    }*/
}
