package Task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 0;
    }

    public boolean isCube() {
        return length == width && width == height;
    }

    public boolean isEnvelope() {
        return height == 0;
    }

    public boolean isRegularBox() {
        return !isCube() && !isEnvelope();
    }

    public static void main(String[] args) {
        Box cube = new Box(5, 5, 5);

        System.out.println("Куб (Все стороны равны) " + cube.isCube());
        System.out.println("Конверт (Есть только длинна и ширина) " + cube.isEnvelope());
        System.out.println("Обычная коробка " + cube.isRegularBox());
    }
}

