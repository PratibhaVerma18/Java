interface Features{
    void dialing();
    void messaging();
}
interface Addonss{
    void vcalling();
    void mms();
}
class FeaturesPhone implements Features{
    public void dialing(){
        System.out.println("FeaturePhone is dialing..");
    }
    public void messaging(){
        System.out.println("FeaturesPhone is messaging");
    }
}
class SmartPhone implements Features, Addonss{
    public void dialing(){
        System.out.println("smartPhone is dialing..");
    }
    public void messaging(){
        System.out.println("smartPhone is messaging");
    } 
    public void vcalling(){
        System.out.println("smartPhone is vedio calling");
    }
    public void mms(){
        System.out.println("smartPhone is sending mms");
    }
}
class Mobile{
    public static void main(String args[]){
        FeaturesPhone fp=new FeaturesPhone();
        SmartPhone sp= new SmartPhone();
        fp.dialing();
        fp.messaging();
        sp.dialing();
        sp.messaging();
        sp.vcalling();
        sp.mms();
    }
}