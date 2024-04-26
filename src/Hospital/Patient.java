package Hospital;

import java.util.*;

public class Patient extends Person {
    //Fields
    static Scanner scanner = new Scanner(System.in);
    public static int numberOfPatients;
    static ArrayList<Patient> PatientInformation = new ArrayList<>();

    //Methods
    public static void findPatient() {
        System.out.print("Enter Name or id for search patient : ");
        String input = scanner.nextLine();
        for (int i = 0; i < Patient.PatientInformation.size(); i++) {
            if (Patient.PatientInformation.get(i).getName().equals(input) || Patient.PatientInformation.get(i).getUniqueId().equals(Integer.parseInt(input))) {
                System.out.println(Patient.PatientInformation.get(i).toString());
                break;
            } else {
                System.out.println("Patient not found");
            }
        }
    }

    public static void registerPatient() {
        Patient patient = new Patient();
        System.out.print("Enter Patient name : ");
        patient.setName(scanner.nextLine());
        System.out.print("Enter Patient age : ");
        patient.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter patient contact information (number,email) : ");
        patient.setContactInformation(scanner.nextLine());
        System.out.print("Enter Patient uniqueId : ");
        patient.setUniqueId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Patient successfully registered");
        PatientInformation.add(patient);
    }

    public static void updateInformation() {
        if (Patient.PatientInformation.isEmpty()) {
            Patient.viewPatientList();
        } else {
            Patient.viewPatientList();
            System.out.println("Which patient do yo you want to update ?");
            System.out.print(" Enter patient id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < Patient.PatientInformation.size(); i++) {
                if (id == Patient.PatientInformation.get(i).getUniqueId()) {
                    System.out.print("Which information do you want to update? (name,age,contact) or All : ");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("name")) {
                        System.out.print("Enter the new name : ");
                        Patient.PatientInformation.get(i).setName(scanner.nextLine());
                        System.out.println("Successfully updated!");
                        break;
                    } else if (choice.equalsIgnoreCase("age")) {
                        System.out.print("Enter new age : ");
                        Patient.PatientInformation.get(i).setAge(scanner.nextInt());
                        System.out.println("Successfully updated!");
                        break;
                    } else if (choice.equalsIgnoreCase("contact")) {
                        System.out.print("Enter new contact : ");
                        Patient.PatientInformation.get(i).setContactInformation(scanner.nextLine());
                        System.out.println("Successfully updated!");
                        break;
                    } else if (choice.equalsIgnoreCase("all")) {
                        updateAll();
                    } else {
                        System.out.print("Please enter a true choice to change");
                    }
                }
            }
        }
    }

    public static void updateAll() {
        for (int i = 0; i < Patient.PatientInformation.size(); i++) {
            System.out.print("Enter the new name : ");
            Patient.PatientInformation.get(i).setName(scanner.nextLine());
            System.out.print("Enter new age : ");
            Patient.PatientInformation.get(i).setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter new contact : ");
            Patient.PatientInformation.get(i).setContactInformation(scanner.nextLine());
            System.out.println("Successfully updated!");
        }
    }

    @Override
    public String toString() {
        return "Id : " + this.getUniqueId() + " Name : " + this.getName() + " Age : " + this.getAge() + " Contact : " + this.getContactInformation();
    }
}
