package Relations;

import java.util.List;

//1. Inheritance
class Animal {

    void print() {
    }

}

class Dog extends Animal {
    void print() {
        System.out.println("Dog is an Animal");
    }
}

// 2. Composition
class Heart {

}

class Human {
    private Heart heart;

    Human() {
        heart = new Heart(); // الكلاس انشأ اوبجكت
    }
}

// 3. Aggregation
class Student {

}

class Department {

    List<Student> students; // طلاب جايين من برا

}

// 4. Association
class Patient {

}

class Doctor {

    void treat(Patient p) { //  دكتور بيعالج مريض فقط يعني ما بملكه
        System.out.println("Doctor is treating the patient");

    }

}

public class Main {
    public static void main(String[] args) {

    }
}
