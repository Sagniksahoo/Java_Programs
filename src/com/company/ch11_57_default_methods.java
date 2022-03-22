package com.company;
interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void  greet(){
        System.out.println("good morning");
    }
    default void recordVideo4k(){
        greet();
        System.out.println("recording in 4k....");
    }
}
interface Mywifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    public void callNumber(int number){
        System.out.println("calling.."+number);
    }
    public void pickCall(){
        System.out.println("connecting......");
    }
//    void takeSnap(){
//        System.out.println("Taking snap...");
//    }
}
class MySmartPhone extends MyCellPhone implements Mycamera,Mywifi{
    @Override
    public void takeSnap() {
        System.out.println("Taking snap.......");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recoiding video.....");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of network...");
        String[] netWorkList={"Sagnik","Priyaka","Bantu"};
        return netWorkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to network"+network);
    }

//    @Override
//    public void recordVideo4k() {
//        System.out.println("Taking snap and record in 4k");
//    }
}
public class ch11_57_default_methods {
    public static void main(String[] args) {
    MySmartPhone sp=new MySmartPhone();
    sp.recordVideo4k();
        /* sp.greet();//throws an error */
    String[] arr=sp.getNetwork();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
