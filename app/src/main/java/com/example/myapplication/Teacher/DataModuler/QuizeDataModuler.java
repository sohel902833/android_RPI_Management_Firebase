package com.example.myapplication.Teacher.DataModuler;

public class QuizeDataModuler {
  String quizName,accesstype,key,image;

    public  QuizeDataModuler(){

    }

    public QuizeDataModuler(String key,String quizName, String accesstype,String image) {
        this.key=key;
        this.quizName = quizName;
        this.accesstype = accesstype;
        this.image=image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getAccesstype() {
        return accesstype;
    }

    public void setAccesstype(String accesstype) {
        this.accesstype = accesstype;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
