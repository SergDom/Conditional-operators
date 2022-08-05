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

        int enterYear =256;
        if (enterYear % 4 == 0 && enterYear % 100 != 0 || (enterYear % 400 == 0))
        { System.out.println (enterYear + " год является високосным"); }
            else { System.out.println (enterYear + " год не является високосным"); }


            System.out.println("Задача 4");

        int deliveryDistance = 20;
        if (deliveryDistance < 20) {
            System.out.println("Срок доставки 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки 3 дня");
        }

         System.out.println("Задача 5");

         int monthOfYear = 11;
        switch (monthOfYear) {
            case 1:
                System.out.println("Месяц - январь, сезон - зима");
                break;
            case 2:
                System.out.println("Месяц - февраль, сезон - зима");
                break;
            case 3:
                System.out.println("Месяц - март, сезон - весна");
                break;
            case 4:
                System.out.println("Месяц - апрель, сезон - весна");
                break;
            case 5:
                System.out.println("Месяц - май, сезон - весна");
                break;
            case 6:
                System.out.println("Месяц - июнь, сезон - лето");
                break;
            case 7:
                System.out.println("Месяц - июль, сезон - лето");
                break;
            case 8:
                System.out.println("Месяц - август, сезон - лето");
                break;
            case 9:
                System.out.println("Месяц - сентябрь, cезон - осень");
                break;
            case 10:
                System.out.println("Месяц - октябрь, cезон - осень");
                break;
            case 11:
                System.out.println("Месяц - ноябрь, cезон - осень");
                break;
            case 12:
                System.out.println("Месяц - декабрь , cезон - зима");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }

        }
}