package 适配器模式;

/**
 * Created by LZL on 2017/7/18.
 */
public class Run {
    public static void main(String[] args) {
        VGALine vgaLine = new VGALine();
        Monitor monitor = new Monitor(vgaLine);
        //monitor.show();

        /*HDMILine hdmiLine = new HDMILine();
        VideoAdapter videoAdapter = new VideoAdapter(hdmiLine);
        monitor.setVgaInterface(videoAdapter);
        monitor.show();*/

        VideoAdapter2 adapter2 = new VideoAdapter2();
        monitor.setVgaInterface(adapter2);
        monitor.show();
    }
}
