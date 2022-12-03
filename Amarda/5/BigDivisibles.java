import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDivisibles {
    public static void main(String[] args) {
        BigInteger longer = new BigInteger("8675534657687988732344587986");
        double L = Long.MAX_VALUE;
        longer = BigDecimal.valueOf(L).toBigInteger();
        BigInteger six = new BigInteger("6");
        BigInteger five = new BigInteger("5");
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        int i = 0;
        while (i < 10) {

            longer = longer.add(one);
            if ((longer.remainder(five).compareTo(zero) == 0) || (longer.remainder(six).compareTo(zero) == 0) && ((longer.remainder(six).compareTo(zero) != 0) && (longer.remainder(five).compareTo(zero) != 0))){
                    System.out.println(longer);
                    i++;
                }

            }

        }
    }
