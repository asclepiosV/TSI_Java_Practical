package com.isep.practical4.ex3;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    private @Id Long Course_Id;
    private String Course_Teacher;
    private String Course_Name;
    private String Course_Content;


    public Course() {}

    public Long getSchedule(Schedule schedule) {
        return schedule.getShId();
    }

    public Long getCourseId(){
        return this.Course_Id;
    }
    public String getCourseTeacher(){
        return this.Course_Teacher;
    }
    public String getCourseName(){
        return this.Course_Name;
    }
    public String getCourseContent(){
        return this.Course_Content;
    }
}
