package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeWays {
   
    public static void main(String args[]){
        int s[]={1,2,3};
        int target=4;
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        int ways=findWays(s,target,s.length,dp);
        System.out.println(ways);
    }
    public static int findWays(int c[],int target,int length,int dp[]){
            if(target==0){
                return 1;
            }
            int answer=0;
            for(int i=0;i<c.length;i++){
                    if((target-c[i])>=0){
                        int subAnswer=0;
                            if(dp[target-c[i]]!=-1){
                                subAnswer=dp[target-c[i]];
                            }
                            else{
                                subAnswer=findWays(c,target-c[i],length,dp);
                                
                            }
                            answer=subAnswer+1;
                    }
            }

            return dp[target]=answer;
    }
    
    

}
