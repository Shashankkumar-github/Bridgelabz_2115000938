class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task current = null;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
            current = head;
            return;
        }
        newTask.next = head;
        head = newTask;
        tail.next = head;
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
            current = head;
            return;
        }
        tail.next = newTask;
        tail = newTask;
        tail.next = head;
    }

    public void addAtPosition(int id, String name, int priority, String dueDate, int position) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) tail = newTask;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next.id == id) {
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
        }
    }

    public void viewCurrentTask() {
        if (current != null) {
            System.out.println("Task ID: " + current.id + ", Name: " + current.name + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        }
    }

    public void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public Task searchByPriority(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(1, "Task A", 2, "2025-02-20");
        scheduler.addAtEnd(2, "Task B", 1, "2025-02-22");
        scheduler.addAtBeginning(3, "Task C", 3, "2025-02-19");
        scheduler.addAtPosition(4, "Task D", 2, "2025-02-21", 2);
        System.out.println("All Tasks:");
        scheduler.displayAllTasks();
        System.out.println("Viewing current task:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        System.out.println("Searching for task with priority 2:");
        Task found = scheduler.searchByPriority(2);
        if (found != null) {
            System.out.println("Found Task: " + found.name);
        }
        scheduler.removeById(3);
        System.out.println("Tasks after removal:");
        scheduler.displayAllTasks();
    }
}
