/*
brute force
time complexity: O(n^2)
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

/*
optimized solution
time complexity: O(n)
*/
public static List<int[]> targetSum(int[] array, int target){
  if(array.length < 1)
    return null;
   //use DP 
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      List<int[]> results = new ArrayList<int[]>();
    
      for(int i = 0; i< array.length; i++){
        if(map.containsKey(target - array[i])){
            int [] result = new int[2];
            result[0] = target - array[i];
            result[1] = array[i];
            results.add(result);
        }
          map.put(array[i], 1);
      }
  return results;
}
