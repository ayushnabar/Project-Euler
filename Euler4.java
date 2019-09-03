
/**
 * Write a description of class Euler4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Euler4
{
    public static void main(){
        int temp = 10001;
        for(int i =100; i<1000; i++)
        {
            for(int j = 100; j < 1000; j++)
            {
                int max = i*j;
                if(isPalindrome(max) && max>temp){
                    System.out.println(max);
                    temp = max;
                }
            }
        }
    }
    public static boolean isPalindrome(int num)
    {
        String number = "" + num;
        char[] digits = number.toCharArray();
        int count = 0;
        for(int i = 0; i <number.length()/2; i++){
            if(digits[i] == digits[number.length()-1-i])
            {
                count++;
            }
        }
        if(count == number.length()/2)
        {
            return true;
        }
        return false;
    }
}
