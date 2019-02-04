package hu.adam.food;

public class Almond extends Food{

    private boolean rot;
    private Integer random = (int)(Math.random() * 100);

    private void rot(){
        if(random< 13){
            this.rot = true;
            reduceWith(18);
        }
    }

    private void shroom(){
        if(random < 8){
            boostWith(10);
        }
    }

    @Override
    public void stepOneMonth() {
        this.rot = false;
        shroom();
        rot();
        if(produceAmount < 40){
            produceAmount *= 2;
        }
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
        return "Almond{" +
                "rot=" + rot +
                ", produceAmount=" + produceAmount +
                '}';
    }
}
