/*
 * Copyright (c) 2023 Geo-Studios - All Rights Reserved.
 */

package logic.circuits.hex;

import logic.converter;
import parser.hex;

import java.util.List;

public class subtractor {

    public static String subtractFromA(String HexA, String HexB) {

        String binA = converter.HexadecimalToBinary(HexA);
        String binB = converter.HexadecimalToBinary(HexB);

        String sum = logic.circuits.binary.subtractor.subtractFromA(binA, binB);

        return converter.BinaryToHexadecimal(sum);
    }

    public static String subtractFromB(String HexA, String HexB) {

        String binA = converter.HexadecimalToBinary(HexA);
        String binB = converter.HexadecimalToBinary(HexB);

        String sum = logic.circuits.binary.subtractor.subtractFromB(binA, binB);

        return converter.BinaryToHexadecimal(sum);
    }

}
