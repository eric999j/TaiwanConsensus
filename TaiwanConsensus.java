/*
編譯器：
https://chrome.google.com/webstore/detail/gitpod-always-ready-to-co/dodmmooeoklaejobgleioelladacbeki/related?hl=en
*/
public class TaiwanConsensus{ private String _subject; private String _oppose; private String _motto;

private String getWill(){
    return _oppose;
}
private String getAlways(){
    return _subject;
}
private String getBelieve(){
    return _motto;
}    
private void output(){
    System.out.print(String.format("Taiwan absolutely will not accept %s.\n\r"+
           "%s resolutely oppose %s.\n\r"+
           "This is the %s.",getWill(),getAlways(), getWill(),getBelieve()));
}

private static class ConsensusBuilder{
    private String _subject;
    private String _oppose;
    private String _motto;
    public ConsensusBuilder(String subject,String oppose,String motto){
        this._subject=subject;
        this._oppose=oppose;
        this._motto=motto;
    }
    private TaiwanConsensus build(){
        return new TaiwanConsensus(this);
    }
}
private TaiwanConsensus(ConsensusBuilder builder){
        this._subject=builder._subject;
        this._oppose=builder._oppose;
        this._motto=builder._motto;
}
public static void main (String[] args) throws java.lang.Exception
{
    TaiwanConsensus taiwan = new TaiwanConsensus.ConsensusBuilder(
    "The vast majority of Taiwanese"
    ,"one country, two systems"
    ,"Taiwan consensus").build();
    taiwan.output();

}
} 