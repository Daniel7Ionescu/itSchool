package session11_abstractization.practice.user_service;

public interface UserService {
    /**
     * Creates a user
     * @param user
     * @return
     */
    User createUser(User user);
    void deleteUser(long id);
}
