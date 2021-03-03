package after.filesystem.transparency;

/**
 * 抽象构件【文件接口】
 */
public interface File {

    void add(File file);

    void getChildren();

    void killVirus();

    void getInfo();
}
