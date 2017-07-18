package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class Monitor{
    VGAInterface vgaInterface;

    public Monitor(VGAInterface vgaInterface1)
    {
        vgaInterface = vgaInterface1;
    }

    public void setVgaInterface(VGAInterface vgaInterface) {
        this.vgaInterface = vgaInterface;
    }

    public void show()
    {
        vgaInterface.showWithVGASignal();
    }
}
