/*
brute force
time complexity: O(n^3)
*/
public static List<int[]> targetSumII(int[] array, int target){
    if(array.length < 3)
      return null;
      List<int[]> results = new ArrayList<int[]>();
      for(int i = 0; i< array.length; i++){
        for(int j = i+1; j< array.length; j++){
          for(int k = j+1; k < array.length; k++ ){
            if(array[i] + array[j] + array[k] == target){
              int[] result = new int[3];
              result[0] = array[i];
              result[1] = array[j];
              result[2] = array[k];
              results.add(result);
            }
          }
        }
      }  
  return results;
}

/*
optimized solution
time complexity: O(n^2)
*/
public static List<int[]> targetSumII(int[] array, int target){
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  List<int[]> results = new ArrayList<int[]>();

      for(int i = 0; i< array.length; i++){
        for(int j = i+1; j< array.length; j++){
          if(map.containsKey(target-(array[i]+ array[j]))){
            int[] result = new int[3];
            result[0] = array[i];
            result[1] = array[j];
            result[2] = target - (array[i] + array[j]);
            results.add(result);
          }
        }
        map.put(array[i], 1);
      }
  return results;
}
