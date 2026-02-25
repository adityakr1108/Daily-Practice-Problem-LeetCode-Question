class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int ans[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,Integer.bitCount(arr[i]));
            min = Math.min(min,Integer.bitCount(arr[i]));
        }
        int insertPos = 0;
        while(min <= max && insertPos < arr.length){
            int j = 0;
            while(j<arr.length){
                if(Integer.bitCount(arr[j]) == min){
                    ans[insertPos] = arr[j];
                    insertPos++;
                }
                j++;
            }
            min++; 
        }
        return ans;
    }

}