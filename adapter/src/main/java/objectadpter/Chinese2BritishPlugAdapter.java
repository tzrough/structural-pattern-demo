package objectadpter;

/**
 * 适配器角色【中标转英标插座适配器】
 */
public class Chinese2BritishPlugAdapter extends ChinesePlug{

    private BritishPlug britishPlug;

    public Chinese2BritishPlugAdapter() {
        this.britishPlug = new BritishPlug();
    }

    @Override
    public void chineseWork() {
        britishPlug.britishWork();
    }
}
