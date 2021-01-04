package Gym_Management_System;

import java.util.Scanner;

public class GymManagementSystem {

    
    public static void main(String[] args) {
        String username;
        String password;
        Scanner scan = new Scanner(System.in);
        
        username = scan.next();
        password = scan.next();
        
        Trainer T1 = new Trainer("Mazen", 3455, "Male", "Shobra", 38942871, 3000);
        Member M1 = new Member("Michael", 7939, "Male", "Shobra", 23789848, "PAYG", 65.5);
        Session S1 = new Session("High Intensity Session", "Weight Lifting", "30-12-2020");
        Trainer T2;
        Session S2;
        Member M2;
        int Trainer_Id;
        int Member_Id;
        String SessionDate;
        
        int choice;
        boolean Done = false;
        
        if(username.equals("admin")  & password.equals("admin")){
            Adminstrator A1 = new Adminstrator("Loka", 17000, 2065, "Male", "Nasr City", 1523945, "12-5-2010");
            System.out.println("Welcome Admin");
            System.out.println("Choose what you want to do:");
            System.out.println("Enter 0 when you are Done");
            System.out.println("1: Add Trainer");
            System.out.println("2: Edit Trainer");
            System.out.println("3: Remove Trainer");
            System.out.println("4: Add Session");
            System.out.println("5: Edit Session");
            System.out.println("6: Delete Session");
            System.out.println("7: Assign Trainer to a Member");
            System.out.println("8: View the Information of a Member");
            System.out.println("9: View Members in a Session");
            
            while (Done != true){

                System.out.printf("Your choice: ");
                choice = scan.nextInt();
                switch (choice) {
                    case 0:
                        Done = true;
                        System.out.println("Saved.");
                        break;
                    case 1:
                        System.out.println("Choose a Trainer: ");
                        T2 = scan.next();
                        A1.addTrainer_System(T2);
                        break;
                    case 2:
                        System.out.println("Choose a Trainer: ");
                        T2 = scan.next();
                        System.out.println("Enter Trainer ID: ");
                        Trainer_Id = scan.nextInt();
                        A1.editTrainer_System(T2, Trainer_Id);
                        break;
                    case 3:
                        System.out.println("Choose a Trainer: ");
                        T2 = scan.next();
                        System.out.println("Enter Trainer ID: ");
                        Trainer_Id = scan.nextInt();
                        A1.RemoveTrainer_System(T2, Trainer_Id);
                        break;
                    case 4:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        A1.AddSession(S1);
                        break;                        
                    case 5:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        System.out.println("Enter Session Date: ");
                        SessionDate = scan.next();
                        A1.editSession(S1, SessionDate);
                        break;  
                    case 6:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        System.out.println("Enter Session Date: ");
                        SessionDate = scan.next();
                        A1.RemoveSession(S1, SessionDate);
                        break;
                    case 7:
                        System.out.println("Enter Trainer Id: ");
                        Trainer_Id = scan.nextInt();
                        System.out.println("Enter Memeber Id: ");
                        Member_Id = scan.nextInt();
                        A1.AssginTrainer_Member(Trainer_Id, Member_Id);
                        break; 
                    case 8:
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        M2.getMemberinfo();
                        break; 
                    case 9:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        S2.display_membersInSession();
                        break; 
                    default:
                        System.out.println("Enter Number form range (0-9)");
                        break;
                }
            } 
        }
        else if(username.equals("employee") & password.equals("12345")){
            Employee E1 = new Employee("Dou7", 14000, 8477, "Male", "El7mamat", 89828978, "27-6-2012");
            System.out.println("Welcome Employee");
            System.out.println("Welcome Admin");
            System.out.println("Choose what you want to do:");
            System.out.println("Enter 0 when you are Done");
            System.out.println("1: Add Member");
            System.out.println("2: Edit Member");
            System.out.println("3: Remove Member");
            System.out.println("4: Add Member to Session");
            System.out.println("5: Remove Member from Session");
            System.out.println("6: View the Information of a Member");
            System.out.println("7: View Members in a Session");
            
            while (Done != true){

                System.out.printf("Your choice: ");
                choice = scan.nextInt();
                switch (choice) {
                    case 0:
                        Done = true;
                        System.out.println("Saved.");
                        break;
                    case 1:
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        System.out.println("Enter Member ID: ");
                        Member_Id = scan.nextInt();
                        E1.AddMember_System(M2, Member_Id);
                        break;
                    case 2:
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        System.out.println("Enter Member ID: ");
                        Member_Id = scan.nextInt();
                        E1.EditMember_System(M2, Member_Id);
                        break;
                    case 3:
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        System.out.println("Enter Member ID: ");
                        Member_Id = scan.nextInt();
                        E1.RemoveMember_System(M2, Member_Id);
                        break;
                    case 4:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        System.out.println("Enter Session Date: ");
                        SessionDate = scan.next();
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        E1.AddMember_Session(S2, SessionDate, M2);
                        break;                        
                    case 5:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        System.out.println("Enter Session Date: ");
                        SessionDate = scan.next();
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        E1.RemoveMember_Session(S2, SessionDate, M2);
                        break;   
                    case 6:
                        System.out.println("Choose a Member: ");
                        M2 = scan.next();
                        M2.getMemberinfo();
                        break; 
                    case 7:
                        System.out.println("Choose a Session: ");
                        S2 = scan.next();
                        S2.display_membersInSession();
                        break; 
                    default:
                        System.out.println("Enter Number form range (0-9)");
                        break;
                }
            }   
        }
        else
            System.out.println("Wrong credentials");
    }
}
