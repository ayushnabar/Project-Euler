
/**
 * Write a description of class Euler2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Euler2
{
    public static void main(){
        int z = 0;
        int x = 1;
        int y = 2;
        int sum = 2;
        while(z<4000000)
        {
            z = x+y;
            if(z%2 == 0)
            {
                sum+=z;
            }
            x = y;
            y = z;
        }
        System.out.print(sum);
    }
}
