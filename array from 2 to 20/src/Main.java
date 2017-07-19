/**
 * Created by adavi on 19.07.2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayVRiadok vRiadok = new ArrayVRiadok();

        vRiadok.arrayVRiadok();
        System.out.println();
        ArrayVStovpchyk vStovpchyk = new ArrayVStovpchyk();

        vStovpchyk.arrayVStovpchyk();

    }

    public static class ArrayVRiadok {
        public void arrayVRiadok() {
            int n = 10;
            int arr[] = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {


                k += 2;
                arr[i] = k;
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static class ArrayVStovpchyk {
        public void arrayVStovpchyk() {
            int n = 10;
            int arr[] = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {


                k += 2;
                arr[i] = k;
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
}
