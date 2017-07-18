package 观察者模式;

/**
 * Created by LZL on 2017/7/17.
 */
public class Student implements Observer {
    /*
    * 具体观察者
    * */
    private String mName;

    public Student(String name)
    {
        mName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(mName+"收到了消息："+message);
    }
}
