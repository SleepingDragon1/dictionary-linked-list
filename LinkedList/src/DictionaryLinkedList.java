/*
 *
 *   - This program reads a text file from a unix command line
 *     and counts/prints the number of words using a dictionary linked list.
 *
 * */

public class DictionaryLinkedList {

    private Node head; // Head of node

    /* Constructor */
    public DictionaryLinkedList() {
        head = new Node(""); // Create new instance of node class assign as head
        head.setNext(null); // Instantiate head to point to null
    }

    /* Search linked list for keys and word count */
    public void contains() {
        Node ptr1, ptr2;
        ptr1 = head;

        /* Pick elements one by one */
        while (ptr1 != null && ptr1.getNext() != null) {
            ptr2 = ptr1;

            /* Compare the picked element with rest
                of the elements */
            while (ptr2.getNext() != null) {

                /* If duplicate then delete it */
                if (ptr1.getKey().equalsIgnoreCase(ptr2.getNext().getKey())) {

                    ptr2.setNext(ptr2.getNext().getNext()); // Set duplicate to next next node
                    ptr1.setWordCount(ptr1.getWordCount() + 1); // Increment repeated words by one

                } else {
                    ptr2 = ptr2.getNext(); // Point to next node
                }
            }
            ptr1.setWordCount(ptr1.getWordCount() + 1); // If word is not a repeat increment count by one
            ptr1 = ptr1.getNext(); // Point to next node
        }
    }

    /* Add item to node */
    public void add(String word) {

        Node node = new Node(""); // Create new instance of node class to hold new words and there count
        node.setKey(word);  // Assign each word as key
        node.setNext(head); // Use head to point to next node
        head = node; // Set next node to head address
    }

    /* Print list */
    public void printList() {
        contains();
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey().toLowerCase() + " " + temp.getWordCount());//
            temp = temp.getNext();
        }
    }
}