public class StringsSix {

    public static void main(String[] args) {


        String str = "today we make our programming logic stronger!";

        System.out.println(str.replace('o', 'X'));
        System.out.println(str);

        System.out.println("==============");

        String s = "hello How are you?";
        System.out.println("First 3: " + s.substring(0,3)); //means indexNumbers
        System.out.println(s.substring(6, 13)); // substring(includes, excludes)
        System.out.println(s.substring(6));
        System.out.println("Last 3: ???" );

        int x = s.length();
        System.out.println("last 3: " + s.substring(x-3) );



        System.out.println("==============");

        String Order_Num = "23-A33/yohan";
        int position = Order_Num.indexOf('/');
        String name = Order_Num.substring(position+1);//... solved?
        System.out.println("Name: " + name);

        //power guns:      Tx-Ray-750, Tx-Ray-300
        //client history   yw/45/87/34/91

        System.out.println("************************");

        String gun = "Tx-Ray-300";
        String[] arr = gun.split("-");
        System.out.println(arr[2]);
        System.out.println(arr[0]);

        String bill = "yw/45/87/34/91";
        String[] arr2 = bill.split("/");
        System.out.println(arr2[4]);

    }
}
