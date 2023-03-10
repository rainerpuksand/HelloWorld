public class AndAndOrOr {

    public static void main(String[] args) {

        String str = null;
        int x=0, y=0;

        if((str==null) || (str.length()==1) ){// put single OR for error
            System.out.println("woooohoooo");
        }

        if((x==0) & (y==0) ){
            System.out.println("x and y are 0");
        }

        if((x==0) & (++y == 1)){
            System.out.println(x + "|" + y);
        }

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        y=0;
        if((x==5) && (++y == 1)){//put &&
            System.out.println("This should never print"); //result is not imp. we only want to see if 2nd condition is checked or not
        }
        System.out.println(x + "|" + y);

    }
}
