import java.util.*;
public class MaximumAndMinimum {
    public static void main(String args[]){
        int v[]={1,2,3,4,5};
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        //minimum element code
        for(int i=0;i<v.length;i++){
            if(v[i]<minimum){
                minimum=v[i];
            }
        }
        //maximum element code
        for(int i=0;i<v.length;i++){
            if(v[i]>maximum){
                maximum=v[i];
            }
        }
        System.out.println("Min="+minimum+",maximum="+maximum);
        
    }
}
