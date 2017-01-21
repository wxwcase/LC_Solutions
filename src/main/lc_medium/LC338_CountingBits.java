package main.lc_medium;

/**
 * Created by wwang on 1/18/2017.
 */
public class LC338_CountingBits {

    /**
     * Example
     * input: 5
     * output: [0, 1, 1, 2, 1, 2]
     * @param num
     * @return
     */
    public int[] countBits(int num) {

        int[] mem = new int[num + 1];
        mem[0] = 0;

        if (num == 0) return mem;

        for (int i = 1; i <= num; i++) {
            int ones2delete = 0;
            int prv = i - 1;
            while ((prv & 1) == 1) {
                ones2delete++;
                prv >>= 1;
            }
            ones2delete--;
            mem[i] = mem[i - 1] - ones2delete;
        }

        return mem;
    }

    /**
     * f[i] = f[i / 2] + i % 2;
     * @param num
     * @return
     */
    public int[] countBitsBest(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++)
            f[i] = f[i >> 1] + (i & 1);
        return f;
    }
}
