import java.util.Arrays;

public class SeqList {

    public int[] elem;
    public int usedSize;
    public final static int capacity = 10;

    public SeqList() {
        elem = new int[capacity];
        usedSize = 0;
    }
    public void add(int pos, int data) {
        if(pos <= usedSize) {
            for(int i = usedSize - 1; i >= pos; i--) {
                elem[i + 1] = elem[i];
            }
            elem[pos] = data;
        }
    }
    public static void printarr(int[] arr) {
        for(int val: arr) {
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(int i : arr) {
            System.out.println(i);
        }
        printarr(arr);
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = null;
    }
}
