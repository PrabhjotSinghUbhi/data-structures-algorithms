import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long h = fs.nextLong();
            long k = fs.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = fs.nextLong();

            long ts = 0;
            long[] pf = new long[n + 1];
            for (int i = 0; i < n; i++) {
                ts += a[i];
                pf[i + 1] = pf[i] + a[i];
            }

            long[] ms = new long[n + 1];
            ms[n] = Long.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                ms[i] = Math.max(a[i], ms[i + 1]);
            }

            long[] minP = new long[n + 1];
            minP[0] = Long.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                minP[i] = Math.min(minP[i - 1], a[i - 1]);
            }

            long lo = 1, hi = (long) 2e18;
            while (lo < hi) {
                long mid = (lo + hi) / 2;
                if (canKill(mid, n, k, h, ts, pf, ms, minP)) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }

            sb.append(lo).append('\n');
        }

        System.out.print(sb);
    }

    static boolean canKill(long T, int n, long k, long h,
                           long ts, long[] p,
                           long[] mxS, long[] mnP) {
        long c = T / (n + k);
        long rem = T - c * (n + k);
        int extra = (int) Math.min(n, rem);
        long dmg = c * ts + p[extra];
        if (extra > 0 && extra < n) {
            long benefit = mxS[extra] - mnP[extra];
            if (benefit > 0) dmg += benefit;
        }
        return dmg >= h;
    }
}

class FastScanner {
    private final byte[] buffer = new byte[1 << 16];
    private final InputStream in = System.in;
    private int ptr = 0, len = 0;

    private int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    int nextInt() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);
        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }
        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
    }

    long nextLong() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);
        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }
        long val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
    }

    String next() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);
        StringBuilder sb = new StringBuilder();
        while (c > ' ') {
            sb.append((char) c);
            c = readByte();
        }
        return sb.toString();
    }

    String nextLine() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        while ((c = readByte()) != -1) {
            if (c == '\n') break;
            if (c != '\r') sb.append((char) c);
        }
        return sb.toString();
    }

    boolean hasNext() throws IOException {
        int c;
        while ((c = readByte()) != -1) {
            if (c > ' ') {
                ptr--;
                return true;
            }
        }
        return false;
    }

    double nextDouble() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);
        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }
        double val = 0;
        while (c > ' ' && c != '.') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        if (c == '.') {
            double div = 1;
            while ((c = readByte()) > ' ') {
                div *= 10;
                val += (c - '0') / div;
            }
        }
        return sign * val;
    }
}