package java16.models;

import java.util.Arrays;

public class Group {

    private Long id;
    private String groupName;
    private Student[] students;


    public Group(Long id, String groupName) {
        this.id = id;
        this.groupName = groupName;

    }

    public Group(Long id, String groupName, Student[] students) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
