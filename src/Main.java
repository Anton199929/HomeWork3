//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte one = 3;
        short two = 45;
        int three = 123;
        long four = 12345;
        float five = 32.12f;
        double six = 12.12345;
        System.out.println("Значение переменной one с типом byte равно " + one);
        System.out.println("Значение переменной two с типом short равно " + two);
        System.out.println("Значение переменной three с типом int равно " + three);
        System.out.println("Значение переменной four с типом long равно " + four);
        System.out.println("Значение переменной five с типом float равно " + five);
        System.out.println("Значение переменной six с типом double равно " +six);


        float dog1 = 27.12f;
        long dog2 = 987678965549L;
        float dog3 = 2.786f;
        short dog4 = 569;
        short dog5 = -159;
        short dog6 = 27897;
        byte dog7 = 67;


        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        byte students = (byte) (lp + as + ea);
        short sheets = 480;
        short oneStudent = (short) (sheets / students);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");


        byte bottle = 16;
        bottle = (byte) (bottle / 2);
        short interval1 = (short) (bottle * 20);
        short interval2 = (short) (bottle * 1440);
        int interval3 = bottle * 4320;
        int interval4 = bottle * 43200;
        System.out.println("За 20 минут машина произвела " + interval1 + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + interval2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + interval3 + " штук бутылок" );
        System.out.println("За 1 месяц машина произвела " + interval4 + " штук бутылок");


        byte totalCans = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        byte class1Cans = (byte) (oneClassWhite + oneClassBrown);
        byte totalClasses = (byte) (totalCans / class1Cans);
        byte totalWhitePaint = (byte) (oneClassWhite * totalClasses);
        byte totalBrownPaint = (byte) (oneClassBrown * totalClasses);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");


        byte banana = 5;
        byte bananaWeight = 80;
        short weightAllBananas = (short) (banana * bananaWeight);
        short amountMilk = 200;
        byte halfMilk = 100;
        byte weightHalfMilk = 105;
        short milkWeight = (short) (weightHalfMilk * 2);
        byte iceCreamBriquette = 100;
        short totalIceCream = (short) (iceCreamBriquette * 2);
        byte totalEggs = 4;
        byte weightOneEgg = 70;
        short weightAllEggs = (short) (totalEggs * weightOneEgg);
        float weightGrams = weightAllBananas + milkWeight + totalIceCream + weightAllEggs;
        float weightKg = (weightGrams / 1000);
        System.out.println("Вес спортзавтрака равен " + weightGrams + " грамм");
        System.out.println("Вес спортзавтрака равен " + weightKg + " килограмм");


        byte weightkg = 7;
        short weightGramss = (short) (weightkg * 1000);
        System.out.println(weightGramss);
        short firstOption = 250;
        short secondOption = 500;
        short daysFirstOption = (short) (weightGramss / firstOption);
        short daysSecondOptions = (short) (weightGramss / secondOption);
        System.out.println(daysFirstOption + " дней уйдет на похудение если тратить по " + firstOption + " грамм в день");
        System.out.println(daysSecondOptions + " дней уйдет на похудение если тратить по " + secondOption + " грамм в день");
        short daysAverage = (short) ((daysFirstOption + daysSecondOptions) / 2);
        System.out.println(daysAverage + " день в среднем потребуется для похудения");


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaMonth = (int) (masha * 0.1 + masha);
        int denisMonth = (int) (denis * 0.1 + denis);
        int kristinaMonth = (int) (kristina * 0.1 + kristina);
        int mashaAnnualIncome1 = masha * 12;
        int denisAnnualIncome1 = denis * 12;
        int kristinaAnnualIncome1 = kristina * 12;
        int mashaAnnualIncome2 =  mashaMonth * 12;
        int denisAnnualIncome2 = denisMonth * 12;
        int kristinaAnnualIncome2 = kristinaMonth * 12;
        int mashaDifference = mashaAnnualIncome2 - mashaAnnualIncome1;
        int denisDifference = denisAnnualIncome2 - denisAnnualIncome1;
        int kristinaDifference = kristinaAnnualIncome2 - kristinaAnnualIncome1;
        System.out.println("Маша теперь получает " + mashaMonth + " рублей. Годовой доход вырос на " + mashaDifference + " рублей" );
        System.out.println("Денис теперь получает " + denisMonth + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaMonth + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");






        











    }
}