package com.levelup.Model;

import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

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

    @ManyToMany(mappedBy = "userCourses")
    private Set<User> users = new HashSet<>();

}
