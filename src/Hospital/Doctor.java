package Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person {
    //Fields
    static Scanner scanner = new Scanner(System.in);
    private int yearsOfExperience;
    private String specialization;
    private double salary;
    static ArrayList<Doctor> DoctorInformation = new ArrayList<>();

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, int age, int yearsOfExperience, String contactInformation, int uniqueId, String specialization, double salary) {
        super(name, age, contactInformation, uniqueId);
        this.setYearsOfExperience(yearsOfExperience);
        this.setSpecialization(specialization);
        this.setSalary(salary);
    }

    //Methods
    public static void registerDoctor() {
        Doctor doctor = new Doctor();
        System.out.print("Enter Doctor's name : ");
        doctor.setName(scanner.nextLine());
        System.out.print("Enter Doctor's age : ");
        doctor.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter Doctor's contact information (number,email) : ");
        doctor.setContactInformation(scanner.nextLine());
        System.out.print("Enter Doctor's specialization : ");
        doctor.setSpecialization(scanner.nextLine());
        System.out.print("Enter Doctor's experience : ");
        doctor.setYearsOfExperience(scanner.nextInt());
        System.out.print("Enter Doctor's salary : ");
        doctor.setSalary(scanner.nextDouble());
        System.out.print("Enter Doctor's uniqueId : ");
        doctor.setUniqueId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Doctors successfully registered");
        DoctorInformation.add(doctor);
    }


    public static void updateInformation() {
        if (Doctor.DoctorInformation.isEmpty()) {
            Doctor.viewDoctorsList();
        } else {
            System.out.println("Which doctor do yo you want to update ? ");
            Doctor.viewDoctorsList();
            System.out.print(" Enter Doctor id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < Doctor.DoctorInformation.size(); i++) {
                if (id == Doctor.DoctorInformation.get(i).getUniqueId()) {
                    System.out.print("Which information do you want to update? (name,age,contact,experience,id,specialization or all ? : ");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("name")) {
                        System.out.print("Enter the new name : ");
                        Doctor.DoctorInformation.get(i).setName(scanner.nextLine());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("age")) {
                        System.out.print("Enter new age : ");
                        Doctor.DoctorInformation.get(i).setAge(scanner.nextInt());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("contact")) {
                        System.out.print("Enter new contact : ");
                        Doctor.DoctorInformation.get(i).setContactInformation(scanner.nextLine());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("experience")) {
                        System.out.print("Enter new experience year : ");
                        Doctor.DoctorInformation.get(i).setYearsOfExperience(scanner.nextInt());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("specialization")) {
                        System.out.print("Enter new specialization : ");
                        Doctor.DoctorInformation.get(i).setSpecialization(scanner.nextLine());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("salary")) {
                        System.out.print("Enter new salary : ");
                        Doctor.DoctorInformation.get(i).setSalary(scanner.nextDouble());
                        System.out.println("Successfully updated");
                        break;
                    } else if (choice.equalsIgnoreCase("all")) {
                        updateAll();
                    }
                } else {
                    System.out.print("Please enter a true choice to change");
                }
            }
        }
    }

    public static void updateAll() {
        for (int i = 0; i < Doctor.DoctorInformation.size(); i++) {
            System.out.print("Enter the new name : ");
            Doctor.DoctorInformation.get(i).setName(scanner.nextLine());
            System.out.print("Enter new age : ");
            Doctor.DoctorInformation.get(i).setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter new contact : ");
            Doctor.DoctorInformation.get(i).setContactInformation(scanner.nextLine());
            System.out.print("Enter new experience year : ");
            Doctor.DoctorInformation.get(i).setYearsOfExperience(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter new specialization : ");
            Doctor.DoctorInformation.get(i).setSpecialization(scanner.nextLine());
            System.out.print("Enter new salary : ");
            Doctor.DoctorInformation.get(i).setSalary(scanner.nextDouble());
            System.out.println("Successfully updated");
        }
    }

    public static void increaseSalary() {
        if (Doctor.DoctorInformation.isEmpty()) {
            Doctor.viewDoctorsList();
        } else {
            System.out.println("Which doctor's salary do you want to increase ? ");
            Doctor.viewDoctorsList();
            System.out.print(" Enter Doctor id : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < Doctor.DoctorInformation.size(); i++) {
                if (id == Doctor.DoctorInformation.get(i).getUniqueId()) {
                    System.out.print("Please enter amount for increase salary : ");
                    double amount = scanner.nextDouble();
                    Doctor.DoctorInformation.get(i).setSalary(Doctor.DoctorInformation.get(i).salary + amount);
                }
            }
        }
    }

    public static void decreaseSalary() {
        if (Doctor.DoctorInformation.isEmpty()) {
            Doctor.viewDoctorsList();
        } else {
            System.out.println("Which doctor's salary do you want to decrease ? ");
            Doctor.viewDoctorsList();
            System.out.print(" Enter Doctor id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < Doctor.DoctorInformation.size(); i++) {
                if (id == Doctor.DoctorInformation.get(i).getUniqueId()) {
                    System.out.print("Please enter amount for decrease salary : ");
                    double amount = scanner.nextDouble();
                    Doctor.DoctorInformation.get(i).setSalary(Doctor.DoctorInformation.get(i).salary - amount);
                }
            }
        }
    }

    //Getter and Setter Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Id : " + this.getUniqueId() + " Name : " + this.getName() + " Age : "
                + this.getAge() + " Contact : " + this.getContactInformation() + " Experience : "
                + this.getYearsOfExperience() + " Salary : " + this.getSalary() + " Specialization : " + this.getSpecialization();
    }
}