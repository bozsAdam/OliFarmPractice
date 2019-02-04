package hu.adam.food;

public abstract class Food {
    Integer produceAmount;

    Food(){
        if (this instanceof Almond){
            this.produceAmount = 50;
        } else if(this instanceof Spruce){
            this.produceAmount = 26;
        } else if(this instanceof Juniper){
            this.produceAmount = 14;
        }
    }

    public Integer produce(){
        return produceAmount;
    }

    protected void boostWith(Integer amount){produceAmount += amount;}

    protected void reduceWith(Integer amount){produceAmount -= amount;}

    public void stepOneMonth(){
        Integer BASE_GROWTH_VOLUME = 4;
        boostWith(BASE_GROWTH_VOLUME);}
}
