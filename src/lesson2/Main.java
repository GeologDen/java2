package lesson2;


public class Main {


    private static final int SIZE = 4;
    private static String[][] array = new String[SIZE][SIZE];
//    private static String[][] array = new String[5][3];
    private static int summ = 0;

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(i * j);
            }
        }

        try {
            summ = summArryElemets(array);
            System.out.println("Сумма элементов массива равна: " + summ);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }
    }


    private static int summArryElemets(String[][] array) throws MySizeArrayException, MyArrayDataException {

        if (array[0].length != SIZE || array.length != SIZE) {
            throw new MySizeArrayException("Размер массива не соответствует условию 4x4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    summ += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return summ;

    }


}
