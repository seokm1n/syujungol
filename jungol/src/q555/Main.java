package q555;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] arr = new char[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

