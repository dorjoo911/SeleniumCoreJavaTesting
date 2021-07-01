package operators;


public class Test127 {

//    public static void main(String[] args) {
//
//
//        System.out.println(diff21(19));
//        System.out.println(diff21(10));
//        System.out.println(diff21(21));
//
//    }
//
//    public static int diff21(int n) {
//        if(n>21)
//            return (n-21)*2;
//        return (21-n);
//    }
}

class Into_loop {
    public static void main(String[] args) {
//        int[]arr1={2,3,4,5,6,55,6,5,4,};
//    for(int i= 0; i<arr1.length; i++){
//        System.out.println(arr1[i]);
//    }
//    // While only even numbers
//        int index =0;
//        while(index < arr1.length){
//            if (index % 2 ==0){
//                System.out.println("Even numbers are: " + arr1[index]);
//            }
//            index++;
//        }
        // For Each loop only print unique numbers from array:
        int[] arr1 = {2, 3, 4, 5, 6, 5, 6, 5, 4,};
        for (int i : arr1) {
            //    System.out.println(i); //Print all array index values.
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        // After sorting
        for (int i : arr1) {
            //        System.out.println(i);
        }

        // Remove duplicated from array.
        int dup = 0;
        arr1[dup] = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[dup] != arr1[i]) {
                dup++;
                arr1[dup] = arr1[i];
            }
        }
        for (int i = 0; i < dup; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static int[] removeDuplicates(int[] arr) {

        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for (int i = 0; i < end; i++) {
            whitelist[i] = arr[i];
        }
        return whitelist;
    }
}