package Task1;

public class MonthConverter {
    enum Month {
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6),
        JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

        private int monthNumber;

        Month(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getMonthNumber() {
            return monthNumber;
        }
    }

    public static void main(String[] args) {
        String monthName = "MARCH";
        int monthNumber = -1;

        Month monthFromName = getMonthFromName(monthName);
        String nameFromNumber = getMonthName(monthNumber);

        System.out.println("Имя месяца с номером " + monthNumber + ": " + nameFromNumber);
        System.out.println("Номер месяца с именем " + monthName + ": " + monthFromName.getMonthNumber());
    }

    public static Month getMonthFromName(String monthName) {
        for (Month month : Month.values()) {
            if (month.name().equalsIgnoreCase(monthName)) {
                return month;
            }
        }
        return null;
    }

    public static String getMonthName(int monthNumber) {
        for (Month month : Month.values()) {
            if (month.getMonthNumber() == monthNumber) {
                return month.name();
            }
        }
        return "Некорректный номер месяца";
    }
}



