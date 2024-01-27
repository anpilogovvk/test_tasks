import java.util.Scanner;

interface Converter {
    double getConvertedValue(double baseValue);
}

class Kelvin implements Converter {
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class Fahrenheit implements Converter {
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class Third {
    public static void main(String[] args) {
        System.out.print("Enter temperature in degrees Celsius: ");
        Scanner in = new Scanner(System.in);
        double temperature = in.nextDouble();

        System.out.print("Select units of measurement '1' for Kelvin or '2' for 'Fahrenheit': ");
        int choose = in.nextInt();

        if (choose == 1){
            System.out.println("Kelvin = " +
                    new Kelvin().getConvertedValue(temperature));
        }
        else if (choose == 2) {
            System.out.println("Fahrenheit = " +
                    new Fahrenheit().getConvertedValue(temperature));
        }
        else{
            System.out.print("Mistake!");
        }
    }
}

