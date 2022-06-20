public class Fizzbuzz {
    
    public String Fizzbuzz(int n){
        String result = "";
        if(n % 3 == 0) result += "fizz";
        if(n % 5 == 0) result += "buzz";
        if(n % 3 != 0 && n % 5 != 0) result = Integer.toString(n);
        return result;
    }
}
