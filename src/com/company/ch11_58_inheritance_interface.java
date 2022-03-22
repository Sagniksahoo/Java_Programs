package com.company;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
class sampleClass1 extends mySampleClass{
    public int x;
    sampleClass1(int x){
        this.x=x;
    }
    @Override
    public void meth2() {
        System.out.println("hi i am sagnik sahooo");
    }
    public int hello(){
    return (x+x);
    }

}
public class ch11_58_inheritance_interface {
    public static void main(String[] args) {
    mySampleClass sp=new mySampleClass();
    sp.meth1();
    sp.meth2();
    sp.meth3();
    sp.meth4();

    sampleClass1 ss=new sampleClass1(3);
    ss.meth2();
        System.out.println(ss.hello());
    }
}
