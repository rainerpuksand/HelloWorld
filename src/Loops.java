public class Loops {

    public static void main(String[] args) {
        int i =0;

        while(i<=10){
            System.out.println("while Loop: " + i);
            i++;
        }

        System.out.println("---------------------");




        i= 0;
        do{
            System.out.println("do-while Loop: " + i);
            i++;

        }while(i<=10);

        System.out.println("---------------------");





        for(i=0; i<=10; i++){
            System.out.println("for Loop: " + i);
        }

        System.out.println("---------------------");



        for(i=2; i<=20; i+=2){
            System.out.println("Even numbers: " + i);
        }

        System.out.println("---------------------");




        for(i=1; i<=20; i+=2){
            System.out.println("Odd numbers: " + i);
        }
        System.out.println("---------------------");



         // COUNTDOWN i==0? i>=0? i<=0... 3,2,1,fire.... 3,2,1,0,ignition,fire
       /*for(i=10; ??? ; i--){
            System.out.println("for... CountDown: " + i);
        }*/








    }

}
