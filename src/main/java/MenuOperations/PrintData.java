package MenuOperations;

import Model.DataModel;
import Model.Faculty;
import Model.Group;
import Model.Person.Student;
import Model.Person.Teacher;
import Model.University;
import UI.Executable;
import UI.Menu;

import java.util.ArrayList;

public class PrintData implements Executable {
    @Override
    public void execute(DataModel dm) {
        int choice;
        ArrayList<University> unies = dm.getUniversities();
        if(unies.size() == 0){
            System.out.println("No unies yet =(");
            exit(dm);
        }
        System.out.println("Univerities: \n");
        for(int i = 0; i < unies.size(); i++){
            System.out.println(i + 1 + "\n" + unies.get(i).toString());
        }
        System.out.println("\nWhich uni data to print?");
        choice = Menu.getInt(1, unies.size());

        ArrayList<Faculty> faculties = unies.get(choice - 1).getFaculties();
        if(faculties.size() == 0){
            System.out.println("No faculties yet =(");
            exit(dm);
        }
        System.out.println("Faculties:");
        for(int i = 0; i < faculties.size(); i++){
            System.out.println(i + 1 + "\n" + faculties.get(i).toString());
        }
        System.out.println("\nWhich faculty data to print?");
        choice = Menu.getInt(1, faculties.size());

        ArrayList<Teacher> teachers = faculties.get(choice - 1).getTeachers();
        ArrayList<Group> groups = faculties.get(choice - 1).getGroups();
        if(teachers.size() == 0){
            System.out.println("No teachers yet =(");
        }
        if(groups.size() == 0){
            System.out.println("No groups yet =(");
            exit(dm);
        }
        System.out.println("Teachers:");
        for(int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i).toString());
        }
        System.out.println("\nGroups:");
        for(int i = 0; i < groups.size(); i++){
            System.out.println(i + 1 + "\n" + groups.get(i).toString());
        }
        System.out.println("\nWhich group to print?");
        choice = Menu.getInt(1, faculties.size());

        ArrayList<Student> students = groups.get(choice - 1).getStudents();
        if(students.size() == 0){
            System.out.println("No students yet =(");
            exit(dm);
        }
        System.out.println("\nStudents:");
        for(int i = 0; i < students.size(); i++){
            System.out.println(i + 1 + "\n" + students.get(i).toString());
        }
        exit(dm);
    }

    private void exit(DataModel dm){
        Menu menu = new Menu(dm);
        menu.addOperation("Return to main menu", new ReturnToMainMenu());
        menu.addOperation("Exit", new Exit());
        menu.run();
    }
}
