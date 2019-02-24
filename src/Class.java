public class Class {
    private int number;
    private Student leader;

    public Class(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student leader) {
        if (leader.getStdClass() == this) {
            this.leader = leader;
        } else {
            System.out.println("It is not one of us");
        }
    }

    public void appendMember(Student std) {
        std.setStdClass(this);
    }

    public boolean isIn(Student std) {
        return std.getStdClass() == this;
    }
}
