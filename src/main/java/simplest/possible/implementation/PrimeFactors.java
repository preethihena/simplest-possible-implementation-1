package simplest.possible.implementation;
import java.util.*;

public class PrimeFactors {
    public  List<Integer> of(int  number) {
        List<Integer> primeFactorsList = Collections.emptyList();
        if(isOne(number))
            return Collections.emptyList();
        return primeFactorsList;

    }
    public Boolean isOne( int number )
    {
        return number == 1;
    }
}
