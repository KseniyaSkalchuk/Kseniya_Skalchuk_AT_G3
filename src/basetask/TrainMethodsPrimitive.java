package basetask;

public class TrainMethodsPrimitive {
    public void printInt(int input1) {
        System.out.println("я получил на вход число " + input1);
    }
   public void printLong(long number) {
        System.out.println("я получил на вход длинное число " + number);
    }
    public void printChar(char character) {
        System.out.println("я получил на вход символ " + character);
    }
    public void printFloat(float number) {
        System.out.println("я получил на вход дробное число " + number);
    }
    public void printDouble(double number) {
        System.out.println("я получил на вход длинное дробное число " + number);
    }
    public void printShort(short number) {
        System.out.println("я получил на вход короткое число " + number);
    }
    public void printByte(byte number) {
        System.out.println("я получил на вход очень короткое число " + number);
    }
    public void printBoolean(boolean value) {
        System.out.println("я получил на вход булево " + value);
    }
}

//создать невозвратный метод printInt, который принимает на вход целое число (int)
// и печатает в консоль «я получил на вход число » и это число --
// создать невозвратный метод printLong, который принимает на вход целое число (long)
// и печатает в консоль «я получил на вход длинное число » и это число --
// создать невозвратный метод printChar, который принимает на вход символ (char)
// и печатает в консоль «я получил на вход символ » и это число --
// создать невозвратный метод printFloat, который принимает на вход дробное число (float)
// и печатает в консоль «я получил на вход дробное число » и это число --
// создать невозвратный метод printDouble, который принимает на вход дробное число (double)
// и печатает в консоль «я получил на вход длинное дробное число » и это число --
// создать невозвратный метод printShort, который принимает на вход целое число (short)
// и печатает в консоль «я получил на вход короткое число » и это число --
// создать невозвратный метод printByte, который принимает на вход целое число (byte)
// и печатает в консоль «я получил на вход очень короткое число » и это число --
// создать невозвратный метод printBoolean, который принимает на вход булево значение (boolean)
// и печатает в консоль «я получил на вход булево » и это число --
// создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать обьект класса TrainMethodsPrimitive
// и вызвать всего его методы