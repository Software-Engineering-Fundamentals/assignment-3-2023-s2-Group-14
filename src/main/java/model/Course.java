package main.java.model;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private int duration;
    private String instructor;
    private String category;
    private double cost;


    public Course(String courseId, String title, String instructor, String category, double cost) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.category = category;
        this.cost = cost;
    }

}

   