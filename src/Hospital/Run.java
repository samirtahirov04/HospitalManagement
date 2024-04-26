package Hospital;

import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void runProject() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Register patient");
            System.out.println("2.Find patient");
            System.out.println("3.Update Patient");
            System.out.println("4.All patients list");
            System.out.println("5.Register Doctor");
            System.out.println("6.Update doctor");
            System.out.println("7.Increase Salary");
            System.out.println("8.Decrease Salary");
            System.out.println("9.All doctors list");
            System.out.println("10.All information");
            System.out.println("11.Number of patients");
            System.out.println("0.Stop the program");
            System.out.print("Please enter a number for operation : ");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 0) {
                System.out.print("Program stopped");
                break;
            } else {
                switch (input) {
                    case 1:
                        Patient.registerPatient();
                        break;
                    case 2:
                        Patient.findPatient();
                        break;
                    case 3:
                        Patient.updateInformation();
                        break;
                    case 4:
                        Person.viewPatientList();
                        break;
                    case 5:
                        Doctor.registerDoctor();
                        break;
                    case 6:
                        Doctor.updateInformation();
                        break;
                    case 7:
                        Doctor.increaseSalary();
                        break;
                    case 8:
                        Doctor.decreaseSalary();
                        break;
                    case 9:
                        Person.viewDoctorsList();
                        break;
                    case 10:
                        Person.viewDoctorsList();
                        Person.viewPatientList();
                        break;
                    case 11:
                        if (Patient.numberOfPatients == 0) {
                            System.err.println("There is no patient in the system");
                            break;
                        } else {
                            System.out.println("There are " + Patient.numberOfPatients + " patient in the system");
                            break;
                        }
                }
            }
        }

    }
}

