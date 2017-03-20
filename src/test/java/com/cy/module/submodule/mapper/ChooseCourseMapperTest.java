package com.cy.module.submodule.mapper;

import com.cy.module.submodule.BaseTest;
import com.cy.module.submodule.entity.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
public class ChooseCourseMapperTest extends BaseTest {

    @Autowired
    private ChooseCourseMapper chooseCourseMapper;

    @Test
    public void testSelectMultiByExample() {

        ChooseCourseMultiExample example = new ChooseCourseMultiExample();

        StudentExample studentExample = new StudentExample();

        CourseExample courseExample = new CourseExample();

        ChooseCourseExample chooseCourseExample = new ChooseCourseExample();

        example.setStudentExample(studentExample);
        example.setCourseExample(courseExample);
        example.setChooseCourseExample(chooseCourseExample);

        List<ChooseCourseMulti> chooseCourseMultis = chooseCourseMapper.selectMultiByExample(example);
        for (ChooseCourseMulti chooseCourseMulti : chooseCourseMultis) {
            Student student = chooseCourseMulti.getStudent();
            System.out.println(student);
            Course course = chooseCourseMulti.getCourse();
            System.out.println(course);
            ChooseCourse chooseCourse = chooseCourseMulti.getChooseCourse();
            System.out.println(chooseCourse);
        }

    }




}
