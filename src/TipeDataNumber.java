public class TipeDataNumber {
    public static void main(String[] args) {
        // code program
        byte dataByte = 100;
        short dataShort = 1000;
        int dataInt = 10000;
        long dataLong = 100000L;
        System.out.println("Data Byte: " + dataByte);
        System.out.println("Data Short: " + dataShort);
        System.out.println("Data Int: " + dataInt);
        System.out.println("Data Long: " + dataLong);

        float dataFloat = 10.5f;
        double dataDouble = 20.5d;
        System.out.println("Data Float: " + dataFloat);
        System.out.println("Data Double: " + dataDouble);

        int decimalInt = 25;
        int hexadecimalInt = 0x1A;
        int binaryInt = 0b1101;
        System.out.println("Decimal Int: " + decimalInt);
        System.out.println("Hexadecimal Int: " + hexadecimalInt);
        System.out.println("Binary Int: " + binaryInt);

        long balance = 1_000_000_000L;
        System.out.println("Balance: " + balance); 

        // conversion data type
        byte byteValue = 10;
        short shortValue = byteValue; // implicit conversion
        int intValue = shortValue; // implicit conversion
        long longValue = intValue; // implicit conversion
        float floatValue = longValue; // implicit conversion
        double doubleValue = floatValue; // implicit conversion
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        float floatValue2 = (float) doubleValue; // explicit conversion
        long longValue2 = (long) floatValue2; // explicit conversion
        int intValue2 = (int) longValue2; // explicit conversion
        short shortValue2 = (short) intValue2; // explicit conversion
        byte byteValue2 = (byte) shortValue2; // explicit conversion
        System.out.println("Float Value 2: " + floatValue2);
        System.out.println("Long Value 2: " + longValue2);
        System.out.println("Int Value 2: " + intValue2);
        System.out.println("Short Value 2: " + shortValue2);
        System.out.println("Byte Value 2: " + byteValue2);
    }
}
