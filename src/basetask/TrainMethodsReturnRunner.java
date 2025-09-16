package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        int intResult = trainMethodsReturn.returnNewInt(5);
        System.out.println("метод <returnNewInt> вернул " + intResult);
        long longResult = trainMethodsReturn.returnNewLong(8);
        System.out.println("метод <returnNewLong> вернул " + longResult);
        int charResult = trainMethodsReturn.returnNewChar('&');
        System.out.println("метод <returnNewChar> вернул " + charResult);
        float floatResult = trainMethodsReturn.returnNewFloat(10);
        System.out.println("метод <returnNewFloat> вернул " + floatResult);
        double doubleResult = trainMethodsReturn.returnNewDouble(3);
        System.out.println("метод <returnNewDouble> вернул " + doubleResult);
        short shortResult = trainMethodsReturn.returnNewShort((short) 3);
        System.out.println("метод <returnNewShort> вернул " + shortResult);
        byte byteResult = trainMethodsReturn.returnNewByte((byte) 6);
        System.out.println("метод <returnNewByte> вернул " + byteResult);
        boolean booleanResult = trainMethodsReturn.returnNewBoolean(true);
        System.out.println("метод <returnNewBoolean> вернул " + booleanResult);

    }
}

// создать класс TrainMethodsReturnRunner с методом main,
// в котором создать обьект класса TrainMethodsReturn, и отпечатать в консоль значение,
// возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение