import java.util.ArrayList;
import java.util.List;

public class Student {

    static long counter;
    private long id;
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        counter++;
        id = counter;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public int getAverage() {
        int addedGrades = 0;
        for (int i = 0; i < grades.size(); i++) {
            addedGrades += grades.get(i);
        }
        return addedGrades / grades.size();
    }

    public List<Integer> updateGrade(int grade) {

        for (int i = 0; i < grades.size(); i++) {
            grades.remove(i);
        }

        grades.add(grade);
        return grades;
    }


    public static void main(String[] args) {
        Student mike = new Student("Mike");
        mike.addGrade(100);
        mike.addGrade(50);
        System.out.println(mike.getAverage());
        System.out.println(mike.updateGrade(80));
    }
}

