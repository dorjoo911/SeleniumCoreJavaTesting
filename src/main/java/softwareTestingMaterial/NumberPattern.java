package softwareTestingMaterial;

public class NumberPattern {
    public static void main(String[] args) {

        //        *** PRINTING TRIANGLE SHAPED STARS ***
//        for(int x=1; x<=5; x++){
//            for(int y=1; y<=x; y++){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }

//        *** PRINTING PYRAMID SHAPED STARS ***
//        int x, y, row = 6;
//        for(x=0; x<row; x++){
//            for(y=row-x; y>1; y--){
//                System.out.print(" ");
//            }
//            for(y=0; y<=x; y++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //*** FIBONACCI SERIES ***
//        int a =0, b = 1, c, i, count = 10;
//        System.out.print(a+" "+b);
//        for (i=2; i<count; i++){
//            c = a + b;
//            System.out.print(" "+c);
//            a = b;
//            b = c;
//        }

//        //*** REVERSE STRING ***
//        StringBuilder a = new StringBuilder("Software Testing Material");
//        System.out.println(a.reverse().toString());

        //*** REVERSE STRING ***
//        String input = "Software Testing Material";
//        StringBuilder input1 = new StringBuilder();
//        input1.append(input);
//        input1 = input1.reverse();
//        for (int i=0; i<input1.length(); i++){
//            System.out.print(input1.charAt(i));
//        }

        // *** LARGEST VALUE ***
//        int[]arr={-121,551,-54515,5145,4151,3};
//        int val=arr[0];
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]>val){
//                val=arr[i];
//            }
//        }
//        System.out.println("Largest value is: "+val);

        // *** DISPLAY PRIME NUMBERS ***
//        int i =0;
//        int num =0;
//        String primeNumbers ="";
//        for (i=1; i<=100; i++){
//            int counter =0;
//            for (num=i; num>=1; num--){
//                if(i%num==0){
//                    counter++;
//                }
//            }
//            if (counter==2){
//                primeNumbers = primeNumbers +i +" ";
//            }
//        }
//        System.out.println("Prime numbers from 1 to 100 are: ");
//        System.out.println(primeNumbers);
    }
}
