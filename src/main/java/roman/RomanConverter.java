package roman;

import java.lang.Integer;import java.lang.String;import java.util.*;import java.util.LinkedHashMap;

public class RomanConverter {

    public static final String EMPTY_STRING = "";
    private final LinkedHashMap<Integer, String> dictionary = new LinkedHashMap<Integer, String>();

    public RomanConverter() {
        dictionary.put(1000, "M");
        dictionary.put(900, "CM");
        dictionary.put(500, "D");
        dictionary.put(400, "CD");
        dictionary.put(100, "C");
        dictionary.put(90, "XC");
        dictionary.put(50, "L");
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");
    }

    public String convert(int inputNumber) {
        if (dictionary.containsKey(inputNumber)) {
            return dictionary.get(inputNumber);
        }

        String result = EMPTY_STRING;
        for (Integer numericKey : dictionary.keySet()) {
            while (inputNumber >= numericKey) {
                inputNumber -= numericKey;
                result += dictionary.get(numericKey);
            }
        }

        return result;
    }
}
