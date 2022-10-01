import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 1992;
        checkForLeapYear(year);

        System.out.println(checkOS(1, 2019));

        System.out.println("Потребуется дней - " + countDeliveryDays(60));
    }

    public static void checkForLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else System.out.println(year + " - не високосный год");
    }

    public static String checkOS(int OS, int year) {
        int currentYear = LocalDate.now().getYear();
        String oSys;
        if (OS == 0) {
            oSys = "iOS";
        } else oSys = "Android";
        if (year < currentYear) {
            return "Установите облегченную версию приложения для " + oSys + " по ссылке";
        } else return "Установите обычную версию приложения для " + oSys + " по ссылке";
    }

    public static int countDeliveryDays(int distance) {
        if (distance < 20) return 1;
        else {
            distance = distance - 20;
            return distance / 40 + 2;
        }
    }
}