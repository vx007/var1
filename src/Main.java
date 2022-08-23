public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte  bv = 1;
        short sv = 2;
        int   iv = 3;
        long  lv = 4L;
        float fv = 5f;
        double dv = 6;
        char  cv = 35;
        boolean ov = false;

        //Задание 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов: " + totalBoxersWeight + " кг");
        float diffBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов: " + diffBoxersWeight + " кг");

        //Задание 3
        int banana = 5;
        float bananaWeight = 80f;
        int milk = 200;
        float milkWeight = 105f / 100f ;
        int iceCream = 2;
        float iceCreamWeight = 100f;
        int egg = 4;
        float eggWeight = 70f;
        float totalWeightInGrammas = banana*bananaWeight + milk*milkWeight +
                iceCream*iceCreamWeight + egg*eggWeight;
        float totalWeightInKilogrammas = totalWeightInGrammas / 1000;
        System.out.println("Вес завтрака в граммах: " + totalWeightInGrammas +
                "\nВес завтрака в килограммах: " + totalWeightInKilogrammas);

        //Задание 4
        int weightLossInKg = 7;
        int diff1_OfWeightLoss = 250;
        int diff2_OfWeightLoss = 500;
        int days1 = (weightLossInKg*1000) / diff1_OfWeightLoss;
        int days2 = (weightLossInKg*1000) / diff2_OfWeightLoss;
        float days3 = (float)((days1 + days2) / 2);
        System.out.println("Если худеть по 250гр, то нужно дней: " + days1 +
                "\nЕсли худеть по 500гр, то нужно дней: " + days2 +
                "\nЕсли худеть в среднем, то нужно дней: " + days3);

        //Задание 5
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        float raise = 10f / 100f;
        float MashaNewSalary = MashaSalary * (1 + raise);
        float DenisNewSalary = DenisSalary * (1 + raise);
        float KristinaNewSalary = KristinaSalary * (1 + raise);
        float MashaDiffSalary = MashaSalary * raise * 12;
        float DenisDiffSalary = DenisSalary * raise * 12;
        float KristinaDiffSalary = KristinaSalary * raise * 12;
        System.out.println("Маша теперь получает " + MashaNewSalary +
                " рублей. Годовой доход вырос на " + MashaDiffSalary + " рублей.");
        System.out.println("Денис теперь получает " + DenisNewSalary +
                " рублей. Годовой доход вырос на " + DenisDiffSalary + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaNewSalary +
                " рублей. Годовой доход вырос на " + KristinaDiffSalary + " рублей.");

        //Задание 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result *= (-1);
        System.out.println("Переменная result равна " + result);

        //Задание 7
        int as =5;
        int bs =7;
        as = as + bs;
        bs = as - bs;
        as = as - bs;
        System.out.println("as=" + as + " bs=" + bs);

        //Задание 8
        int ae = 775;
        ae = ae % 100;
        int aes = ae % 10;
        ae = (ae - aes) / 10;
        System.out.println("ae=" + ae);
    }
}
