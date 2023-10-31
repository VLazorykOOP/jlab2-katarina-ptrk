import java.text.DecimalFormat;

public class Money {
    // Номінали гривень
    private int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500};

    // Поля для зберігання кількості купюр кожного номіналу
    int[] values;

    public Money() {
        values = new int[denominations.length];
    }

    // Додавання суми грошей
    public void addMoney(Money moneyToAdd) {
        for (int i = 0; i < denominations.length; i++) {
            values[i] += moneyToAdd.values[i];
        }
    }

    // Віднімання суми грошей
    public void subtractMoney(Money moneyToSubtract) {
        for (int i = 0; i < denominations.length; i++) {
            values[i] -= moneyToSubtract.values[i];
            if (values[i] < 0) {
                values[i] = 0; // Не можна мати від'ємну кількість купюр
            }
        }
    }

    // Ділення суми грошей на десяткову дріб
    public void divide(double divisor) {
        for (int i = 0; i < denominations.length; i++) {
            values[i] = (int) (values[i] / divisor);
        }
    }

    // Порівняння двох сум грошей
    public int compareTo(Money otherMoney) {
        for (int i = 0; i < denominations.length; i++) {
            if (values[i] < otherMoney.values[i]) {
                return -1;
            } else if (values[i] > otherMoney.values[i]) {
                return 1;
            }
        }
        return 0; // Суми однакові
    }

    @Override
    public String toString() {
        double total = 0.0;
        for (int i = 0; i < denominations.length; i++) {
            total += denominations[i] * values[i];
        }
        return "Total: " + String.format("%.2f", total).replace(".", ",") + " грн";
    }

}