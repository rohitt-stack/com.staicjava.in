package Daily_Practice.java;

public class Sec8_CountWords_or_Replace {

        public static void main(String[] args) {

            String str = "I Love Java";

            String arr[] = str.split(" ");

            System.out.println("Words = " + arr.length);

            String str1 = "I Love Java";
            str1 = str1.replace(" ","");
            System.out.println(str1);
        }
    }

