class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 1;
        int[] p_max = new int[arr.length];
        

        p_max[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            p_max[i] = Math.max(arr[i],p_max[i-1]);
        }
        
        int[] s_min = new int[arr.length];
        s_min[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2 ; i >= 0 ; i--){
            s_min[i]= Math.min(arr[i],s_min[i+1]);
        }

        for (int i= 0 ; i <arr.length-1 ; i++){
            if(p_max[i]<=s_min[i+1]){
                chunks ++;
            }

        }

       return chunks;
    }
}