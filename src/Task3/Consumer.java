package Task3;

public class Consumer {

    private int[] values = new int[5];
    private int index = 0;

    public void consume(int value) {
        values[index] = value;
        index = (index + 1) % 5;
    }

    public double avg() {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += values[i];
        }
        return sum / 5;
    }

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(3);
        consumer.consume(3);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(3);
        double avg = consumer.avg ();
        System.out.println(avg);
    }

}