package Project;

public abstract class notAuothority {
    String Name;
    int    SSN;
    String Sex;
    String Address;
    int[]  phone = new int[3];

    public notAuothority(String Name, int SSN, String Sex, String Address, int PhoneNumber){
        this.Name      = Name;
        this.SSN       = SSN;
        this.Sex       = Sex;
        this.Address   = Address;
        for (int i = 0; i < 3; i++)
        {
            if(phone[i] == 0)
            {
                phone[i] = PhoneNumber;
                break;
            }
        }
    }
    public notAuothority(String Name, String Sex, String Address, int PhoneNumber){
        this.Name      = Name;
        this.Sex       = Sex;
        this.Address   = Address;
        for (int i = 0; i < 3; i++)
        {
            if(phone[i] == 0)
            {
                phone[i] = PhoneNumber;
                break;
            }
        }


    }
}
