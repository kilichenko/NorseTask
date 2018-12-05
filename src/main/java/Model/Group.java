package Model;

import Model.Person.Student;

import java.util.ArrayList;

public class Group {
    private String name;
    private Student duty;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Group(String name, Student duty) throws IllegalArgumentException{
        this.name = name;
        this.duty = duty;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName() throws IllegalArgumentException{
        if(name.matches("")){
            throw new IllegalArgumentException("Illegal group name");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getDuty() {
        return duty;
    }

    public void setDuty(Student duty) {
        this.duty = duty;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nStudent on duty: " + duty.getName() + "Number of students: " + students.size();
    }
}
