import java.util.HashMap;

public class TwoHashMap {
    public static void main(String[] args) {
        //two sum hashmap...
        int arr[]={1,33,4,5,6};
        int target=34;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
                mp.put(arr[i], i);
        }
        for(int i=0;i<=arr.length;i++) {
          if(arr[i]+arr[i+1]==target){
              //here we can add our hashmap condition...
              System.out.println(arr[i]+"and "+arr[i+1]);  //5 & 4
          }
        }

    }
}
