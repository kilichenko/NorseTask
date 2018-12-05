package Model.Person;

import java.time.LocalDate;

public abstract class Person {
    private static final int MAXNAMELENGTH = 30;
    private static final int MAXAGE = 130;

    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public Person(String name, String surname, String patronymic, String email,
                  LocalDate birthDate) throws IllegalArgumentException{
        this.setName(name);
        this.setSurname(surname);
        this.setPatronymic(patronymic);
        this.setEmail(email);
        this.setBirthDate(birthDate);
    }

    public void setName(String name) throws IllegalArgumentException {
        if(!name.matches("^[A-Z][a-z]{1," + MAXNAMELENGTH  + "}$")) {
            throw new IllegalArgumentException("Illegal name");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws IllegalArgumentException {
        if(!surname.matches("^[A-Z][a-z]{1," + MAXNAMELENGTH + "}$")) {
            throw new IllegalArgumentException("Illegal surname");
        }
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) throws IllegalArgumentException {
        if(!patronymic.matches("^[A-Z][a-z]{1," + MAXNAMELENGTH + "}$")) {
            throw new IllegalArgumentException("Illegal patronymic");
        }
        this.patronymic = patronymic;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if(!email.matches("^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,}$")) {
            throw new IllegalArgumentException("Illegal email");
        }
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws IllegalArgumentException{
        if(LocalDate.now().getYear() - birthDate.getYear() > MAXAGE){
            throw new IllegalArgumentException("Illegal date");
        }
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Full Name: " + name + " " + surname + " " + patronymic + "\nEmail: " + email +
                "\nBirth Date: " + birthDate.toString();
    }
}
