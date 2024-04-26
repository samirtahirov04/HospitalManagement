package Hospital;


import java.util.ArrayList;

public class Person extends Run {
    //Fields
    private String name;
    private int age;
    private String contactInformation;
    private int uniqueId;

    //Constructors
    public Person() {
        Patient.numberOfPatients++;
    }

    public Person(String name) {
        this.name = name;
    }


    public Person(String name, int age) {
        this(name);
        this.name = name;
    }

    public Person(String name, int age, String contactInformation) {
        this(name, age);
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String contactInformation, int uniqueId) {
        this(name, age, contactInformation);
        this.name = name;
        this.age = age;
        this.contactInformation = contactInformation;
        this.uniqueId = uniqueId;
    }

    //Methods
    public static void viewDoctorsList() {
        if (Doctor.DoctorInformation.isEmpty()) {
            System.err.println("There is no doctor in the system.!");
        } else {
            for (int i = 0; i < Doctor.DoctorInformation.size(); i++) {
                System.out.println(Doctor.DoctorInformation.get(i));
            }
        }
    }

    public static void viewPatientList() {
        if (Patient.PatientInformation.isEmpty()) {
            System.err.println("The is no patient in the system.!");
        } else {
            for (int i = 0; i < Patient.PatientInformation.size(); i++) {
                System.out.println(Patient.PatientInformation.get(i));
            }
        }
    }

    //Getter and Setter methods
    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

}
