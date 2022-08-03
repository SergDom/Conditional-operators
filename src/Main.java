public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOs = 1;
        // iOS - 0, Android =1
        if (clientOs  == 1) {
            System.out.println ("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        int clientSystemIos = 0;
        int clientSystemAndroid = 1;
        // iOS - 0, Android =1
        int clientDeviceYear = 2016;
        // before 2015 - light version

        if (clientSystemIos == 0 && clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию iOS ");
        } else if (clientSystemIos == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию iOS ");}
        if (clientSystemIos == 1 && clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию Android ");
        } else if (clientSystemIos == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию Android ");}

        }
             }



