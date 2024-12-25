package practice;

public class Array {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
