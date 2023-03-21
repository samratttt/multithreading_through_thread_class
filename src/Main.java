// importing thread class

import java.lang.Thread;

class One extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("ping pong!");
            try {
                // put thread into sleep : ms
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class Two extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("ding dong!");

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }}
}

// calling through Main class
public class Main {
    public static void main(String[] args) {
        One obj1 = new One();
        // invoke with start() to achieve multithreading
        obj1.start();
        Two obj2 = new Two();
        obj2.start();
    }
}