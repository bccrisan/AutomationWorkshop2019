import java.nio.charset.Charset;
import java.util.Random;

public class BogdanCrisanWeek1Homework {
    public static void main(String[] args) {
//        Prerequisite
        Random rand = new Random();

//        primitive values
        boolean isThisATest = true;
        char shouldContainOnlyChars = 'A';
        int javaVersion = 11;
        long testingLongFormat = 8000000L;
        float javaVersionBuild = 1.80f;
        double javaVersionShort = 1.8;

        if(isThisATest){
            System.out.println("The test is true!");
            System.out.println("This should be a single char: \"" + shouldContainOnlyChars + "\"");
            System.out.println("This should be an integer that shows the java version: \"" + javaVersion + "\"");
            System.out.println("We are testing the long format too, E.G: \"" + testingLongFormat + "\"");
            System.out.println("Java version Build uses the float format: \"" + javaVersionBuild + "\"");
            System.out.println("And java version uses the short format: \"" + javaVersionShort+ "\"");
        }
//      Non-primitive values.
        String testString = "This is a test string";
        System.out.println(testString);

        int[] intArray = new int[5];
        for(int i=0;i<intArray.length;i++){
            intArray[i] = rand.nextInt(1024);
        }

        for(int i=0;i<intArray.length;i++){
            System.out.println("The value of the intArray[" + i + "} is = " + intArray[i]+".");
        }


        String[] stringArray = new String[5];
        byte[] array = new byte[7];
        new Random().nextBytes(array);

        for(int i=0;i<stringArray.length;i++){
            String randomTestString = new String(array, Charset.forName("ASCII"));
            stringArray[i] = "Test string is: " + randomTestString;
        }

        for(int i=0;i<stringArray.length;i++){
            System.out.println("The string is: " + stringArray[i]);
        }

        int a = 1;
        int b = 5;

        b++;
        System.out.println("The variables \"a\" is equal to " + a + " and the variable \"b\" is equal to " + b);

        double c = b/(a += 1);
        System.out.println(c);
        System.out.println(a < b);
        System.out.println(b < a);
        System.out.println(b == a);



        if(a > b){
            System.out.println(a + " is greater then " + b);
        }else if (b > a){
            System.out.println(b + " is greater then " + a);
        }else{
            System.out.println(a + " is equal to " + b);
        }



        int[] arrayOfTenElements = new int[10];
        for(int i=0;i<arrayOfTenElements.length;i++){
            arrayOfTenElements[i] = rand.nextInt(100);
            if(i == 3){
                arrayOfTenElements[3] = 15;
            }
        }
        for(int i=0;i<arrayOfTenElements.length;i++){
            if(arrayOfTenElements[i] != 15){
                System.out.println(i + ". The random number is: " + arrayOfTenElements[i]);
            }else{
                System.out.println(i + ". I don't want to print this!! >_<");
            }

        }
    }
}