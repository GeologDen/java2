package lesson2;

import java.text.MessageFormat;

import static java.lang.System.*;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int column) {

        super(MessageFormat.format("Неверные данные лежат в ячейке с индексом: {0}, {1}", row, column));

    }
}
