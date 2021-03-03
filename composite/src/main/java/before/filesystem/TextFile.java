package before.filesystem;

public class TextFile implements File{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println(String.format("对文本文件【%s】进行杀毒", name));
    }
}
