package Task10;
public class Main {
    public static void main(String[] args) {
        Box boxFromString1 = new Box(1,2,3);
        Box boxFromString2 = new Box(2,0,0);
        Box boxFromString3 = new Box(1,2,0);

        System.out.println("Первая коробка");

        System.out.println("Куб (Все стороны равны): " + boxFromString1.isCube());
        System.out.println("Конверт (Есть только длинна и ширина): " + boxFromString1.isEnvelope());
        System.out.println("Обычная коробка: " + boxFromString1.isRegularBox());

        System.out.println("Вторая коробка");

        System.out.println("Куб (Все стороны равны): " + boxFromString2.isCube());
        System.out.println("Конверт (Есть только длинна и ширина): " + boxFromString2.isEnvelope());
        System.out.println("Обычная коробка: " + boxFromString2.isRegularBox());

        System.out.println("Третья коробка");

        System.out.println("Куб (Все стороны равны): " + boxFromString3.isCube());
        System.out.println("Конверт (Есть только длинна и ширина): " + boxFromString3.isEnvelope());
        System.out.println("Обычная коробка: " + boxFromString3.isRegularBox());
    }
}
