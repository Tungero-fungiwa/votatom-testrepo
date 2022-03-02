public class Player {
    private Click click;
    private Auto auto;
    private Shop shop;
    private Float money;
    public Player(){
        this.click=new Click();
        this.auto=new Auto();
        this.shop=new Shop();
        this.money=0f;
    }
    public void buying_auto(){
        if(this.shop.return_auto()<=this.money){
            this.money-=this.shop.return_auto();
            this.shop.buy_auto(this.auto);
        }
        
    }
    public void buying_click(){
        if(this.shop.return_click()<=this.money){
            this.money-=this.shop.return_click();
            this.shop.buy_click(this.click);
        }
        
    }
    public void clicking(){
        this.money+=this.click.one_click();
    }
    public void auto(){
        this.money+=this.auto.one_second();
    }
    public Float get_auto(){
        return this.auto.one_second();
    }
    public String string_shop(){
        return this.shop.toString();
    }
    public String string_click(){
        return "Click (owned) "+this.click.one_click();
    }
    public String string_auto(){
        return this.auto.toString();
    }
    @Override
    public String toString(){
        return "Money: "+money;
    }
}