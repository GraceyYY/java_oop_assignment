public class Student extends Person {
    private Class stdClass;

    public Student(String id, String name, int age, Class stdClass) {
        super(id, name, age);
        this.stdClass = stdClass;
    }

    @Override
    public String introduce() {
        String output = super.introduce() + "I am a Student. ";
        if (this.stdClass.getLeader() == this) {
            output = output + "I am Leader of Class " + this.stdClass.getNumber() + ".";
        } else {
            output = output + "I am at Class " + this.stdClass.getNumber() + ".";
        }
        return output;
    }

    public Class getStdClass() {
        return this.stdClass;
    }

    public void setStdClass(Class stdClass) {
        this.stdClass = stdClass;
    }
}
