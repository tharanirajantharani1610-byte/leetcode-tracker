// Last updated: 09/07/2026, 10:12:50
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num>0){
                sum = sum+num%10;
                num = num / 10;

            }
            num = sum;
        }
        return num ;
    }   
}