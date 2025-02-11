import java.util.ArrayList;
import java.util.List;

class User {
    int id, age;
    String name;
    List<Integer> friendIds;
    User next;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head;

    public void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public User searchUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public User searchUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int id1, int id2) {
        User user1 = searchUser(id1);
        User user2 = searchUser(id2);
        if (user1 != null && user2 != null && id1 != id2) {
            if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
            if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);
        }
    }

    public void removeFriend(int id1, int id2) {
        User user1 = searchUser(id1);
        User user2 = searchUser(id2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(id2));
            user2.friendIds.remove(Integer.valueOf(id1));
        }
    }

    public List<Integer> mutualFriends(int id1, int id2) {
        User user1 = searchUser(id1);
        User user2 = searchUser(id2);
        List<Integer> mutuals = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int friendId : user1.friendIds) {
                if (user2.friendIds.contains(friendId)) {
                    mutuals.add(friendId);
                }
            }
        }
        return mutuals;
    }

    public void displayFriends(int id) {
        User user = searchUser(id);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        }
    }

    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }
}

public class SocialMediaFriends {
    public static void main(String[] args) {
        SocialMedia media = new SocialMedia();
        media.addUser(1, "Raj", 25);
        media.addUser(2, "Shashank", 24);
        media.addUser(3, "Swati", 23);
        media.addUser(4, "Sneha", 22);
        media.addFriend(1, 2);
        media.addFriend(1, 3);
        media.addFriend(2, 4);
        media.displayFriends(1);
        media.displayFriends(2);
        System.out.println("Mutual friends between Amit and Rahul: " + media.mutualFriends(1, 2));
        media.countFriends();
    }
}
