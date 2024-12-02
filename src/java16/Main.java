package java16;

import java16.dao.impl.GroupDaoImpl;
import java16.models.Group;
import java16.models.Student;
import java16.service.impl.GroupServiceImpl;
import java16.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        GroupDaoImpl groupDao = new GroupDaoImpl();
        GroupServiceImpl groupService = new GroupServiceImpl(groupDao);

        StudentServiceImpl studentService = new StudentServiceImpl(groupDao);

        groupService.addGroup(new Group(1L,"java16"));
        System.out.println(Arrays.toString(groupService.getAllGroup()));

        studentService.addStudentByGroupName("java16",
                new Student(1L,"Kanchoro","Maraimov", LocalDate.of(2003,10,7),"Male",555700800));
        System.out.println(Arrays.toString(groupService.getAllGroup()));



    }
}