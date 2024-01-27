import java.util.Scanner;

public class Fourth {
    private static void CalcDegrees(int hours, int minutes) {
        float hoursInDegree = hours * 30 + (30 * minutes) / 60f;
        float minutesInDegree = minutes * 6;
        float degree = Math.abs(hoursInDegree - minutesInDegree);
        float result = degree <= 180 ? degree : 360 - degree;
        System.out.println("Время: " + hours + " : " + minutes + ", Угол: " + result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ЧАСЫ: ");
        int hours = in.nextInt();
        System.out.print("Введите МИНУТЫ: ");
        int minutes = in.nextInt();
        CalcDegrees(hours,minutes);
    }
}