public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOs = 1;
        // iOS - 0, Android =1
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        int clientSystem = 1;
        // iOS - 0, Android =1
        int clientDeviceYear = 2016;
        // before 2015 - light version

        if (clientSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию iOS ");
        } else if (clientSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию iOS ");
        }
        if (clientSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию Android ");
        } else if (clientSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию Android ");
        }

        System.out.println("Задача 3");


        System.out.println("Задача 4");
        int deliveryDistance = 15;
        if (deliveryDistance < 20) {
            System.out.println("Срок доставки 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки 3 дня");
        }

         System.out.println("Задача 5");

         int monthOfYear = 13;
        switch (monthOfYear) {
            case 1:
                System.out.println("Месяц - январь");
                System.out.print("Cезон - зима");
                break;
            case 2:
                System.out.println("Месяц - февраль");
                System.out.print("Cезон - зима");
                break;
            case 3:
                System.out.println("Месяц - март");
                System.out.print("Cезон - зима");
                break;
            case 4:
                System.out.println("Месяц - апрель");
                System.out.print("Cезон - весна");
                break;
            case 5:
                System.out.println("Месяц - май");
                System.out.print("Cезон - весна");
                break;
            case 6:
                System.out.println("Месяц - июнь");
                System.out.print("Cезон - лето");
                break;
            case 7:
                System.out.println("Месяц - июль");
                System.out.print("Cезон - лето");
                break;
            case 8:
                System.out.println("Месяц - август");
                System.out.print("Cезон - лето");
                break;
            case 9:
                System.out.println("Месяц - сентябрь");
                System.out.print("Cезон - осень");
                break;
            case 10:
                System.out.println("Месяц - октябрь");
                System.out.print("Cезон - осень");
                break;
            case 11:
                System.out.println("Месяц - ноябрь");
                System.out.print("Cезон - осень");
                break;
            case 12:
                System.out.println("Месяц - декабрь");
                System.out.print("Cезон - зима");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }

        }
}