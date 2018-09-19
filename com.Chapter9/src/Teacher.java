
//Setter and Getter based
// first value set then get
public class Teacher {

    int id;
    String name;
    String educationQualification;
    //Take a main method or any method
    //create object using default constructor

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public static void main(String[] args) {
        Teacher teach = new Teacher();
        teach.setId(200);
        teach.setName("Wadud Azad");
        teach.setEducationQualification("BBA");
        System.out.println("ID: "+teach.getId()+" Name: "+teach.getName()+" Education: "+teach.getEducationQualification());
                        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
}
