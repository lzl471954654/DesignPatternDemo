package 观察者模式;

/**
 * Created by LZL on 2017/7/17.
 */
public class Run {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student("小芳");
        Student student1= new Student("Allen");
        Student student2= new Student("Jack");

        teacher.attach(student);
        teacher.attach(student1);
        teacher.attach(student2);
        teacher.notify("明天不上晚自习");
        System.out.println("");

        teacher.detach(student);
        teacher.notify("今天的早上第一节课上语文");
    }
}
