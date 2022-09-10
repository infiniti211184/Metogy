public class Main {
    public static void main(String[] args) {
        System.out.println(isLeap(2022) ? "високосный год" : "не високосный год");
        System.out.println(generatInstal(0, 2014));
        System.out.println("Для доставки потребуется дней" + calculateShipping(90));
    }
    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static String generatInstal(int os, int year) {
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("устройство не поддерживает");
        }
        var currentYear = LocalDate.now().getYear();
        String versionMessage = year < currentYear ? "установите облегченную версию" : "";
        String osMessage = os == 0 ? "iOS" : "android";
        return String.format("Установите %s версию приложения по ссылке %s", versionMessage, osMessage);
    }
    public static int calculateShipping (int distance){
        int start = 20;
        int finish = 40;
        int result = 1;
        if (distance >= start) {
            result = (Math.abs((distance - start) / finish) + 2);
        }
        return result;
    }
}

