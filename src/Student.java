public class Student extends Person {
    private Class stdClass;

    public Student(String id, String name, int age, Class stdClass) {
        super(id, name, age);
        this.stdClass = stdClass;
    }

    @Override
    public String introduce() {
        return super.introduce() + "I am a Student. I am at Class " + this.stdClass.getNumber() + ".";
    }

    public Class getStdClass() {
        return this.stdClass;
    }

    public void setStdClass(Class stdClass) {
        this.stdClass = stdClass;
    }
}
