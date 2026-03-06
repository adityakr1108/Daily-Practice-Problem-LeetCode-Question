class Solution {
    public boolean checkOnesSegment(String s) {
        int lastOneIndex = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == '1' && i - lastOneIndex > 1){
                return false;
            }
            else if(s.charAt(i) == '1'){
                lastOneIndex = i;
            }

        }
        return true;
    }
}