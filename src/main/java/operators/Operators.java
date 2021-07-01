package operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Operators {
    // TODO
    /**
     * 1. Create class for each operators
     * 2. Write code explaining each operator in each class
     */
}

class AssigmentOperators {

    public static void main(String[] args) {
        int a = 10;                  // Local int var
        a += 2;                      // Assigned a = a +2; --> a = 2;
        System.out.println(a);
        System.out.println(a -= 10);
        System.out.println(a *= 3);
        System.out.println(a /= 2);
        System.out.println(a %= 2);
    }

}

class ArithmeticOperators {

    String str1;
    short s1;
    static int a;

    public static void main(String[] args) {
        ArithmeticOperators obj = new ArithmeticOperators();
        obj.str1 = "def";
        String str = "";
        str = str + "abc";
        System.out.println(str + obj.str1);
        obj.s1 = 10;
        ++a;
        a += a;
        System.out.println((2 + obj.s1 - 6) / 3 % a);

    }
}

class LogicalOperators {

    static int a = 5;
    static int a1 = 6;
    static int a2 = 8;
    static int a3 = 5;
    static boolean b1;

    public static void main(String[] args) {
        int value = 8;
        int count = 10;
        int limit = 11;
        String str = "abc";
        String str2 = "abc";
//        System.out.println(str == str2);


        if (a <= a3 && a1 >= a2) {
            boolean b1 = true;
        } else if (a1 > a2 || a1 < a2) {
            boolean b1;
        }
//        System.out.println(b1);
        int arr[] = {1, 2, 35, 45, 255, 1562};
//        boolean b2 = arr[1] % 2 ==0;
//        System.out.println(b2);

//       arr[1]%2==0 ? System.out.println("it's an even number") : System.out.println("it's an odd number");
        // why not working?
        if (!(++value % 2 == 0) && ++count <= limit) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

class Ternary {
    public static void main(String[] args) {
        int num = 425;
        int num2 = 30;
        int num3 = 46;

        //   boolean res = (num < 40) ? true : false;
        int ans = (num > num2) ? num : num2;
        int res = (ans > num3) ? ans : num3;
        System.out.println(res);
        int max = Math.max(num, num2);
        int great = Math.max(max, num3);
        System.out.println(great);
    }
}



