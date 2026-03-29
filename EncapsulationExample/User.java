package EncapsulationExample;
/*
public class User {
    private boolean loggedIn;

   public void setLoggedIn(boolean value){
         loggedIn = value;

}
}

user.setLoggedIn(true); // Directly accessing the loggedIn field (not recommended)
*/

class User {

    private boolean loggedIn;

    public void login(String password) {

        if (password.equals("1234"))

            loggedIn = true;

    }

    public void logout() {

        loggedIn = false;

    }

}