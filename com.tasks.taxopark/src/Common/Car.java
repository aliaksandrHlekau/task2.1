package Common;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public abstract class Car implements IntPrice  {

    private String name;
    private int price;
    private double fuelCons;
    private int seatNum;

    public String getName() {
        return name;
    }
    public int getPrice(){
        return price;
    }
    public double getFuelCons(){
        return fuelCons;
    }
    public int getSeatNum(){
        return seatNum;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setFuelCons(double fuelCons){
        this.fuelCons = fuelCons;    }

    public void setSeatNum(int seatNum){
        this.seatNum = seatNum;
    }


}