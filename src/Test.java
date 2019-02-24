public class Test {
    public static void main(String[] args) {
        Class c1 = new Class(1);
        Class c2 = new Class(2);
        Class c3 = new Class(3);
        Class c4 = new Class(4);

        Student s1 = new Student("123", "jack", 16);
        Student s2 = new Student("234", "jerry", 17);
        Student s3 = new Student("384", "ann", 16);
        Student s4 = new Student("598", "ben", 17);
        Student s5 = new Student("098", "carol", 16);
        Student s6 = new Student("273", "lily", 17);

        Class[] cl1 = {c1, c2};
        Class[] cl2 = {c3, c4};
        Class[] noClass = {};

        Teacher t1 = new Teacher("389", "cris", 30, cl1);
        Teacher t2 = new Teacher("726", "lee", 29, cl2);
        Teacher t3 = new Teacher("193", "sue", 37, noClass);

        c1.setTeacher(t1);
        c2.setTeacher(t1);
        c3.setTeacher(t2);
        c4.setTeacher(t2);


        c1.appendMember(s1);
        c1.assignLeader(s1);
        c1.assignLeader(s2);
        c2.appendMember(s3);
        c3.appendMember(s4);
        c3.assignLeader(s4);

        System.out.println(s1.introduce());
        System.out.println(t1.introduce());
        System.out.println(t3.introduce());
    }
}
