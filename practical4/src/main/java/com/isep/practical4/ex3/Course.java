package com.isep.practical4.ex3;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    private @Id @JsonProperty Long Course_Id;
    private @JsonProperty String Course_Teacher;
    private @JsonProperty String Course_Name;
    private @JsonProperty String Course_Content;
    public Course() {}


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
