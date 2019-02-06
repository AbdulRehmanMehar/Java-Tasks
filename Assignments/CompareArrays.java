public class CompareArrays{
  public static void main(String [] args){
    int [] x = {3, 12, 345, 34},
           y = {2, 3, 11, 32, 345};
    findMissings(x, y);
  }
  public static void findMissings(int [] x, int [] y){
    for(int i =0; i<x.length; i++){
      if(!ifItContains(x[i], y))
        System.out.print(x[i] + "\t");
    }
  }
  public static boolean ifItContains(int key, int [] arr){
    int start = 0;
    int end = arr.length -1;
    boolean found = false;
    while(start <= end && !found){
      int mid = (start + end) / 2;
      if(arr[mid] == key){
        found = true;
      }else if(arr[mid] > key){
        end = mid -1;
      }else{
        start = mid + 1;
      }
    }
    return found;
  }
}
