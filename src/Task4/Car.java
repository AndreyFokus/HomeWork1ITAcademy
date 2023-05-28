package Task4;

public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void changeColor(String newColor) {
        if (brand.equals("Audi") && isValidAudiColor(newColor)) {
            color = newColor;
        } else if (brand.equals("BMW") && isValidBMWColor(newColor)) {
            color = newColor;
        } else if (brand.equals("KIA") && isValidKIAColor(newColor)) {
            color = newColor;
        }
    }

    private boolean isValidAudiColor(String color) {
        return color.equals("Синий") || color.equals("Красный") || color.equals("Зеленый");
    }

    private boolean isValidBMWColor(String color) {
        return color.equals("Оранжевый") || color.equals("Черный") || color.equals("Фиолетовый");
    }

    private boolean isValidKIAColor(String color) {
        return color.equals("Желтый") || color.equals("Серый") || color.equals("Белый");
    }

    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Синий");
        System.out.println("Car 1: " + car1);

        car1.changeColor("Зеленый");
        System.out.println("Car 1 после смены цвета: " + car1);

        Car car2 = new Car("BMW", "Черный");
        System.out.println("Car 2: " + car2);

        car2.changeColor("Фиолетовый");  // Неправильный цвет, не изменит цвет
        System.out.println("Car 2 после смены цвета: " + car2);
    }
}

