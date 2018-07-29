public class HelloWorld{

     public static void main(String []args){
        System.out.println(permutation("abcde", "dcbeag")); //false
        System.out.println(permutation("abcde", "dcbea")); //true
     }
     public static boolean permutation (String one, String two){
       int[] frequencyOne = new int[128];
       int[] frequencyTwo = new int[128];
       for (int i = 0; i < one.length(); i++){
           char curr = one.charAt(i);
           frequencyOne[curr]++;
       }
       for (int j = 0; j < two.length(); j++){
           char curr = two.charAt(j);
           frequencyTwo[curr]++;
       }
       for (int k = 0; k < Math.max(frequencyOne.length, frequencyTwo.length); k++){
           if (frequencyOne[k] != frequencyTwo[k]){
               return false;
           }
       }
       return true;
    }
}
