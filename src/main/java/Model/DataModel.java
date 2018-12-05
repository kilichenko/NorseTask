package Model;

import java.util.ArrayList;

public class DataModel {
    private static DataModel INSTANCE = null;
    private ArrayList<University> universities = new ArrayList<University>();

    public DataModel(){}

    public static DataModel getInstance(){
        if(INSTANCE == null)
        {
            INSTANCE = new DataModel();
        }
        return INSTANCE;
    }

    public void addUniversity(University uni){
        universities.add(uni);
    }

    public ArrayList<University> getUniversities(){
        return universities;
    }
}
