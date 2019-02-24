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
        this.leader = leader;
    }
}
