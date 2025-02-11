class Process {
    int id, burstTime, priority;
    Process next;

    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head, tail;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.head = this.tail = null;
    }

    public void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void executeProcesses() {
        if (head == null) return;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;
        Process current = head;
        while (true) {
            boolean allExecuted = true;
            Process temp = head;
            do {
                if (temp.burstTime > 0) {
                    allExecuted = false;
                    int executedTime = Math.min(timeQuantum, temp.burstTime);
                    temp.burstTime -= executedTime;
                    totalTurnaroundTime += executedTime;
                    totalWaitingTime += totalTurnaroundTime - executedTime;
                    System.out.println("Process " + temp.id + " executed for " + executedTime + " units. Remaining: " + temp.burstTime);
                }
                temp = temp.next;
            } while (temp != head);
            if (allExecuted) break;
        }
        System.out.println("Average Waiting Time: " + (totalWaitingTime / processCount));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / processCount));
    }

    public void displayProcesses() {
    if (head == null) return;  
    Process temp = head;
    while (true) {
        System.out.println("Process ID: " + temp.id + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
        temp = temp.next;
        if (temp == head) break; 
        }
   }

}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);
        System.out.println("Initial Process List:");
        scheduler.displayProcesses();
        scheduler.executeProcesses();
    }
}