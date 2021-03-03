package encryptor;

public class Client {

    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.encrypt("hello", "hi");
    }

}
