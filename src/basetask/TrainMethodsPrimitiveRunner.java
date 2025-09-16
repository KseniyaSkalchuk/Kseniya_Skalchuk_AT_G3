package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(1);
        trainMethodsPrimitive.printLong(108108);
        trainMethodsPrimitive.printChar('#');
        trainMethodsPrimitive.printFloat(3.78f);
        trainMethodsPrimitive.printDouble(0.456789123456);
        trainMethodsPrimitive.printShort((short) 888);
        trainMethodsPrimitive.printByte((byte) 0);
        trainMethodsPrimitive.printBoolean(true);
    }
}




// создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать обьект класса TrainMethodsPrimitive
// и вызвать всего его методы