import java.util.BitSet;

public class Exercise461 {
    public static void main(String[] args) {
        BitSet bits = new BitSet();

        bits.set(2);

        boolean b = bits.get(0);
        b = bits.get(2);

        bits.clear(1);

        BitSet bits2 = new BitSet();
        bits2.set(1, 4);

        bits.and(bits2);

        bits.xor(bits2);

        bits.flip(0, bits.length());

        bits.andNot(bits2);

        bits.or(bits2);
    }
}
