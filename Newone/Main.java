package Newone;

import java.util.List;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getType() {
        return "regular";
    }
}

class HonorsStudent extends Student {
    private int scholarShip;

    public HonorsStudent(String name, int grade, int scholarShip) {
        super(name, grade);
        this.scholarShip = scholarShip;
    }

    public int getScholarShip() {
        return scholarShip;
    }

    @Override
    public String getType() {
        return "honors";
    }

}

public class Main {
    public static void main(String[] args) {
        List<Student> students =List.of(
                new Student("Alice", 85),
                new HonorsStudent("Bob", 90, 1000),
                new Student("Charlie", 45),
                new HonorsStudent("David", 92, 1500));

                //Hadi- Honor - 90

                students.stream()
                        .filter( x -> x.getGrade() > 50 )
                        .sorted( (a, b ) -> b.getGrade() - a.getGrade())
                        .forEach( x -> System.out.println(x.getName() + " - " + x.getType() + " - " + x.getGrade()));



    
        

    }

}
