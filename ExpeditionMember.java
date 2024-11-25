public class ExpeditionMember {
    private String memberName;
    private int studentID;
    public static int member_counter = 0;

    public void ExpeditionMemberIncrement(){
        member_counter++;
        System.out.println("this is how many members: " + member_counter);
    }

    //initalise
    public ExpeditionMember(String memberName, int studentID){
        this.memberName = memberName;
        this.studentID = studentID;
        ExpeditionMemberIncrement();
    }

    //getter for member
    public String getMemberName() {
        return memberName;
    }
    //setter for member
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    //get studentID
    public int getStudentID() {
        return studentID;
    }
    //set studentID
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
