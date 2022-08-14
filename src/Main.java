import java.time.LocalDate;

public class Main {
    private static void separator() {
        System.out.println("===============");
    }

    public static void main(String[] args) {

        //task1
        int year = 444;
        leapYear(year);
        separator();
        //task2
        int oS = 0;
        int yearOS = 2016;
        version(oS, yearOS);
        separator();
        //task3
        int deliveryDistance = 78;
        int deliveringTime = 0;
        int j = deliveringTime(deliveryDistance, deliveringTime);
        System.out.println("Срок доставки - " + j + " суток.");
        separator();
    }

    private static void leapYear(int a) {
        if (a % 100 != 0 && a % 4 == 0 || a % 400 == 0) {
            System.out.println(a + "-й год - високосный.");
        } else {
            System.out.println(a + "-й год не високосный.");
        }
    }

    private static void version(int a, int b) {
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

    private static int deliveringTime(int a, int b) {
        if (a <= 20) {
            b = 1;
        } else if (a > 20 && a <= 60) {
            b = 2;
        } else if (a > 60 && a <= 100) {
            b = 3;
        }
        return b;
    }
}

