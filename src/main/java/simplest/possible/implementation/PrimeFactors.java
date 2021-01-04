package simplest.possible.implementation;
import java.util.*;

public class PrimeFactors {
    public  List<String> of( int  number ) {
        List<String> primeFactorsList = Collections.emptyList();
        if( isOne( number ) )
            return Collections.emptyList();
        return primeFactorsList;

    }
    public Boolean isOne( int number )
    {
        if( number == 1 )
            return true;
        return false;
    }
}
