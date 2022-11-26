import java.io.*;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class kadane_algorithm {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine().trim());
    int a[]= new int[n];
    String[] strs = br.readLine().trim().split(" ");
    
    for (int i = 0; i < strs.length; i++) {
    a[i] = Integer.parseInt(strs[i]);
    }
    int max_so_far=Integer.MIN_VALUE, max_ending_here=0;
    for (int i = 0; i < n; i++) {
        max_ending_here = max_ending_here + a[i];
        if (max_so_far < max_ending_here)
            max_so_far = max_ending_here;
        if (max_ending_here < 0)
            max_ending_here = 0;
    }
    System.out.println(max_so_far);
}
} 
