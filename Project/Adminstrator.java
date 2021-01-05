package Project;

import java.util.Scanner;

public class Adminstrator extends auothority {
    
    Trainer []TrainersArray = new Trainer[10];
    Scanner scan = new Scanner(System.in);

    public Adminstrator(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        super(Name, SSN, Sex, Address, PhoneNumber, Salary, Hire_Date);

    }

    public void addTrainer_System(){
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

        trainer = new Trainer(Name, Sex, Address, phoneNumber, Salary,TrainersArray);
        appendValue(TrainersArray, trainer);

        }
    public void editTrainer_System(int TrainerID){
        int choice;
        String Name;
        String Sex;
        String Address;
        int phoneNumber;
        int Salary;
        boolean Done = false;
        for (Trainer trainer : TrainersArray) {
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
    public void RemoveTrainer_System(int TrainerID){
        for (Trainer trainer : TrainersArray) {
            if(trainer.SSN == TrainerID){
                removeValue(TrainersArray, trainer);
                System.out.println("Trainer is removed successfully");
            }
            else{
                System.out.println("I couldn't find this Trainer in our System");
            }
        }
    }
    public void AddSession(){
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
        appendValue(SessionsArray, session);

    }
    public void editSession(String date){
        Boolean Done = false;
        int choice;
        for (Session session : SessionsArray) {
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
    public void RemoveSession(String date){
        for (Session session : SessionsArray) {
            if(session.date.equals(date)){
                removeValue(SessionsArray, session);
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

        for (int i =0; i<MembersArray.length ;i++) {
            System.out.println("Members");
            System.out.println("Name        SSN");
            System.out.printf(i+":"+MembersArray[i].Name+"       "+MembersArray[i].SSN);
        }
        for (int i =0; i< TrainersArray.length ;i++) {
            System.out.println("Trainers");
            System.out.println("Name        SSN");
            System.out.printf(i+":"+TrainersArray[i].Name+"       "+TrainersArray[i].SSN);
        }
        System.out.println("Choose the Trainer Number which will be assigned to the members");
        System.out.printf("Trainer Number: ");
        trainer_num = scan.nextInt();
        
        System.out.println("How many Members Do you want to assgin them to the Trainer: "+TrainersArray[trainer_num].Name);
        System.out.printf("Number of Members: ");
        num_of_members = scan.nextInt();
        
        System.out.print("Enter the Number of Member you want to assign the Trainer to");
        for(int i = 0 ; i<num_of_members;i++){
            System.out.printf("Member Number: ");
            member_num = scan.nextInt();
            
            appendValue(TrainersArray[trainer_num].Supervise, MembersArray[member_num]);
        }
    }
    
    private void appendValue(Trainer[] trainers,Trainer trainer){
        for (int i = 0; i < 10; i++) {
            if(trainers[i] == null){
                trainers[i] = trainer;
                break;
            }
        }
        trainer.DisplayData();
        System.out.println("Trainer is added Suuccessfully");
        for (Trainer trainer2 : trainers) {
            if (trainer2 == null) {
                continue;
            }
            System.out.println(trainer2);
        }
    }
    private void removeValue(Trainer[] trainers,Trainer trainer){
        for (int i = 0 ; i<10; i++) {
            if(trainers[i] == trainer){
                trainers[i] = null;
                break;
            }
        }
        System.out.println("Trainer is Successfully deleted");
        for (Trainer trainer2 : trainers) {
            if (trainer2 == null) {
                continue;
            }
            System.out.println(trainer2);
        }
    }
    private void appendValue(Session[] sessions,Session session){
        for (int i = 0; i < 10; i++) {
            if(sessions[i] == null){
                sessions[i] = session;
                break;
            }
        }
        session.displayData();
        System.out.print("Session is Added Successfully");
        for (Session session2 : sessions) {
            if(session2 == null){
                continue;
            }
            System.out.println(session2);
        }

    }
    private void removeValue(Session[] Sessions,Session session){
        for (int i = 0; i < Sessions.length; i++) {
            if(Sessions[i] == session){
                Sessions[i] = null;
                break;
            }
        }
        System.out.println("Session is deleted Successfully");
        for (Session session2 : Sessions) {
            if(session2 == null){
                continue;
            }
            System.out.println(session2);
        }
    }
    private void appendValue(Member[] supervise,Member member){
        for (int i = 0; i < supervise.length; i++) {
            if(supervise[i] == null){
                supervise[i] = member;
                break;
            }
        }
        for (Member member2 : supervise) {
            if(member2 == null){
                continue;
            }
            System.out.println(member2);
        }
        System.out.println("Member is added Successfully");
    }

    

    
}
