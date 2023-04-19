/*
 * Copyright (c) 2023 Geo-Studios - All Rights Reserved.
 */

package logic.circuits.hex;

import logic.converter;
import parser.hex;

import java.util.List;

public class adder {

    public static String add(String HexA, String HexB, int carryIn) {


        String binA = converter.HexadecimalT oBinary(HexA);
        String binB = converter.HexadecimalToBinary(HexB);
//        System.out.println(binA);
        String sum = logic.circuits.binary.adder.add(binA, binB, carryIn);
        return converter.BinaryToHexadecimal(sum);

    }

}
