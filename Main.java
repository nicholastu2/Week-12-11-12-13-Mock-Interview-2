class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
//example: given [tar,cried,arc,car,rat,cider] output "cider,cried,car,arc,rat,tar"
"cinema"  --> "ice man"
["Cinema", "ic"]
class Anagram{
    public static String[] ans(String[] arr){
        String[] answer = new int[arr.length];
        String[] ans = new int[Integer_MAX];
        int count = 0;
        for(int j=0; j < ans.length; j++){
            ArrayList<String> newlist = new ArrayList<String>();
            ans[j] = newlist;
        }
        for(int i=0; i < arr.length; i++){
           ans[hash(arr[i])].add(arr[i]);
           
        }
        for(int i =0; i < ans.length; i ++){
            for(String s; ans[i]){
                answer[count] = s;
                count++;
            }
        }
        return answer
    }
    public int hash(String arr){
        int temp = "";
        for(int i=0; i <arr.length; i ++){
            temp += (int) arr.charAt(i);
        }
        temp = temp % 100
    }
    return temp;

}

Input: s = "leetcode", wordDict = ["lee", "tcode"]
Output: true

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false
Explanation: The String can’t be created with any of the combination of words (look closely).

public static boolean StringMethod(String s, HashTable wordDict<String>){
  for(String i: HashTable<String>){
    if(i == s){
      return true;
    }
  }
  String substring = "";
  for(char c:s){
    subtring += c;
    if(wordDict.contains(substring)){
      
    }
  }
}

Hint 1: The easiest approach to solve this problem is to use recursion and backtracking. For finding the solution, we check every possible prefix of that string in the dictionary of words, if it is found in the dictionary, then the recursive function is called for the remaining portion of that string. If in some function call it is found that the complete string is in dictionary, it returns true.

public static Integer palindrome(String s){
    int[] store = new int[s.length()];
    char [] s1 = String.toCharArray(s);
    String check = "";
    int count = 0;
    int j = 0;
    int i = 0;
    int max = 0;
    while(j<s1.length){
        if(i==s1.length){
            j++;
            if(count > max){
                max = count;
            }
            check = "";
        }
        check += s1[i];
        if(checkPali(check)){
            store[i] = check.length();
            count = check.length();
        }
        else{
            store[i] = count;
        }
    }
    return max;
}
abba

"a b a b a  b  f  a f  e "
 1 2 3 3 5  5  5  5  5 5
 0 1 2 3 3  4 4 4 4  4 
 0 0 1 2 2  4 4 4 4 4 4

 public static boolean checkPali(String s){
     if(s.substring(0, s.length/2).equals(s.substring(s.length/2, s.length))){
         return true
     }
     retrun false;

 }

 public int[] arrayInts(int[] intArray){
   int[] newArray = new int[intArray.length];
   int newArrayLoc = 0;
   for(int i = 0; i < intArray.length; i++){
     if(intArray[i] != 0){
       newArray[newArrayLoc] = intArray[i];
       newArrayLoc++;
     }
   }

   if(newArrayLoc < newArray.length-1){
     for(int j = newArrayLoc;j<newArray.length;j++){
       newArray[j] = 0;
     }
   }

   return newArray;
 }