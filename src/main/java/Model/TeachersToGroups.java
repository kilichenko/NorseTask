package Model;

import Model.Person.Teacher;

import java.util.ArrayList;
import java.util.Iterator;

public class TeachersToGroups {
    private ArrayList<TeacherToGroup> teachersToGroups = new ArrayList<TeacherToGroup>();

    public ArrayList<Group> getGroupsByTeacher(){
        return null;
    }

    public ArrayList<Teacher> getTeachersByGroup(){
        return null;
    }

    public void deleteGroup(Group group){
        teachersToGroups.removeIf(ttg -> ttg.getGroup() == group);
    }

    public void deleteTeacher(Teacher teacher){
        teachersToGroups.removeIf(ttg -> ttg.getTeacher() == teacher);
    }

    public void deleteGroupToTeacherConnection(Group group, Teacher teacher){
        teachersToGroups.removeIf(ttg -> ttg.getTeacher() == teacher && ttg.getGroup() == group);
    }

    private static class TeacherToGroup{
        private Teacher teacher;
        private Group group;

        public TeacherToGroup(Teacher teacher, Group group){
            this.teacher = teacher;
            this.group = group;
        }

        Teacher getTeacher() {
            return teacher;
        }

        Group getGroup() {
            return group;
        }
    }
}
