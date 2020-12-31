package Project;

public class Member extends notAuothority{
    String MemberShip;
    Double weight;
    
    public Member(String Name, int SSN, String Sex, String Address, int PhoneNumber, String memberShip, Double weight){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.MemberShip = memberShip;
        this.weight = weight;
    }
    public Member(String Name, String Sex, String Address, int PhoneNumber, String memberShip, Double weight){
        super(Name, Sex, Address, PhoneNumber);
        this.MemberShip = memberShip;
        this.weight = weight;
        for (int i = 0; i<members.length +1;i++){
            if(members[i] == null){
                SSN = i;
            }
        }
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
