public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int num1 = 2147483647;
        byte num2 = -127;
        short num3 = 32000;
        long num4 = 92233720368L;
        float num5 = 505.265F;
        double num6 = 505.3445618;
        System.out.println("Значение переменной num1 с типом int равно " + num1);
        System.out.println("Значение переменной num2 с типом int равно " + num2);
        System.out.println("Значение переменной num3 с типом int равно " + num3);
        System.out.println("Значение переменной num4 с типом int равно " + num4);
        System.out.println("Значение переменной num5 с типом int равно " + num5);
        System.out.println("Значение переменной num6 с типом int равно " + num6);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float num1 = 27.12F;
        long num2 = 987678965549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        int num6 = 27897;
        byte num7 = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int sheet = 480;
        double a = sheet / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + a + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int bottleMin = 16 / 2;
        int bottle20 = bottleMin * 20;
        System.out.println("За 20 минут машина произвела " + bottle20 + " штук бутылок");
        int bottle24h = bottleMin * 1440;
        System.out.println("За 24 часа машина произвела " + bottle24h + " штук бутылок");
        int bottle3days = bottleMin * 4320;
        System.out.println("За 3 дня машина произвела " + bottle3days + " штук бутылок");
        int bottle1month = bottleMin * 43200;
        System.out.println("За 1 месяц машина произвела " + bottle1month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int jar = 120;
        int white = 2;
        int brown = 4;
        int allClass = jar / (2 + 4);
        int white1 = white * allClass;
        int brown1 = brown * allClass;
        System.out.println("В школе, где " + allClass + "  классов, нужно " + white1 + " банок белой краски и " + brown1 + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        double weight = bananas + milk + iceCream + egg;
        double weightKg = weight / 1000;
        System.out.println(weight);
        System.out.println(weightKg);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int kg = 7000;
        int min = 250;
        int max = 500;
        int daysMin = kg / min;
        int daysMax = kg / max;
        double average = kg / ((min + max) / 2);
        System.out.println(daysMin);
        System.out.println(daysMax);
        System.out.println(average);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double masha1 = (masha * 0.1) + masha;
        double denis1 = (denis * 0.1d) + denis;
        double kristina1 = (kristina * 0.1) + kristina;
        double m0 = masha1 - masha;
        double d0 = denis1 - denis;
        double k0 = kristina1 - kristina;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + m0 + " рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + d0 + " рублей");
        System.out.println("Кристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + k0 + " рублей");
    }
}

