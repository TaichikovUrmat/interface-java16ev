package java16.dao;

import java16.models.Group;
import java16.models.Student;

public interface GroupDao {

    void addGroup(Group newGroup);

    // get all Group
    Group[] getAllGroup();

    void addStudentByGroupName(String groupName, Student newStudent);





}
