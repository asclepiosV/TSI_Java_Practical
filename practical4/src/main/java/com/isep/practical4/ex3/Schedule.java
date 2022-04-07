package com.isep.practical4.ex3;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Schedule {
    private @Id @JsonProperty Long Sh_Id;
    private @JsonProperty java.sql.Date Date;
    public Schedule() {}

    public Long getShId(){
        return this.Sh_Id;
    }
    public Date getShDate(){
        return this.Date;
    }
}
