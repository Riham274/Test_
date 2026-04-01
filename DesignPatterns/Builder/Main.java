package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .setName("John Doe")
                .setAge(30)
                .setEmail("john.doe@example.com")
                .build();
        System.out.println("User created: " + user);
    }

}
