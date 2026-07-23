// Last updated: 23/07/2026, 10:09:22
class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        
        String result = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            
            for (int j = 0; j < result.length(); j++) {
                
                if (j + 1 == result.length() || result.charAt(j) != result.charAt(j + 1)) {
                    current.append(count).append(result.charAt(j));
                    count = 1; 
                } else {
                    count++;
                }
            }
            
            result = current.toString();
        }
        
        return result;
    }
}