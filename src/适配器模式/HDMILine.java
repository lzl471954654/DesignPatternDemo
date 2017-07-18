package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class HDMILine implements HDMIIntertface {

    @Override
    public void showWithHDMISignal() {
        System.out.println("使用HDMI信号输出");
    }
}
