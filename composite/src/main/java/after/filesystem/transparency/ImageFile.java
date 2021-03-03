package after.filesystem.transparency;

import java.util.List;

public class ImageFile implements File {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        System.out.println("add not supported");
    }

    @Override
    public void getChildren() {
        System.out.println("getChildren not supported");
    }

    @Override
    public void killVirus() {
        System.out.println(String.format("对图形文件【%s】进行杀毒", name));
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("图形文件【%s】", name));
    }
}
