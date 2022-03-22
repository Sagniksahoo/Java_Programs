package com.company;
//interface camera2{
//    void snap();
//    void recordVideo();
//    private void greet(){
//        System.out.println("Good morning");
//    }
//    default void recordVideo4k(){
//        greet();
//        System.out.println("Recording in 4k....");
//    }
//
//}
//interface wifi2{
//    String[] getNetwork();
//    void connectToNetwork(String network);
//}
//class cellphone1{
//    public void receiveCall(){
//        System.out.println("reciving call.......");
//    }
//    public void callNUmber(int number){
//        System.out.println("calling........."+number);
//    }
//}
//class smartPhone extends cellphone1 implements wifi2,camera2{
//    @Override
//    public void snap() {
//        System.out.println("taking snap..........");
//    }
//
//    @Override
//    public void recordVideo() {
//        System.out.println("recording in video");
//    }
//    public String[] getNetwork(){
//        System.out.println("connect to the network");
//        String[] networkList={"sagnik","priyana","bantu"};
//        return networkList;
//    }
//
//    @Override
//    public void connectToNetwork(String network) {
//        System.out.println("connecting to the network"+network);
//    }
//}
interface camera2{
    void snap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello sagnik");
    }
    default void recoidIn4k(){
        System.out.println("Recording in 4k......");
    }
}
interface wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class cellphone1{
    public void ringing(){
        System.out.println("Ringing..........");
    }
    public void callNumber(int number){
        System.out.println("calling the number"+ number);
    }
}
class smartPhone1 extends cellphone1 implements wifi2,camera2{
    @Override
    public void snap() {
        System.out.println("taking a snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording a video");
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connting to the network"+network);
    }

    @Override
    public String[] getNetwork() {
        System.out.println("connect to the network");
        String[] networkList={"sagnik","priyana","bantu"};
        return networkList;
    }
}
public class ch11_59_polymorphism {
    public static void main(String[] args) {
//       camera2 cam=new smartPhone();//this is a smartphone but use it as a camera
////       cam.getNetwork(); //--> not allowed
//       cam.recordVideo();
        camera2 cam=new smartPhone1();
        cam.recordVideo();
        cam.recoidIn4k();
        cam.snap();
        wifi2 wi=new smartPhone1();
        wi.connectToNetwork("hello sagnik");
        wi.getNetwork();
    }
}
