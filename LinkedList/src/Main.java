/*
 *
 *   - This program reads a text file from a unix command line
 *     and counts/prints the number of words using a dictionary linked list.
 *
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DictionaryLinkedList list = new DictionaryLinkedList();

        Scanner input = null;
        try {
            input = new Scanner(new File("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input != null && input.hasNext()) {
            String word = input.next();
            list.add(word);
        }

        list.printList();
    }
}