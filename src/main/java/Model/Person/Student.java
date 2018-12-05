package Model.Person;

import Model.Person.Person;

import java.time.LocalDate;

public class Student extends Person {
    public enum StudyForm {Contract, Budget}

    private static final int MAXAVGSCORE = 100;
    private static final int MINAVGSCORE = 60;

    private StudyForm studyForm;
    private double avgScore;

    public Student( String name, String surname, String patronymic, String email, LocalDate birthDate,
                    StudyForm studyForm, double avgScore) throws IllegalArgumentException {
        super(name, surname, patronymic, email, birthDate);
        this.setStudyForm(studyForm);
        this.setAvgScore(avgScore);
    }


    public StudyForm getStudyForm() {
        return studyForm;
    }

    public void setStudyForm(StudyForm studyForm) {
        this.studyForm = studyForm;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) throws IllegalArgumentException{
        if(avgScore > MAXAVGSCORE || avgScore < MINAVGSCORE){
            throw new IllegalArgumentException("Illegal average score");
        }
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy Form: " + studyForm + "\nAverage Score: " + avgScore;
    }
}
