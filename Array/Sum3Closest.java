import java.util.Arrays;
//leetcodeNo:16
public class Sum3Closest {
    public static void main(String ...args){
            int arr[]={-4,-1,1,2};
            int target=1;
            Solution object=new Solution();
            int answer=object.threeSumClosest(arr,target);
            System.out.println("Answer is=>"+answer);

    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //we have an array nums
        //sort this array
        Arrays.sort(nums);
        int sum=0;
        boolean flag=true;
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            int insidesum=0;
            while(low<high){
                insidesum=nums[i]+nums[low]+nums[high];
                if(insidesum==target){
                    return insidesum;
                }
                else if(insidesum<target){
                    low++;
                }
                else if(insidesum>target){
                    high--;
                }
                if(flag||Math.abs(sum-target)>Math.abs(insidesum-target)){
                    sum=insidesum;
                    flag=false;
                }
               
            }
        }
        return sum;
        
    }
}