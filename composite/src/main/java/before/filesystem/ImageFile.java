package before.filesystem;

public class ImageFile implements File{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println(String.format("对图形文件【%s】进行杀毒", name));
    }
}
