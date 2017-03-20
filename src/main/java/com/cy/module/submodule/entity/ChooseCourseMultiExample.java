package com.cy.module.submodule.entity;

/**
 * Created by Administrator on 2017/3/20.
 */
public class ChooseCourseMultiExample {
    public StudentExample studentExample;
    public CourseExample courseExample;
    public ChooseCourseExample chooseCourseExample;

    public StudentExample getStudentExample() {
        return studentExample;
    }

    public void setStudentExample(StudentExample studentExample) {
        this.studentExample = studentExample;
    }

    public CourseExample getCourseExample() {
        return courseExample;
    }

    public void setCourseExample(CourseExample courseExample) {
        this.courseExample = courseExample;
    }

    public ChooseCourseExample getChooseCourseExample() {
        return chooseCourseExample;
    }

    public void setChooseCourseExample(ChooseCourseExample chooseCourseExample) {
        this.chooseCourseExample = chooseCourseExample;
    }

    @Override
    public String toString() {
        return "ChooseCourseMultiExample{" +
                "studentExample=" + studentExample +
                ", courseExample=" + courseExample +
                ", chooseCourseExample=" + chooseCourseExample +
                '}';
    }
}
