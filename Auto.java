public class Auto {
    private Float value;
    public Auto(){
        this.value=0f;
    }
    public void upgrade(){
        if(this.value==0){
            this.value+=0.5f;
        }
        else {
            this.value+=this.value*0.1f;
        }
    }
    public Float one_second(){
        return this.value;
    }
    @Override
    public String toString(){
        return "Auto (owned) "+this.value;
    }
}