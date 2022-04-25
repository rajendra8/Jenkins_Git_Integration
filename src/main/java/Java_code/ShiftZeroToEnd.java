package Java_code;


import java.util.*;

public class ShiftZeroToEnd {

    public static void zeroArr() {
        int[] zeroSift = {1, 3, 2, 0, 1, 0, 4};
        int size = zeroSift.length;
        int pos = 0;

        for (int i = 0; i < zeroSift.length; i++) {
            if (zeroSift[i] != 0)
                zeroSift[pos] = zeroSift[i];
            pos++;

        }
        for (; pos < zeroSift.length; pos++) {
            zeroSift[pos] = 0;
        }

        System.out.printf("1");
        for (int add : zeroSift) {
            System.out.print(add);
        }
    }

    public static void shiftZero() {
        int[] nums = {1, 2, -3, 4, 0, 0, 5, 0, -6, 7};
        //out={1,2,-3,4,5,-6,7,0,0,0,0}
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                System.out.print(nums[pos]);
                pos++;
            }
        }
        System.out.println("POS " + pos);
        for (; pos < nums.length; pos++) {
            nums[pos] = 0;

        }
        for (int add : nums)
            System.out.print(add);
    }


    public static void ipAddress() {
        String a = "255.100.100.100";

        boolean dot = a.contains(".");
        boolean num = a.contains("2");
        char[] ch = a.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] > 0 && ch[i] < 255) {
                System.out.println("it has range from 0 to 255");
            }
            if (ch.length == 14) {
                System.out.println("its has 12 digit");
            }

        }
        for (int i = 3; i < ch.length; i += 3) {
            if (ch[i] == '.' && ch[i] < 255) {
                System.out.println("it has 3 dot");
            } else {
                System.out.println("it does not have 3 dot");
            }
        }

    }

    public static void sumOf_digit_In() {
        int in = 12345;
        //op=15

        int sum = 0;

        while (in != 0) {
            int rem = in % 10;
            sum = sum + rem;
            in = in / 10;
        }

        System.out.println(Integer.toString(sum));
    }


    public void reversTheNum() {
        int in = 12345;
        //op=54321;

        int rev = 0;
        while (in != 0) {
            int rem = in % 10;//5,4,3
            rev = rev * 10 + rem;   //0+5,50+4,540+3
            in = in / 10;   //1234,123,12
        }
        System.out.println(rev);
    }

    public boolean isPrime(int in) {
        //num which has no positive divisor, can divisable by 1 or itself
        //op=true
        if (in == 0 || in < 1) {
            return false;
        }
        for (int i = 2; i < in; i++) {
            if (in % i == 0) {
                System.out.println("its not prime");
                return false;
            }
        }
        System.out.println("its prime");
        return true;
    }

    public void min_Max_in_Array() {
        int[] in = {12, 32, 99, 323, 12, 12, -1, 1, 24, 54, 63, 1, 3, 76};
        //op=76
        int max = in[0];
        int min = in[0];

        for (int i = 1; i < in.length; i++) {
            if (in[i] > max) {
                max = in[i];
            }
            if (min > in[i]) {
                min = in[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public void getMaxValue_from_Map() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 32);
        map.put(2, 44);
        map.put(3, 64);
        map.put(4, 87);
        map.put(5, 98);

        Integer max = 0;

        for (Map.Entry entry : map.entrySet()) {
            int maxvalue = Collections.max(map.values());


        }
    }

    public void duplicate_from_array() {
        int[] in = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        for (int i = 0; i < in.length; i++) {

//         int index=in[i] % in;
//            in[index]+=in[i]/in;
//            }

        }

    }
        public static void main(String[]arg){
            ShiftZeroToEnd test = new ShiftZeroToEnd();
//          test();
//          zeroArr();
            //  ipAddress();
            //     sumOf_digit_In();
            //    test.reversTheNum();
            //  test.isPrime(42);
            // test.min_Max_in_Array();
            //  shiftZero();
            test.duplicate_from_array();
        }


    }

