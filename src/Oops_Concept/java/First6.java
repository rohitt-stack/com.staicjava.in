package Oops_Concept.java;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void ConnectToNetwork(String network);
}
class MyCellPhone{
 void CallNumber(int PhoneNumber){
     System.out.println("Calling.....:" +PhoneNumber);
 }
 void PickCall(){

     System.out.println("Connecting......");
 }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
   public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting networks...List of networks...");
        String[] networksLst ={"Rohit","Aman","Anu"};
        return networksLst;
    }
    public void ConnectToNetwork(String network){
       System.out.println("Connecting......To" +network);
    }
}
public class First6 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        String[] arr =ms.getNetworks();
        for(String item:arr){
            System.out.println(item);
        }
    }
}
