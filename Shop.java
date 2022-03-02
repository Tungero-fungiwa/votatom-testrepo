public class Shop{
    private Float price_click;
    private Float price_auto;
    public Shop(){
        this.price_auto=1500f;
        this.price_click=50f;
    }
    public void buy_click(Click click){
        click.upgrade_click();
        this.price_click+=5f;
    }
    public void buy_auto(Auto auto){
        auto.upgrade();
        this.price_auto+=500f;
    }

    public Float return_auto(){
        return this.price_auto;
    }
    public Float return_click(){
        return this.price_click;
    }
    @Override
    public String toString(){
        return "SHOP: "+"\n\t Auto: "+this.price_auto+"\n\t Click: "+this.price_click;
    }
    
}