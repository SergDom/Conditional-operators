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


    }
}