public class LoopsNested2 {

    public static void main(String[] args) {

        for(int j = 1; j<=10; j++) {
            for (int i = 1; i <= 10; i++) {

                if(j==1 || j == 10){
                    System.out.print("#  ");
                }
                else if(i==1 || i == 10){
                    System.out.print("#  ");
                }
                else if(i==j){
                    System.out.print("#  ");
                }
                else if(i+j == 11){
                    System.out.print("#  ");
                }
                else {
                    System.out.print("*  ");
                }



            }//===i
            System.out.println();


        }//==j


    }//psvm
}//class

