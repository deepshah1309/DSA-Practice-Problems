import java.io.*;
import java.util.*;
public class ReverseTheArray{
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        array_reverse(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
                System.out.println(""+i+"=>value="+array[i]);
        }
    }
    public static void array_reverse(int x[],int start,int end){
        int temp;
            while(start<end){
                temp=x[start];
                x[start]=x[end];
                x[end]=temp;
                start++;
                end--;
            }
    }
}