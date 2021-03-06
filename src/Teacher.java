public class Teacher extends Person {
    private Class[] classes;

    public Teacher(String id, String name, int age, Class[] classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Class[] getClasses() {
        return this.classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String output = super.introduce() + "I am a Teacher.";
        if (this.classes.length == 0) {
            output = output + " I teach No Class.";
        } else {
            String classNum = "Class ";
            for (Class klass : this.classes) {
                classNum += klass.getNumber() + ",";
            }

            output = output + "I teach " + classNum.substring(0, classNum.length() - 1) + ".";
        }
        return output;
    }

    public boolean isTeaching(Student std) {
        for (Class klass : this.classes) {
            if (klass.isIn(std)) {
                return true;
            }
        }
        return false;
    }

    public void welcomeStudent(Student std) {
        if (this.isTeaching(std)) {
            System.out.println("I am " + this.name + ". I know " + std.getName() + " has joined Class " + std.getStdClass().getNumber() + ".");
        }
    }

    public void welcomLeader(Student std) {
        if (this.isTeaching(std)) {
            System.out.println("I am " + this.name + ". I know " + std.getName() + " become Leader of Class " + std.getStdClass().getNumber() + ".");
        }
    }
}
