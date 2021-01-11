package lesson3.taskTwo;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {


    HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = phoneBook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phoneBook.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Имя: " + name + "\nТел. номер: " + phoneBook.getOrDefault(name, new HashSet<>()) + "\n");
    }
}
