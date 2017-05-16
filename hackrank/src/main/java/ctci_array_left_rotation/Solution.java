package ctci_array_left_rotation;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by ychai on 5/16/17.
 *
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * 
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt() % n;
        int a[] = new int[n];
        for(int i =0; i < n; i++){
            a[i] = in.nextInt();
        }
        OutputStream out = new BufferedOutputStream(System.out);
        for (int i = k; i < a.length; ++i) {
            out.write(String.format("%d ", a[i]).getBytes());
        }
        for (int i = 0; i < k; ++i) {
            out.write(String.format("%d ", a[i]).getBytes());
        }
        out.flush();
    }
}