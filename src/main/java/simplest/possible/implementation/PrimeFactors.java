package simplest.possible.implementation;
import java.util.*;

public class PrimeFactors {
    public  List<Integer> of(int  number) {
        List<Integer> primeFactorsList = new ArrayList<>();
        if(isOne(number))
            return Collections.emptyList();
        return primeFactorsList;

    }
    public boolean isOne(int number)
    {
        return number == 1;
    }
}
