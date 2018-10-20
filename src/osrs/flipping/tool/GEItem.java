package osrs.flipping.tool;

import lombok.Data;

class GEItem {
    private String name;
    private int id;
    private int buyAvg;
    private int sellAvg;
    private int storePrice;
    private boolean members;
    
    GEItem(String name, int id, int buyAvg, int sellAvg, int storePrice, boolean members) {
        this.name = name;
        this.id = id;
        this.buyAvg = buyAvg;
        this.sellAvg = sellAvg;
        this.storePrice = storePrice;
        this.members=members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyAvg() {
        return buyAvg;
    }

    public void setBuyAvg(int buyAvg) {
        this.buyAvg = buyAvg;
    }

    public int getSellAvg() {
        return sellAvg;
    }

    public void setSellAvg(int sellAvg) {
        this.sellAvg = sellAvg;
    }

    public int getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(int storePrice) {
        this.storePrice = storePrice;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    int getProfitGP(){
        return sellAvg-buyAvg;
    }
    
    int getProfitPercent(){
        double buy=buyAvg,sell=sellAvg;
        return (int)(((sell-buy)/buy)*100);
    }
    
}
