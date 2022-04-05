package ex4;

public class Goods {
    int amount = 10;
    public synchronized void produce(int amount){
        while (!produce(); ){
            goods
        }
        this.amount = amount;
        notify();
    }
    public synchronized int consume(){
        notify();
        return amount;
    }
}
