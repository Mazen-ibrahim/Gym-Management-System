package Project;

public abstract class auothority {
    Session []SessionsArray = new Session[10];
    Member[] MembersArray = new Member[10];
    int []phone = new int[3];
    int    SSN;
    int Salary;
    String Hire_Date;
    String Name;
    String Sex;
    String Address;

    public auothority(String Name, int SSN, String Sex, String Address, int PhoneNumber, int Salary, String Hire_Date){
        this.Name      = Name;
        this.SSN       = SSN;
        this.Sex       = Sex;
        this.Address   = Address;
        for (int i = 0; i < 3; i++)
        {
            if(phone[i] == 0)
            {
                phone[i] = PhoneNumber;
            }
        }
        this.Salary    = Salary;
        this.Hire_Date = Hire_Date;
    }



    public void ViewMembers_Session(Session[] sessions){
        for (Session session : sessions) {
            if(session != null){
                session.display_membersInSession();
            }
        }
    }
    public void ViewMember_Membership(Member[] members,int MemberID){
        for (Member member : members) {
            if(member.SSN == MemberID){
                System.out.println(member.MemberShip);
            }
        }
    }
    public void ViewMembers_info(Member[] members){
        for (Member member : members) {
            if (member != null) {
                member.getMemberinfo();
            }
        }
    }


}
