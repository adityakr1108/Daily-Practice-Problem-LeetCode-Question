class Solution {
    public int minOperations(String s) {
        // int countOfZero = 0;
        // for(int i = 0;i<s.length();i++){
        //     if(s.charAt(i) == "0"){
        //         countOfZero++;
        //     }
        // }
        // int countOfOne = s.length() - countOfZero;

        String s1 = "0";
        String s2 = "1";
        for(int i = 1;i<s.length();i++){
            s1  += s1.charAt(i-1) == '0' ? "1": "0";
            s2  += s2.charAt(i-1) == '1' ?  "0" : "1";
        }

        int minChangeS1 = 0;
        int minChangeS2 = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s.charAt(i)){
                minChangeS1++;
            }
            if(s2.charAt(i) != s.charAt(i)){
                minChangeS2++;
            } 
        }


        return Math.min(minChangeS1,minChangeS2);

    }
}