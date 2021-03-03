package after.filesystem.safe;

public class TextFile implements File {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println(String.format("对文本文件【%s】进行杀毒", name));
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("文本文件【%s】", name));
    }
}
