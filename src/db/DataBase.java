package db;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Group> group = new ArrayList<>();
    private List<Student>students = new ArrayList<>();




    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
