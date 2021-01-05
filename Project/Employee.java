package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Employee extends auothority{
    Scanner scan = new Scanner(System.in);
    
    public Employee(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        super(Name, SSN, Sex, Address, PhoneNumber, Salary, Hire_Date);
    }

    public void AddMember_System(Member[] members){
        String Name;
        String Sex;
        String Address;
        int phoneNumber;
        String MemberShip;
        Double weight;
        Member member;

        System.out.printf("Please Enter The Member Name: ");
        Name = scan.next();
        System.out.printf("Male or Female: ");
        Sex = scan.next();
        System.out.printf("Address: ");
        Address = scan.next();
        System.out.printf("PhoneNumber: ");
        phoneNumber = scan.nextInt();
        System.out.printf("MemberShip: ");
        MemberShip = scan.next();
        System.out.printf("Weight: ");
        weight = scan.nextDouble();

        member = new Member(Name, Sex, Address, phoneNumber, MemberShip, weight,members);
        appendValue(members, member);
    }
    public void EditMember_System(Member[] members,int MemberID){
        int choice;
        String Name;
        String Sex;
        String Address;
        int phoneNumber;
        String MemberShip;
        Double weight;
        boolean Done = false;
        for (Member member : members) {
            if(member.SSN == MemberID){
                member.getMemberinfo();
                System.out.println("Choose which element would you like to edit:");
                System.out.println("Enter 0 when you are Done");
                System.out.println("1: Name");
                System.out.println("2: Sex");
                System.out.println("3: Address");
                System.out.println("4: PhoneNumber");
                System.out.println("5: MemberShip");
                System.out.println("6: Weight");
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
                            member.Name = Name;
                            break;
                        case 2:
                            System.out.printf("Enter the new Sex: ");
                            Sex = scan.next();
                            member.Sex = Sex;
                            break;
                        case 3:
                            System.out.printf("Enter the new Address: ");
                            Address = scan.next();
                            member.Address = Address;
                            break;
                        case 4:
                            System.out.printf("Enter the new PhoneNumber: ");
                            phoneNumber = scan.nextInt();
                            System.out.printf("Enter the index of the phoneNumber(1/2/3): ");
                            int index = scan.nextInt();
                            member.phone[index] = phoneNumber;
                            break;                        
                        case 5:
                            System.out.printf("Enter the new MemberShip: ");
                            MemberShip = scan.next();
                            member.MemberShip = MemberShip;
                            break;           
                        case 6:
                            System.out.printf("Enter the new Weight: ");
                            weight = scan.nextDouble();
                            member.weight = weight;
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
    public void RemoveMember_System(Member[] members,int MemberID){
        for (Member member : members) {
            if(member.SSN == MemberID){
                members = removeValue(members, member);
                System.out.println("The Member is removed successfully");
            }
            else{
                System.out.println("I couldn't find this Member in our System");
            }
        }
    }
    public void AddMember_Session(Session[] sessions,String date,Member member){
        for (Session session : sessions) {
            if(session.date.equals(date)){
                appendValue(session.members_in_Session, member);
            }
        }
    }
    public void RemoveMember_Session(Session[] sessions,String date,Member member){
        for (Session session : sessions) {
            if(session.date.equals(date)){
                session.members_in_Session = removeValue(session.members_in_Session, member);
            }
        }
    }
    private void appendValue(Member[] members,Member member){
        for (Member member2 : members) {
            if(member2 == null){
                member2 =member;
                break;
            }
        }
        member.getMemberinfo();
        System.out.println("Member is added Successfully");
        for (Member member3 : members) {
            System.out.println(member3);
        }

    }
    private Member[] removeValue(Member[] members,Member member){
        ArrayList<Member> temp = new ArrayList<Member>(Arrays.asList(members));
        temp.remove(member);
        members = temp.toArray(members);
        System.out.println("Member is Successfully deleted");
        return members;
    }

}