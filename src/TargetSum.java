/*
brute force
time complexity: n^2
*/


public static List<int[]> targetSum(int[] array, int target){
    if(array.length <1)
      return null;
    List<int[]> results = new ArrayList<int[]>();
    
    for(int i = 0; i < array.length; i++){
      for(int j = i+1; j < array.length; j++){
        if(array[i] + array[j] == target){
        int[] result = new int[2];
        result[0] = array[i];
        result[1] = array[j];
        results.add(result);
        }
      }
    }
    return results;
}
