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
