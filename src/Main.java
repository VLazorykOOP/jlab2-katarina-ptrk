public class Main {
    public static void main(String[] args) {
        //---------- TASK 1 ----------
        Money money1 = new Money();
        money1.values[2] = 5; // 5 5 UAH
        money1.values[5] = 10; // 10 50 UAH

        Money money2 = new Money();
        money2.values[1] = 3; // 3 2 UAH
        money2.values[7] = 2; // 2 200 UAH

        System.out.println("Money 1: " + money1);

        System.out.println("Money 2: " + money2);

        money1.addMoney(money2);
        System.out.println("After adding: " + money1);


        money1.subtractMoney(money2);
        System.out.println("money1 - money2: " + money1);

        money1.divide(2.0);
        System.out.println("money1 / 2.0: " + money1);

        int comparisonResult = money1.compareTo(money2);
        if (comparisonResult < 0) {
            System.out.println("money1 < money2");
        } else if (comparisonResult > 0) {
            System.out.println("money 1 > money2");
        } else {
            System.out.println("money1 == money2");
        }

        //---------- TASK 2 ----------
        Parallelogram parallelogram1 = new Parallelogram(5.0, 6.0, 60.0);
        Parallelogram parallelogram2 = new Parallelogram(8.0, 10.0, 60.0);
        Parallelogram parallelogram3 = new Parallelogram(5.0, 6.0, 60.0);

        // Testing perimeter calculation
        System.out.println("Parallelogram 1 Perimeter: " + parallelogram1.calculatePerimeter());

        // Testing area calculation
        System.out.println("Parallelogram 1 Area: " + parallelogram1.calculateArea());

        // Testing equality
        System.out.println("Parallelogram 1 equals Parallelogram 2: " + parallelogram1.equals(parallelogram2));
        System.out.println("Parallelogram 1 equals Parallelogram 3: " + parallelogram1.equals(parallelogram3));

        // Testing similarity
        System.out.println("Parallelogram 1 is similar to Parallelogram 2: " + parallelogram1.isSimilarTo(parallelogram2));
        System.out.println("Parallelogram 1 is similar to Parallelogram 3: " + parallelogram1.isSimilarTo(parallelogram3));

    }
}
