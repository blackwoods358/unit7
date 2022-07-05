/**
 * Fibonacci class used for findinng the corresponding fibonacci num
 *
 * @author Created by stephen Blackwood on 05/20/2022
 */
public class Fibonacci {
    /**
     * @param n is going to be any int the user inputs
     * @return going to return a long because the numbers tend to grow at a very fast rate
     */
    static long fibonacci(int n) {
        //base case (to stop infinite calls)
        if (n == 0)
            return 0;
        //base case(to stop infinite calls )
        if (n == 1)
            return 1;

        return (fibonacci(n - 1) + fibonacci(n - 2));


    }


}
