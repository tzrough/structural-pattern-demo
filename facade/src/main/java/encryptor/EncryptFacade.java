package encryptor;

public class EncryptFacade {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;

    public EncryptFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.cipherMachine = new CipherMachine();
    }

    public void encrypt(String inputFileName, String outputFileName) {
        String plainText = fileReader.read(inputFileName);
        String encryptedText = cipherMachine.encrypt(plainText);
        fileWriter.write(encryptedText, outputFileName);
    }

}
