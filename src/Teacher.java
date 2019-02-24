import java.util.Arrays;

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
            output = output + " I teach No Class";
        } else {
            String classNum = "Class ";
            for (Class klass: this.classes) {
                   classNum += klass.getNumber() + ",";
            }
            classNum.substring(0, classNum.length() - 1);
            output = output + "I teach " + classNum;
        }
        return output;
    }
}
