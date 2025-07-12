class Solution {
    public static void permutate(int[] arr,int fi,List<List<Integer>> list){
        if(fi==arr.length-1){
            List<Integer> curr = new ArrayList<>();
            for(int i:arr){
                curr.add(i);
            }
            list.add(curr);
            return;
        }
        for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
            permutate(arr,fi+1,list);
            swap(arr,i,fi);
        }
    }
    public static void swap(int[]arr, int i, int fi){
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutate(nums, 0,list);
        return list;
    }
}
