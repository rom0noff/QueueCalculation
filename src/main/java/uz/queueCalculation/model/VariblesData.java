package uz.queueCalculation.model;

public class VariblesData {

    private int count = 0;


    public VariblesData(){

    }

    public VariblesData(int count) {
        this.count = count;
    }


    public int getCountr() {
        for (int i = 1; i <= 1; i++) {
            count += i;
        }
        return count;
    }

    public void setCount(int number) {
        this.count = number;
    }
}
