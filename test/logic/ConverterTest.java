package test.logic;
import logic.converter;

public class ConverterTest {

    public static void main(String[] args) {
        testBinaryToHexadecimal();
        testHexadecimalToBinary();
        testNegate();
    }

    public static void testBinaryToHexadecimal() {
        String b1 = "110101110110011110101100";
        String h1 = "d767ac";
        String b2 = "10100001110100010011101010100010";
        String h2 = "5e2ec55e";

        String result1 = converter.BinaryToHexadecimal(b1);
        String result2 = converter.BinaryToHexadecimal(b2);

        System.out.println("Test BinaryToHexadecimal:");
        System.out.println("Expected: " + h1 + " == Actual: " + result1 + " -> " + h1.equalsIgnoreCase(result1));
        System.out.println("Expected: " + h2 + " == Actual: " + result2 + " -> " + h2.equalsIgnoreCase(result2));
    }

    public static void testHexadecimalToBinary() {
        String h1 = "3a6f1c";
        String b1 = "001110100110111100011100";
        String h2 = "f5e17";
        String b2 = "11110101111000010111";

        String result1 = converter.HexadecimalToBinary(h1);
        String result2 = converter.HexadecimalToBinary(h2);

        System.out.println("\nTest HexadecimalToBinary:");
        System.out.println("Expected: " + b1 + " == Actual: " + result1 + " -> " + b1.equals(result1));
        System.out.println("Expected: " + b2 + " == Actual: " + result2 + " -> " + b2.equals(result2));
    }

    public static void testNegate() {
        String b1 = "11111111111111111111111101000111"; // 185
        String negb1 = "00000000000000000000000010111001"; // -185
        String b2 = "11111111111111111111111111101101"; // -19
        String negb2 = "00000000000000000000000000010011"; // 19

        String result1 = converter.Negatate(b1);
        String result2 = converter.Negatate(b2);

        System.out.println("\nTest Negate (2's complement):");
        System.out.println("Expected: " + negb1 + " == Actual: " + result1 + " -> " + negb1.equals(result1));
        System.out.println("Expected: " + negb2 + " == Actual: " + result2 + " -> " + negb2.equals(result2));
    }
}
