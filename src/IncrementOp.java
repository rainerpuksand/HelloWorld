public class IncrementOp {

    public static void main(String[] args) {


      /* int b = 4;
         b++;
         b = b+8;
         b+=5;
         b/=3;
         b*=4;

        System.out.println('b' + ++b);
*/



        /*int a = 10;

        a = a + 1;
        a++;

        a = a - 1;
        a--;
        //a**; error  & a//.. ?


        System.out.println("Value of a = " + a);

        System.out.println("==================\n");

        a= a+2;
        a+=2;
        a+=5;

        System.out.println("value of a = " + a);
        //HW try a--; a-=5;

        System.out.println("=================\n");

        a=10;
        a = a * 10;
        a*=10;

        a/=10;

        System.out.println("multiplied a = " + a);
        System.out.println("=================\n");*/

        /*int x = 6;
        x++;
        System.out.println("Post Increment: " + x++);
        System.out.println("Pre Increment: " + ++x);
        System.out.println(x);

        System.out.println("=================\n");*/

        int x=10;
        //int ans = 2 * (x + x);
        int ans = 2 * (x++ + x) ;//try with ++x
        System.out.println("ans = " + ans);
        System.out.println("x = " +x);











    }//psvm
}
