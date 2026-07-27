import java.util.BitSet;

class Solution {
    public int countPrimes(int n) {

        if (n <= 2) return 0;

        BitSet notPrime = new BitSet(n);

        for (int i = 2; i * i < n; i++) {
            if (!notPrime.get(i)) {
                for (int j = i * i; j < n; j += i) {
                    notPrime.set(j);
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!notPrime.get(i)) {
                count++;
            }
        }

        return count;
    }
}