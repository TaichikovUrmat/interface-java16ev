package java16.service.impl;

import java16.dao.impl.GroupDaoImpl;
import java16.models.Student;
import java16.service.StudentService;

public class StudentServiceImpl implements StudentService {


    private final GroupDaoImpl groupDao;

    public StudentServiceImpl(GroupDaoImpl groupDao) {
        this.groupDao = groupDao;
    }


    @Override
    public void addStudentByGroupName(String groupName, Student newStudent) {
      groupDao.addStudentByGroupName(groupName,newStudent);
    }
}
