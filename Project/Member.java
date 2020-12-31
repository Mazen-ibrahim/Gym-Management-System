package Project;

public class Member extends notAuothority{
    String MemberShip;
    Double weight;
    
    public Member(String Name, int SSN, String Sex, String Address, int PhoneNumber, String memberShip, Double weight){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.MemberShip = memberShip;
        this.weight = weight;
    }

    public void getMemberinfo(){
        System.out.println("Name: "+Name);
        System.out.println("SSN: "+ SSN);
        System.out.println("Sex: "+ Sex);
        System.out.println("Address: "+ Address);
        System.out.println("PhoneNumbers:\n");
        System.out.println("MemberShip: "+MemberShip);
        for(int i = 0; i < 3 ;i++){
            if(phone[i] != 0){                        
                System.out.println(':'+phone[i]);
                System.out.println("weight: "+weight);
            }
        }        
    }
}
