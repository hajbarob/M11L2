package user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class UserService {

    private Collection<User> users;

    public UserService() {
        users = new ArrayList<>();

        add("vova.haiba@gmail.com", "vova");
        add("vova.ivanchenko@gmail.com", "ivan");
    }

    public User add(String email, String name) {
        User user = new User(email, name);
        users.add(user);
        return user;
    }

    public Optional<User> searchOptional(String email) {
        return users.stream()
                .filter(u -> u.getEmail().contains(email))
                .findFirst();
    }

    public User searchNull(String email) {
        User res = null;
        for (User u : users) {
            if (u.getEmail().contains(email)) {
                res = u;
            }
        }
        return res;
    }
}
