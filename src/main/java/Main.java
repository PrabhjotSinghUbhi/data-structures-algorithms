import java.io.*;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = 4;
        System.out.println(sqrt(n));
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