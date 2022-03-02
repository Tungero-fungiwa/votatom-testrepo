import java.text.DecimalFormat;
import java.math.*;

public class Click{
    private Float value;
     public Click(){
         this.value=1f;
     }
     public void upgrade_click(){
         this.value+=this.value*1.5f;
         
     }
     public Float one_click(){
         return this.value;
     }
     @Override
    public String toString(){
        return "Click (owned): "+this.value;
    }
}