package prime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prime {
	
	public static Long getHighestPrimeFactor(long n){
		List<Long> factors = getAllFactors(n);
		removeNonPrimeNumbers(factors);
		return factors.get(factors.size()-1);
	}
	
	public static List<Long> getAllFactors(long n){
		List<Long> factors = new ArrayList<Long>();
		for (long i = 1; i <= n; i++) {
			if(n % i == 0){
				factors.add(i);
			}
		}
		return factors;
	}
	
	public static void removeNonPrimeNumbers(List<Long> list){
		Iterator<Long> iterator = list.iterator();
		while (iterator.hasNext()) {
			   Long m = iterator.next(); // must be called before you can call i.remove()
			   boolean isPrime = true;
			   if (m != 2) {			
				   for (long j = 2; j < m - 1; j++) {
					if (m % j == 0) {
						isPrime = false;
						break;
					}
				   }
				   
				   if(!isPrime || m == 1){
					   iterator.remove();
				   }
			   }

			}
	}

}
