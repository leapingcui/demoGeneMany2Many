package com.cy.module.submodule.entity;

/**
 * Created by Administrator on 2017/3/20.
 */
public class ChooseCourseMulti {
    private Student student;
    private Course course;
    private ChooseCourse chooseCourse;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ChooseCourse getChooseCourse() {
        return chooseCourse;
    }

    public void setChooseCourse(ChooseCourse chooseCourse) {
        this.chooseCourse = chooseCourse;
    }

    @Override
    public String toString() {
        return "ChooseCourseMulti{" +
                "student=" + student +
                ", course=" + course +
                ", chooseCourse=" + chooseCourse +
                '}';
    }
}
