public class Class {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Class(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student leader) {
        if (leader.getStdClass() == this) {
            this.leader = leader;
            this.teacher.welcomLeader(leader);
        } else {
            System.out.println("It is not one of us");
        }
    }

    public void appendMember(Student std) {
        std.setStdClass(this);
        this.teacher.welcomeStudent(std);
    }

    public boolean isIn(Student std) {
        return std.getStdClass() == this;
    }
}
