package objectadpter;

public class Client {

    public static void main(String[] args) {
        ChineseLaptop chineseLaptop = new ChineseLaptop();
        ChinesePlug chinesePlug = new Chinese2BritishPlugAdapter();
        chineseLaptop.work(chinesePlug);
    }
}
