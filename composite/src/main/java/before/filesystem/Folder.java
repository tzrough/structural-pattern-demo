package before.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<Folder> folderList = new ArrayList<>();
    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public void killVirus() {
        System.out.println(String.format("对文件夹【%s】进行杀毒", name));

        for (Folder folder : folderList) {
            folder.killVirus();
        }

        for (File file : fileList) {
            file.killVirus();
        }
    }
}
