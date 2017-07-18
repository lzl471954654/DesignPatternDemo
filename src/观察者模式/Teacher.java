package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LZL on 2017/7/17.
 */
public class Teacher implements Subject{
    /*
    * 具体被观察者
    * */
    List<Observer> studentList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if(observer!=null)
            studentList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if(observer!=null)
            studentList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : studentList) {
            observer.update(message);
        }
    }
}
