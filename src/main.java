/*
 * Copyright (c) 2023 Geo-Studios Inc. All rights reserved.
 */

import logic.circuits.binary.subtractor;
import logic.converter;
import logic.circuits.binary.adder;

public class main {

    public static void main(String[] args) {

        String sum = subtractor.subtractFromB("0000000000000110", "0000000000001101", 0);
        System.out.println(converter.BinaryToHexadecimal(sum));
        System.out.println(sum);

    }

}
