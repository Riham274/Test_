package DesignPatterns.Singleton;

import java.util.List;

public class Single {
    //not a singleton class 
    private Integer[] numbers = {1,2,3,4,5,6};
    private List<Integer> list = List.of(numbers);

    private static Single instance; // null
    
    private Single() {
        System.out.println("Single class constructor called");
    }
    

    public void printer() {
        System.out.println("Numbers: " + list);
    }

    //
    public Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

}


