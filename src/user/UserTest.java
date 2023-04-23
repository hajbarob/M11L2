package user;

import java.util.Optional;

public class UserTest {

    public static void main(String[] args) {
        UserService userService = new UserService();

        Optional<User> op = userService.searchOptional("chenko2");

        //op = null;

        User defaultName = op.orElse(new User("default@email.com", "defaultName"));

        op.orElseGet(() -> {
            //call for google service to get user by email
            //call for google service to get user by email
            return new User("user.from.google@gmail.com", "googleUser");
        });

        op.ifPresentOrElse(
                u -> {
                    System.out.println("we found a user = " + u);
                },
                () -> {
                    System.out.println("no user found");
                });



        //do not do like this
        //не робіть так, це не правильно
        User u = null;
        try{
            u.getEmail();
        }catch (NullPointerException e) {
            //make some actions
        }
    }
}
