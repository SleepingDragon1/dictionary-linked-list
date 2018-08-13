/*
 *
 *   - This program reads a text file from a unix command line
 *     and counts/prints the number of words using a dictionary linked list.
 *
 * */

public class Node {

    private Node next; // Create link of type node to store next nodes
    private int wordCount = 0;
    private String key;

    public Node(String key) {
        this.key = key;
    }

    public void setWordCount(int wordCount) {

        this.wordCount = wordCount;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setNext(Node link) {
        this.next = link;
    }

    public int getWordCount() {

        return wordCount;
    }

    public String getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

}