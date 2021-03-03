package classadpter;

/**
 * 适配器角色【中标转英标插座适配器】
 */
public class Chinese2BritishPlugAdapter extends BritishPlug implements ChinesePlug{

    @Override
    public void printProductInformation() {
        System.out.println("这是一个中标插座");
    }

    @Override
    public void chineseWork() {
        super.britishWork();
    }
}
