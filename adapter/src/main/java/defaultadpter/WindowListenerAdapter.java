package defaultadpter;

/**
 * 默认适配器类【窗口监听器适配器】
 * 提供接口默认实现，其子类只需重写需要覆盖的方法
 */
public abstract class WindowListenerAdapter implements WindowListener{

    @Override
    public void windowOpened() {
        System.out.println("default window opened");
    }

    @Override
    public void windowClosed() {
        System.out.println("default window closed");
    }

    @Override
    public void windowActivited() {
        System.out.println("default window activated");
    }

    @Override
    public void windowDeactivated() {
        System.out.println("default window deactivated");
    }
}
