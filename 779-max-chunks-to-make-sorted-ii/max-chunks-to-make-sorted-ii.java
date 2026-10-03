class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int [] p_max = new int[n];
        int [] s_min = new int[n];
        int chunks = 1;

        p_max[0] = arr[0];
        for (int i =1 ; i< n ; i++){
            p_max[i] = Math.max(arr[i],p_max[i-1]);
        }
        s_min[n-1]= arr[n-1];
        for (int i = n-2 ; i>=0 ; i--){
            s_min[i] = Math.min(arr[i],s_min[i+1]);
        }
        for (int i=0 ; i < n-1 ; i++){
            if(p_max[i] <= s_min[i+1]){
            chunks++;
        }

        }
        
        return chunks++;

       
    }
}