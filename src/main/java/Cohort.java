import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }




    public static void main(String[] args) {
        Cohort cohortOne = new Cohort();
        Student emily = new Student(1, "Emily");
        Student grant = new Student(1, "Grant");
        Student john = new Student(2, "John");
        Student ben = new Student(3, "Ben");

        cohortOne.addStudent(grant);
        cohortOne.addStudent(john);
        cohortOne.addStudent(ben);
        cohortOne.addStudent(emily);


        for(int i = 0; i < cohortOne.getStudents().size() ; i++) {

            System.out.println(cohortOne.getStudents().get(i).getName());
        }
    }


}