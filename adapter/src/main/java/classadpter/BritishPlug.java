package classadpter;

/**
 * 适配者角色【英标插座】
 */
public class BritishPlug {

    public void printProductInformation(){
        System.out.println("这是一个英标插座");
    }

    public void britishWork() {
        System.out.println("工作电压-230V");
    }
}
