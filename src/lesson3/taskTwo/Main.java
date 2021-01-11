package lesson3.taskTwo;

public class Main {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();                           //Заполнение телефонного справочника
        book.addContact("Гендальф", "+14562895674");
        book.addContact("Фродо", "+85895214623");
        book.addContact("Гимли", "+85418965245");
        book.addContact("Гимли", "+765651321564");
        book.addContact("Леголас", "+15623589745");
        book.addContact("Арагорн", "+85265477899");
        book.addContact("Арагорн", "+8777777777777");
        book.addContact("Саурон", "+76666666666");




                                                                    //Поиск номера телефона по имени
        book.findAndPrint("Леголас");
        book.findAndPrint("Гендальф");
        book.findAndPrint("Саурон");
        book.findAndPrint("Арагорн");
        book.findAndPrint("Гимли");


    }

}
