package Model;

import Model.Person.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class Faculty {
    private String name;
    private LocalDate creationDate;
    private ArrayList<Group> groups = new ArrayList<Group>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public Faculty(String name, LocalDate creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public ArrayList<Group> getGroups(){
        return groups;
    }

    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + creationDate.toString() + "\n" +
                "Number of groups: " + groups.size() + "\nNumber of teachers: " + teachers.size();
    }
}
