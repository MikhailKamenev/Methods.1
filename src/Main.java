import java.time.LocalDate;

public class Main {
    public static void separator() {
        System.out.println("===============");
    }
    public static void main(String[] args) {

        //task1
        int year = 444;
        leapYear(year);
        separator();
        //task2
        int OS = 0;
        int Year = 2016;
        version(OS, Year);
        separator();
        //task3
        int deliveryDistance = 123;
        deliveringTime(deliveryDistance);
        separator();
    }
    public static void leapYear(int a) {
        if (a % 100 != 0 && a % 4 == 0 || a % 400 == 0) {
            System.out.println(a + "-й год - високосный.");
        } else {
            System.out.println(a + "-й год не високосный.");
        }
    }
    public static void version(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 0 && b < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS.");
        } else if (a == 0 && b >= currentYear) {
            System.out.println("Установите версию приложения для IOS.");
        } else if (a == 1 && b < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android.");
        } else if (a == 1 && b >= currentYear) {
            System.out.println("Установите версию приложения для Android.");
        } else {
            System.out.println("К сожалению, версия приложения для вашей операционной системы еще в разработке.");
        }
    }
    public static void deliveringTime(int a) {
        if (a <= 20) {
            System.out.println("Доставка на следующие сутки.");
        } else if (a > 20 && a <= 60) {
            System.out.println("Доставка займет 2 суток.");
        } else if (a > 60 && a <= 100) {
            System.out.println("Доставка займет 3 суток.");
        } else {
            System.out.println("Доставка невозможна, закончится бензин.");
        }
    }
}

