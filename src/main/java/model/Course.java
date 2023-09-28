package main.java.model;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private int duration;
    private String instructor;
    private String category;
    private double cost;

    public Course() {

    }

    public Course(String courseId, String title, String description, int duration, String instructor, String category, double cost) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructor = instructor;
        this.category = category;
        this.cost = cost;
    }

    public double getCourseCost(String courseName){
        if (courseName.equals(this.title)){
            return this.cost;
        }
        return 0.0;
    }


    public void displayCourseContent(){
        System.out.println("Displaying course content...");
        System.out.println("Video lecture of Week02");
        System.out.println("Lecture powerpoint slides.");
        System.out.println("Lecture Quize.");

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

   