public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte  b = 1;  System.out.println("Переменная b = " + b);
        short s = 2;  System.out.println("Переменная s = " + s);;
        int   i = 3;  System.out.println("Переменная i = " + i);
        long  l = 4L; System.out.println("Переменная l = " + l);

        float f = 5.0f; System.out.println("Переменная f = " + f);
        double d = 6;   System.out.println("Переменная d = " + d);

        char  c = 35;  System.out.println("Переменная c = " + c);
        boolean o = false; System.out.println("Переменная o = " + o);

        //Задание 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов: " + totalBoxersWeight + " кг!");
        float diffBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов: " + diffBoxersWeight + " кг!");

        //Задание 3
        int banana = 5;
        float bananaWeight = 80f;
        int milk = 200;
        float milkWeight = (float) (105 / 100) ;
        int iceCream = 2;
        float iceCreamWeight = 100f;
        int egg = 4;
        float eggWeight = 70;
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
        float days3 = (days1 + days2) / 2;
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
    }
}