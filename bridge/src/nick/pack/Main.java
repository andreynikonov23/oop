package nick.pack;

public class Main {
    /*
    1. Создать интерфейс Bridge с методом int getCarsCount().
    2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
    3. Метод getCarsCount() должен возвращать любое значение типа int.
    4. Метод getCarsCount должен возвращать различные значения для различных классов.
    5. В классе Solution создать публичный метод println(Bridge bridge).
    6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
    7. Каждый класс и интерфейс должны быть в отдельных файлах.
     */
    public static void main(String[] args) {
        Bridge waterBridge = new WaterBridge();
        Bridge suspensionBridge = new SuspensionBridge();
        println(waterBridge);
        println(suspensionBridge);
    }
    public static void println(Bridge bridge){
        if (bridge instanceof WaterBridge) {
            System.out.println("На речном мосту проехало машин: " +bridge.getCarsCount());
        }
        if (bridge instanceof SuspensionBridge){
            System.out.println("На подвесном мосту проехало машин: " + bridge.getCarsCount());
        }
    }
}
