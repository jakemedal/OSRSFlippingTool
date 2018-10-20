package osrs.flipping.tool;

//GE item class stores information and some basic functions for items from the osbuddy exchange

public class GEItem {
    private String name;
    private int id,buyAvg,sellAvg,storePrice;
    private boolean members;
    
    public GEItem(String name, int id, int buyAvg, int sellAvg,int storePrice,boolean members){
        this.name = name;
        this.id = id;
        this.buyAvg = buyAvg;
        this.sellAvg = sellAvg;
        this.storePrice = storePrice;
        this.members=members;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMembers(){
        return members;
    }
    
    public int getId(){
        return id;
    }
    
    public int getBuyAvg(){
        return buyAvg;
    }
    
    public int getSellAvg(){
        return sellAvg;
    }
    
    public int getStorePrice(){
        return storePrice;
    }
    
    public int getProfitGP(){
        return sellAvg-buyAvg;
    }
    
    public int getProfitPercent(){
        double buy=buyAvg,sell=sellAvg;
        return (int)(((sell-buy)/buy)*100);
    }
    
    //getGEGraphData(){} ?
}
