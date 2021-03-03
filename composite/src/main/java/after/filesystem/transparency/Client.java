package after.filesystem.transparency;


public class Client {

    public static void main(String[] args) {
        File folder1 = new Folder("一级目录");
        File folder2 = new Folder("二级目录");

        File textFile = new TextFile("hello.txt");
        File imageFile = new ImageFile("hello.png");

        folder2.add(textFile);
        folder2.add(imageFile);

        folder1.add(folder2);

        folder1.getChildren();
        folder1.killVirus();
    }


}
