public class ArrayApp2 {

    public static void main(String[] args) {

        int[] arrayInt1 = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("Length: " + arrayInt1.length );


        int x = arrayInt1.length;
        for(int i = 0; i <= x; i++ ){
            System.out.println(arrayInt1[i]);
        }

        for(int val : arrayInt1){
            System.out.println("Enhanced FOR: " + val);
        }


       /* int x = arrayInt1.lenght;
        for

        int [] arrayInt1 = {100,200,300,400,500,600};
        System.out.println(arrayInt1);*/




    }//psvm
}
