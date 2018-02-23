package com.example.uygulama.model;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lesson {


    @Id
    @GeneratedValue

    private Long id;

    @Column
    private String name;

    @Column
    private int hours;

    /**
     * /**
     * <p>
     * <p>
     * FK_STUDENT_ID" adında bir foreign key colomu oluşturulup Student entitysinde "student_id"
     * colomuna referans veriliyor.Dikkat edersek foregin alanı ilişkinin çok olan tarafında oluşturuluyor.
     **/
      @ManyToOne
      @JoinColumn(name="FK_STUDENT_ID",referencedColumnName = "student_id")
     private Student student;

    //Hangi entityle bağlantı kurulacağı tanımlanıyor..Dependency injection ile karıştırılmamalıdır..


    public Lesson() {
    }

    public Lesson(String name, int hours) {
        this.name = name;
        this.hours = hours;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


}
