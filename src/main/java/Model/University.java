package Model;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();

    public University(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty f){
        faculties.add(f);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nNumber of faculties: " + faculties.size();
    }
}
