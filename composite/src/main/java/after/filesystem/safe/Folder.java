package after.filesystem.safe;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {

    private String name;

    private List<File> fileList = new ArrayList<>(8);


    public Folder(String name) {
        this.name = name;
    }

    public void add(File file) {
        fileList.add(file);
    }

    public void getChildren() {
        for (File file : fileList) {
            file.getInfo();
        }
    }

    @Override
    public void killVirus() {
        System.out.println(String.format("对文件夹【%s】进行杀毒", name));

        for (File file : fileList) {
            file.killVirus();
        }
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("文件夹【%s】", name));
    }
}
