class Node {
    String text;
    Node prev, next;
    
    Node(String text) {
        this.text = text;
    }
}

class TextEditor {
    private Node head, tail, current;
    private int size, limit;
    
    TextEditor(int limit) {
        this.limit = limit;
        this.size = 0;
    }
    
    void addState(String text) {
        Node newNode = new Node(text);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        if (head == null) head = current;
        tail = current;
        size++;
        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
    
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
    
    void display() {
        if (current != null) {
            System.out.println(current.text);
        } else {
            System.out.println("");
        }
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        editor.addState("Hello I am raj");
        editor.addState("Hello you are idiot");
        editor.display();
        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
    }
}
