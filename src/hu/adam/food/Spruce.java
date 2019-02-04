package hu.adam.food;

public class Spruce extends EverGreen {
    private boolean rot;
    private Integer random = (int)(Math.random() * 100);

    private void rot(){
        if(random< 5){
            this.rot = true;
            reduceWith(20);
        }
    }

    private void shroom(){
        if(random < 4){
            boostWith(15);
        }
    }

    @Override
    public void stepOneMonth() {
        this.rot = false;
        shroom();
        rot();
        if(!rot){
            super.stepOneMonth();
        }
    }

    @Override
    public Integer produce() {
        if(!rot){
            return super.produce();
        } else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Spruce{" +
                "rot=" + rot +
                ", produceAmount=" + produceAmount +
                '}';
    }
}
