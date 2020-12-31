package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Adminstrator extends auothority {
    Trainer[] trainers;
    Session[] sessions;
    Scanner scan = new Scanner(System.in);

    public Adminstrator(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        super(Name, SSN, Sex, Address, PhoneNumber, Salary, Hire_Date);

    }

    public void addTrainer_System(Trainer[] trainers){
        String Name;
        String Sex;
        String Address;
        int phoneNumber;
        int Salary;
        Trainer trainer;

        System.out.printf("Please Enter The Trainer Name: ");
        Name = scan.next();
        System.out.printf("male or female: ");
        Sex = scan.next();
        System.out.printf("Address: ");
        Address = scan.next();
        System.out.printf("PhoneNumber: ");
        phoneNumber = scan.nextInt();
        System.out.printf("Salary: ");
        Salary = scan.nextInt();

        trainer = new Trainer(Name, Sex, Address, phoneNumber, Salary);
        trainers = appendValue(trainers, trainer);

        }
    public void editTrainer_System(Trainer[] trainers,int TrainerID){
        int choice;
        String Name;
        String Sex;
        String Address;
        int phoneNumber;
        int Salary;
        boolean Done = false;
        for (Trainer trainer : trainers) {
            if(trainer.SSN == TrainerID){
                trainer.DisplayData();
                System.out.println("Choose which element would you like to edit:");
                System.out.println("Enter 0 when you are Done");
                System.out.println("1: Name");
                System.out.println("2: Sex");
                System.out.println("3: Address");
                System.out.println("4: PhoneNumber");
                System.out.println("5: Salary");
                while (Done != true){
                    
                    System.out.printf("Your choice: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 0:
                            Done = true;
                            System.out.println("Saved.");
                            break;
                        case 1:
                            System.out.printf("Enter the new Name: ");
                            Name = scan.next();
                            trainer.Name = Name;
                            break;
                        case 2:
                            System.out.printf("Enter the new Sex: ");
                            Sex = scan.next();
                            trainer.Sex = Sex;
                            break;
                        case 3:
                            System.out.printf("Enter the new Address: ");
                            Address = scan.next();
                            trainer.Address = Address;
                            break;
                        case 4:
                            System.out.printf("Enter the new PhoneNumber: ");
                            phoneNumber = scan.nextInt();
                            System.out.printf("Enter the index of the phoneNumber(1/2/3): ");
                            int index = scan.nextInt();
                            trainer.phone[index] = phoneNumber;
                            break;                        
                        case 5:
                            System.out.printf("Enter the new Salary: ");
                            Salary = scan.nextInt();
                            trainer.Salary = Salary;
                            break;                
                        default:
                            System.out.println("Enter Number form range (0-5)");
                            break;
                    }
                }
            }
            else{
                System.out.println("There is no Trainer with this ID in our System");
            }
        }
    }
    public void RemoveTrainer_System(Trainer[] trainers,int TrainerID){
        for (Trainer trainer : trainers) {
            if(trainer.SSN == TrainerID){
                trainers = removeValue(trainers, trainer);
                System.out.println("Trainer is removed successfully");
            }
            else{
                System.out.println("I couldn't find this Trainer in our System");
            }
        }
    }
    public void AddSession(Session[] sessions){
        String description;
        String type;
        String date;
        Session session;

        System.out.printf("Enter the Session's description: ");
        description = scan.next();
        System.out.printf("Enter the Session's type: ");
        type = scan.next();
        System.out.printf("Enter the Session's date in format(d/m/y): ");
        date = scan.next();

        session = new Session(description, type, date);
        sessions = appendValue(sessions, session);

    }
    public void editSession(Session[] sessions,String date){
        Boolean Done = false;
        int choice;
        for (Session session : sessions) {
            if(session.date.equals(date)){
                session.displayData();
                System.out.println("Choose which element would you like to edit:");
                System.out.println("Enter 0 when you are Done");
                System.out.println("1: description");
                System.out.println("2: type");
                System.out.println("3: date");
                while (Done != true){
                    
                    System.out.printf("Your choice: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 0:
                            Done = true;
                            System.out.println("Saved.");
                            break;
                        case 1:
                            System.out.printf("Enter the new description: ");
                            String description = scan.next();
                            session.description = description;
                            break;
                        case 2:
                            System.out.printf("Enter the new type: ");
                            String type = scan.next();
                            session.type = type;
                            break;
                        case 3:
                            System.out.printf("Enter the new date: ");
                            String newdate = scan.next();
                            session.date = newdate;
                            break;
                        default:
                            System.out.println("Enter Number form range (0-3)");
                            break;
                    }
                }
            } else{
                System.out.println("There is no Session in that day");
            }
        }
    }
    public void RemoveSession(Session[] sessions,String date){
        for (Session session : sessions) {
            if(session.date.equals(date)){
                sessions = removeValue(sessions, session);
                System.out.println("Session is removed successfully");
            } else{
                System.out.println("I couldn't find this Session in our System");
            }
        }
    }
    public void AssginTrainer_Member(int TrainerID,int MemberID){
        int trainer_num;
        int member_num;
        int num_of_members;

        for (int i =0; i<members.length ;i++) {
            System.out.println("Members");
            System.out.println("Name        SSN");
            System.out.printf(i+":"+members[i].Name+"       "+members[i].SSN);
        }
        for (int i =0; i< trainers.length ;i++) {
            System.out.println("Trainers");
            System.out.println("Name        SSN");
            System.out.printf(i+":"+trainers[i].Name+"       "+trainers[i].SSN);
        }
        System.out.println("Choose the Trainer Number which will be assigned to the members");
        System.out.printf("Trainer Number: ");
        trainer_num = scan.nextInt();
        
        System.out.println("How many Members Do you want to assgin them to the Trainer: "+trainers[trainer_num].Name);
        System.out.printf("Number of Members: ");
        num_of_members = scan.nextInt();
        
        System.out.print("Enter the Number of Member you want to assign the Trainer to");
        for(int i = 0 ; i<num_of_members;i++){
            System.out.printf("Member Number: ");
            member_num = scan.nextInt();
            
            trainers[trainer_num].Supervise = appendValue(trainers[trainer_num].Supervise, members[member_num]);
        }
    }
    
    private Trainer[] appendValue(Trainer[] trainers,Trainer trainer){
        ArrayList<Trainer> temp = new ArrayList<Trainer>(Arrays.asList(trainers));
        temp.add(trainer);
        trainers = temp.toArray(trainers);
        return trainers;
    }
    private Trainer[] removeValue(Trainer[] trainers,Trainer trainer){
        ArrayList<Trainer> temp = new ArrayList<Trainer>(Arrays.asList(trainers));
        temp.remove(trainer);
        trainers = temp.toArray(trainers);
        System.out.println("Trainer is added Successfully");
        return trainers;
    }
    private Session[] appendValue(Session[] sessions,Session session){
        ArrayList<Session> temp = new ArrayList<Session>(Arrays.asList(sessions));
        temp.add(session);
        sessions = temp.toArray(sessions);
        System.out.println("Session is added Successfully");
        return sessions;
    }
    private Session[] removeValue(Session[] Sessions,Session session){
        ArrayList<Session> temp = new ArrayList<Session>(Arrays.asList(Sessions));
        temp.remove(session);
        Sessions = temp.toArray(Sessions);
        System.out.println("Session is added Successfully");
        return Sessions;
    }
    private Member[] appendValue(Member[] supervise,Member member){
        ArrayList<Member> temp = new ArrayList<Member>(Arrays.asList(supervise));
        temp.add(member);
        supervise = temp.toArray(supervise);
        System.out.println("Member is added Successfully");
        return supervise;
    }

    

    
}
