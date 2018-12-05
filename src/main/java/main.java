import MenuOperations.ReturnToMainMenu;
import Model.DataModel;
import Model.Faculty;
import Model.Group;
import Model.Person.Student;
import Model.Person.Teacher;
import Model.University;

import java.time.LocalDate;


public class main {
    public static void main(String[] args) {
        DataModel dm = new DataModel();
        addDummyData(dm);

        new ReturnToMainMenu().execute(dm);
    }

    private static void addDummyData(DataModel dm){
        Teacher t1 = new Teacher("Jordan", "Peterson", "Bernt", "JBP@gmail.com",
                LocalDate.of(1962, 6, 12), Teacher.Degree.Phd, Teacher.Speciality.psychologist);
        Teacher t2 = new Teacher("Elon", "Musk", "Reeve", "JBP@gmail.com",
                LocalDate.of(1962, 6, 12), Teacher.Degree.Phd, Teacher.Speciality.engineer);

        Student st1 = new Student("Gleb", "Kilichenko", "Yorievich", "glebk98@gmail.com",
                LocalDate.of(1962, 6, 12), Student.StudyForm.Budget, 95);
        Student st2 = new Student("Roma", "Burlaka", "Unknown", "glebk98@gmail.com",
                LocalDate.of(1962, 6, 12), Student.StudyForm.Budget, 95);


        Group gr1 = new Group("EEE-1621", st1);
        gr1.addStudent(st1);
        Group gr2 = new Group("SSS-1621", st2);
        gr2.addStudent(st2);
        Faculty f1 = new Faculty("Psychology", LocalDate.of(1998, 8, 12));
        Faculty f2 = new Faculty("Computer Science", LocalDate.of(2004, 10, 15));

        f1.addGroup(gr1);
        f2.addGroup(gr2);
        f1.addTeacher(t1);
        f2.addTeacher(t2);

        University uni = new University("University of Toronto");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        dm.addUniversity(uni);
    }
}
