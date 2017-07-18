package 观察者模式;

/**
 * Created by LZL on 2017/7/17.
 */
public interface Subject {

    public void attach(Observer observer);  //增加观察者

    public void detach(Observer observer);  //删除观察者

    public void notify(String message);     //通知观察者更新消息
}
