//Lonnie Williams
//Jump Training

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class changeBack {

    public static void main(String[] args) {
        BigDecimal amountPayed  =  new BigDecimal("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        BigDecimal price = scan.nextBigDecimal();
        Map<Denomination, Integer> changeDue = getDenomination(price, amountPayed);

        for(Denomination denomination : changeDue.keySet()) {
            System.out.println(denomination + ": "+ changeDue.get(denomination));
        }
        scan.close();
    }

    public static Map<Denomination, Integer> getDenomination(BigDecimal amountPayed, BigDecimal price) {
        BigDecimal change = amountPayed.subtract(price);
        System.out.println("Total amount due: "+ change);
        Map<Denomination, Integer> changeReturn = new LinkedHashMap<Denomination, Integer>();
        for(Denomination denomination : Denomination.values()) {

            BigDecimal[] values = change.divideAndRemainder(denomination.value, MathContext.DECIMAL32);
            if(!values[0].equals(BigDecimal.valueOf(0.00)) && !values[1].equals(BigDecimal.valueOf(0.00))) {
                changeReturn.put(denomination, values[0].intValue());
                change = values [1];
            }

        }
        return changeReturn;
    }

    enum Denomination {
	ThousandDollarBills(BigDecimal.valueOf(1000)),
        HundredDollarBills(BigDecimal.valueOf(100)),
        FiftyDollarBills(BigDecimal.valueOf(50)),
        TwentyDollarBills(BigDecimal.valueOf(20)),
        TenDollarBills(BigDecimal.valueOf(10)),
        FiveDollarBills(BigDecimal.valueOf(5)),
        TwoDollarBills(BigDecimal.valueOf(2)),
        OneDollarBills(BigDecimal.valueOf(1)),
        QuarterCoins(BigDecimal.valueOf(0.25)),
        DimeCoins(BigDecimal.valueOf(0.10)),
        NickelCoins(BigDecimal.valueOf(0.05)),
        PennyCoins(BigDecimal.valueOf(0.01));

        private BigDecimal value;

        Denomination(BigDecimal value) {
            this.value = value;
        }
    }
}