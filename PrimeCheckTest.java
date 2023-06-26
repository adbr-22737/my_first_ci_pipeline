import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = {3,11,23,47,97};
    for (int i = 0; i < primes.length; i++) {
      assertEquals("Test prime "+primes[i], true, PrimeCheck.isPrime(primes[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = {8,15,49,93};
    for (int i = 0; i < nonPrimes.length; i++) {
      assertEquals("Test non-prime "+nonPrimes[i], false, PrimeCheck.isPrime(nonPrimes[i]));
    }
  }
}
