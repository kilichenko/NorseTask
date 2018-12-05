package Model.Person;

import Model.Group;
import Model.Person.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Person {
    public enum Speciality {historian, physicist, mathematician, geographer, engineer, philosopher, psychologist}
    public enum Degree {Phd, MSc, EdD, PsyD, DMA}

    private Speciality speciality;
    private Degree degree;
    private ArrayList<Group> groups = new ArrayList<Group>();

    public Teacher(String name, String surname, String patronimic, String email,
                   LocalDate birthDate, Degree degree, Speciality speciality) throws IllegalArgumentException{
        super(name, surname, patronimic, email, birthDate);
        this.speciality = speciality;
        this.degree = degree;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nDegree: " + degree;
    }
}
