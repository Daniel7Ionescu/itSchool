package session7.onlineStore;

import java.time.LocalDateTime;

public class OnlineStore {

    public static void main(String[] args) {
        User user = new User();

        user.setFirstName("Alex");
        user.setLastName("Jones");
        user.setAge(27);
        user.setCreateAt(LocalDateTime.now());

        System.out.println(user);
    }
}
