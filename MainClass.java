// ✅ BaseClass: Common functionalities for all subclasses
class BaseClass {
    void printResult(String message) {
        System.out.println(message);
    }
}

// ✅ SumClass: Computes sum of the series: 1 + 0.9 + 0.8 + ... + 0.1
class SumClass extends BaseClass {
    void calculateSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of the series: " + sum);
    }
}

// ✅ DivisorMultipleClass: Finds GCD and LCM of two numbers
class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    void findGCDLCM(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);
        printResult("GCD of " + a + " and " + b + " is: " + gcdValue);
        printResult("LCM of " + a + " and " + b + " is: " + lcmValue);
    }
}

// ✅ NumberConversionClass: Converts numbers between Binary, Decimal, Hexadecimal, and Octal
class NumberConversionClass extends BaseClass {
    void convertNumber(int number) {
        printResult("Decimal: " + number);
        printResult("Binary: " + Integer.toBinaryString(number));
        printResult("Octal: " + Integer.toOctalString(number));
        printResult("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
    }
}

// ✅ CustomPrintClass: Implements pr() method for formatted printing
class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println("👉 " + message);
    }
}

// ✅ MainClass: Executes all methods
public class MainClass {
    public static void main(String[] args) {
        // 1️⃣ Compute sum of the series
        SumClass sumObj = new SumClass();
        sumObj.calculateSum();

        System.out.println("\n----------------------------\n");

        // 2️⃣ Find GCD and LCM
        DivisorMultipleClass gcdLcmObj = new DivisorMultipleClass();
        gcdLcmObj.findGCDLCM(18, 24);

        System.out.println("\n----------------------------\n");

        // 3️⃣ Convert a number into different bases
        NumberConversionClass converterObj = new NumberConversionClass();
        converterObj.convertNumber(25);

        System.out.println("\n----------------------------\n");

        // 4️⃣ Custom formatted printing
        CustomPrintClass printObj = new CustomPrintClass();
        printObj.pr("This is a custom formatted print message!");
    }
}
