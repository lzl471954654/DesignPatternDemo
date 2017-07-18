package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class VideoAdapter implements VGAInterface {
    HDMIIntertface hdmiIntertface;

    public VideoAdapter(HDMIIntertface hdmiIntertface)
    {
        this.hdmiIntertface = hdmiIntertface;
    }

    @Override
    public void showWithVGASignal() {
        hdmiIntertface.showWithHDMISignal();
    }
}
