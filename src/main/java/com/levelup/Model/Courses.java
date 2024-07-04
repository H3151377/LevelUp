package com.levelup.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import javax.naming.Name;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Courses {

    @Id
    @Column(name = "Courses_Id")
    private Long Courses_Id;

    @Column(name="Course_Name")
    private String Course_Name;

    @Column(name="Course_Description")
    private String Course_Description;

    @Column(name="Course_Category_Id")
    private String Course_Category_Id;

    @Column(name="Course_Price")
    private String Course_Price;

    @Column(name="Course_Created_Time")
    private String Course_Created_Time;

    @Column(name = "Course_Documents_URL")
    private List<String> Course_Documents_URL;

    @Column(name = "Course_Video_URL")
    private List<String> Course_Video_URL;

    @Column(name = "Course_Image_URL")
    private List<String> Course_Image_URL;

}
