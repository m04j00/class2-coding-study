class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++){
            for(int j = i + 1; j < nums.length-1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum) == true) answer++;
                }
            }
        }     
        return answer;
    }

    private boolean isPrime(int num){
        if(num == 0 || num == 1) return false;

        for(int i=2; i<num/2; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}