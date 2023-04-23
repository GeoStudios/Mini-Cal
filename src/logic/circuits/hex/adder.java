/*
 * Copyright (c) 2023 Geo-Studios - All Rights Reserved.
 */

package logic.circuits.hex;

import logic.converter;
import parser.hex;

import java.util.List;

public class adder {

    public static String add(String HexA, String HexB, int carryIn) {


        String binA = converter.HexadecimalToBinary(HexA.toLowerCase());
        System.out.println(binA);
        String binB = converter.HexadecimalToBinary(HexB.toLowerCase());
        //        System.out.println(binA);
        String sum = logic.circuits.binary.adder.add(binA, binB, carryIn);
        System.out.println(sum);
        return converter.BinaryToHexadecimal(sum);

    }

}
