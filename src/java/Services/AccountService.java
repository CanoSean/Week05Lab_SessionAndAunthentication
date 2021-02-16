package Services;

import Models.User;

/**
 *
 * @author sean0
 */
public class AccountService {

    public User login(String username, String password){
        if(username.equals("adam") || username.equals("betty")){
            if (password.equals("password")) {
                return new User(username,null);
            }
        }
return null;
    }
}
