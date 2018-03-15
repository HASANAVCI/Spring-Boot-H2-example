package com.example.uygulama.model;

import javax.persistence.*;
import java.util.List;


@Entity

public class Student {


    @Id
    @GeneratedValue
    private Long student_id;

    @Column
    private int no;

    @Column
    private String adi;

    @Column
    private String soyadi;

    /**
     **/

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
//    private List<Lesson> lesson;
    //Bir öğrenciye ait ders listesi içerisinde birden fazla ders olabilir..
    //Karşı taraftaki entityden ders listesi geleceği tanımlanıyor.



    public Student() {

    }


    public Student(int no, String adi, String soyadi, List<Lesson> lesson) {
//        this.lesson = lesson;
        this.no = no;
        this.adi = adi;
        this.soyadi = soyadi;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

//    public List<Lesson> getLesson() {
//        return lesson;
//    }
//
//    public void setLesson(List<Lesson> lesson) {
//        this.lesson = lesson;
//    }


}
