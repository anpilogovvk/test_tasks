public class Second {
    public static void main(String[] args) {
        String str = "Hello";
        String lover_str = str.toLowerCase();
        char[] array = lover_str.toCharArray();
        System.out.println("Строка:" + str);
        System.out.print("Повторяющийся символ: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
    }
}


