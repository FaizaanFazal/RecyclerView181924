package com.example.recyclerview181924.Modal;

import com.example.recyclerview181924.MainActivity;

public class student extends MainActivity {
    String Name,Rollno;

    public student() {
    }

    public student(String name, String rollno) {
        Name = name;
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }
}
