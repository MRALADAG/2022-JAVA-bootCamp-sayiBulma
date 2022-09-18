public class Main {
    public static void main(String[] args) {
        int[] sayilar = generateRandomNumber();
        int arananSayi = 0;
        printArray(sayilar);
        System.out.printf(findNumberToSearch(sayilar, arananSayi) ? "\n%d sayısı dizide bulunmaktadır.\n" : "\n%d sayısı dizide bulunmamaktadır.\n", arananSayi);

    }

    private static boolean findNumberToSearch(int[] numbers, int desiredNumber) {
        boolean isExist = false;

        for (int number : numbers) {
            if (number == desiredNumber) {
                isExist = true;
            }
        }
        return isExist;
    }

    public static int[] generateRandomNumber() {

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) ((Math.random() * (10 - 0)) + 0);
        }

        return num;

    }

    public static void printArray(int[] array) {

        System.out.print("\n[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" ] dizisi için sonuçlar : \n");
    }
}
