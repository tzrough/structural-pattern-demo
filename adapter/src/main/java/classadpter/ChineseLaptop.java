package classadpter;

public class ChineseLaptop {

    void work(ChinesePlug chinesePlug) {
        System.out.println("中国笔记本准备连接电源");
        chinesePlug.printProductInformation();
        chinesePlug.chineseWork();
    }
}
