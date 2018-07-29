public class HelloWorld{

     public static void main(String []args){
        System.out.println(isUnique("abcdefghij")); //true
     }
     public static boolean isUnique (String str){
       int[] frequency = new int[128];
       for (int i = 0; i < str.length(); i++){
           char curr = str.charAt(i);
           frequency[curr]++;
           if(frequency[curr] > 1){
               return false;
           }
       }
       return true;
    }
}
