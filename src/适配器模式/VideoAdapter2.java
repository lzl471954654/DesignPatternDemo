package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class VideoAdapter2 extends HDMILine implements VGAInterface {

    @Override
    public void showWithVGASignal() {
        showWithHDMISignal();
    }
}
