import java.util.Arrays;

public class enhancedFor {

    public static void main(String[] args) {

        int[] arrayInt = {10,20,30,40,50};
        String[] arrayStr = {"first", "second", "third", "fourth", "fifth" };

        int len = arrayInt.length;
        for(int i =0; i<len; i++){

            System.out.println(arrayInt[i] + " ... " + arrayStr[i]);
        }

        System.out.println("======================================");

        for ( int i : arrayInt) {
            System.out.println(i);
        }

        //same for String arrya

        for(String str : arrayStr){
            System.out.println(str);
        }



        System.out.println("======================================");

        String str = Arrays.toString(arrayInt);//return type is String & import java.util.Arrays;
        System.out.println(str);

        System.out.println("======================================");

        String line = "first,second,third,fourth,fifth";

        String[] arrayline = line.split(",");


        System.out.println("======================================");
        System.out.println(arrayline[0]);
        System.out.println(arrayline[2]);
        System.out.println(arrayline[4]);
        System.out.println("======================================");



        for ( String i : arrayline) {
            System.out.println(i);
        }





    }
    
    
    
    
    
    
}
