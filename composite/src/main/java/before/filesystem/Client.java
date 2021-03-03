package before.filesystem;

public class Client {

    public static void main(String[] args) {

        Folder folder1 = new Folder("一级目录");
        Folder folder2 = new Folder("二级目录");

        File textFile = new TextFile("hello.txt");
        File imageFile = new ImageFile("hello.png");

        folder2.addFile(textFile);
        folder2.addFile(imageFile);

        folder1.addFolder(folder2);

        folder1.killVirus();
    }

}
