public class StudentData {

    String id;
    String firstName;
    String email;
    String course;
    int age;

    public StudentData(String id, String firstName, String email, String course, int age){
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.course = course;
        this.age = age;

    }
    public StudentData() {
        id = "";
        firstName = "";
        email = "";
        course = "";
        age = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



