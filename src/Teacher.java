import java.util.Arrays;

public class Teacher extends Person {
    private int[] classes;

    public Teacher(String id, String name, int age, int[] classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public int[] getClasses() {
        return this.classes;
    }

    public void setClasses(int[] classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String output = super.introduce() + "I am a Teacher.";
        if (this.classes.length == 0) {
            output = output + " I teach No Class";
        } else {
            String classes = Arrays.toString(this.classes);
            output = output + "I teach Class" + classes.substring(1,classes.length()-1);
        }
        return output;
    }
}
