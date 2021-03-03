package encryptor;

public class FileReader {

    public String read(String fileName) {
        System.out.println(String.format("读取文件【%s】", fileName));
        return "plainText";
    }
}
