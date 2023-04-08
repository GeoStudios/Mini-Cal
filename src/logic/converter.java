/*
 * Copyright (c) 2023 Geo-Studios Inc. All rights reserved.
 */

package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import parser.binary;
import parser.hex;

public class converter {
    public static List<String> StringListToStrArray(String[] list){
        List<String> array = new ArrayList();
        for (int i = 0; i < list.length; i++)
            array.add(list[i]);
        return array;
    }

    public static List<Integer> StringListToIntArray(String[] list){
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++)
            array.add(Integer.parseInt(list[i]));
        return array;
    }

    public static String StrArrayToString(List<String> array){

        String string = String.format("%s", array);

        return string;

    }

    public static String IntArrayToString(List<Integer> array){

        String string = String.format("%s", array);

        return string;

    }

    public static String bin_to_hex(String bin){

        List<List<Integer>> binL = binary.Split(4, bin);
        List<String> hexL = new ArrayList<String>();

        for (int i = 0; i < binL.size(); i++){

            String nibbleString = IntArrayToString(binL.get(i));

            if ( nibbleString == "0000") hexL.add("0");
            if ( nibbleString == "0001") hexL.add("1");
            if ( nibbleString == "0010") hexL.add("2");
            if ( nibbleString == "0011") hexL.add("3");
            if ( nibbleString == "0100") hexL.add("4");
            if ( nibbleString == "0101") hexL.add("5");
            if ( nibbleString == "0110") hexL.add("6");
            if ( nibbleString == "0111") hexL.add("7");
            if ( nibbleString == "1000") hexL.add("8");
            if ( nibbleString == "1001") hexL.add("9");
            if ( nibbleString == "1010") hexL.add("a");
            if ( nibbleString == "1011") hexL.add("b");
            if ( nibbleString == "1100") hexL.add("c");
            if ( nibbleString == "1101") hexL.add("d");
            if ( nibbleString == "1110") hexL.add("e");
            if ( nibbleString == "1111") hexL.add("f");


        }

        return StrArrayToString(hexL);
    }

}
