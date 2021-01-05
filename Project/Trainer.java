package Project;

public class Trainer extends notAuothority{

    Session[] session;
    Session[] Holds;
    Member[] members;
    Member[] Supervise;
    int Salary;

    public Trainer(String Name, int SSN, String Sex, String Address, int PhoneNumber, int Salary){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.Salary = Salary;
    }
    public Trainer(String Name, String Sex, String Address, int PhoneNumber, int Salary, Trainer[] trainers){
        super(Name, Sex, Address, PhoneNumber);
        this.Salary = Salary;
        for (int i = 0; i<trainers.length;i++){
            if(trainers[i] == null){
                SSN = i;
                break;
            }
        }
    }
    
    public void DisplayData(){
        System.out.println("Name: "+Name);
        System.out.println("Sex: "+ Sex);
        System.out.println("Address: "+Address);
        System.out.println("Salary: "+Salary);
        System.out.println("Phone Number:");
        for(int i = 0 ; i<3;i++){
            System.out.println(phone[i]);
        }
    }
}