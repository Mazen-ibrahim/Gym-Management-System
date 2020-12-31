package Project;

public class Session {
    final int num_of_trainers = 1;
    final int num_of_members = 15;
    Member[] members_in_Session = new Member[num_of_members];
    String description;
    String type;
    String date;

    public Session(String description, String type, String date){
        this.description = description;
        this.type = type;
        this.date = date;
    }

    public void display_membersInSession(){
        for (Member member : members_in_Session) {
            if (member != null) {
                member.getMemberinfo();
            }
        }
    }
    public void displayData(){
        System.out.println("description: "+description);
        System.out.println("type: "+type);
    }
}
