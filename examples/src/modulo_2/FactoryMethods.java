package modulo_2;

import java.text.NumberFormat;

public class FactoryMethods {

    static void main() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percenteFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.printf(currencyFormatter.format(x));
        System.out.printf(percenteFormatter.format(x));

        // You can't give names to constructors. The constructor name is always
        // the same as the class name. But we want two different names to get
        // the currency instanceand the percent instance

        // When you use a constructor, you can't vary the type of the constructed
        // object. But the factory methods actuallyreturn objects of the class
        // DecimalFormat, a subclass that inherits from NumberFormat. (See Chapter 5 for more on inheritance).
    }

}
