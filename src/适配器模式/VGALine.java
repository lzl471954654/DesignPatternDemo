package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class VGALine implements VGAInterface {

    @Override
    public void showWithVGASignal() {
        System.out.println("使用VGA信号输出");
    }
}
