package java16.dao.impl;

import java16.dao.GroupDao;
import java16.models.Group;
import java16.models.Student;
import java16.service.GroupService;

import java.util.Arrays;

public class GroupDaoImpl implements GroupDao {

    Group[] dataGroup = new Group[0];

    @Override
    public void addGroup(Group newGroup) {
        dataGroup = Arrays.copyOf(dataGroup, dataGroup.length + 1);
        dataGroup[dataGroup.length - 1] = newGroup;

    }

    @Override
    public Group[] getAllGroup() {
        return dataGroup;
    }

    @Override
    public void addStudentByGroupName(String groupName, Student newStudent) {
        boolean isbloc = false;
        for (Group group : dataGroup) {
            if (group.getGroupName().equalsIgnoreCase(groupName)){
                isbloc = true;
                Student[] students = {newStudent};
                group.setStudents(students);
                System.out.println(" susses !! ");
            }
        }
        if (!isbloc){
            System.out.println(" not found group Name:   " + groupName+ " jook !!!");
        }

    }


}
