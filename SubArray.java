/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subarray;
import java.util.*;
/**
 *
 * @author KapilAkaKp
 */
public class SubArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            System.out.print(arr[i]);
        }
        int b=arr[0];
        for(int i=1;i<n;i++)
        {
            b=b+arr[i];
            if(b>arr[i-1])
            {
                b=b;
            }
            else
            {
                b=b-arr[i];
            }
        }
        System.out.println(" "+b);
    }
    
}
