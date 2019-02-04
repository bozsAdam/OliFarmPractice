package hu.adam.food;

public abstract class EverGreen extends Food{
    private Integer monthCount = 0;

    private void growLeaf(){
        if(monthCount == 5){
            boostWith(5);
            monthCount = 0;
        } else{
            monthCount++;
        }
    }

    private void speak(){
        System.out.println(this + " at full production!");
    }

    @Override
    public void boostWith(Integer amount) {
        if(produceAmount + amount > 70){
            produceAmount = 70;
        } else{
            produceAmount += amount;
        }
    }

    @Override
    public void stepOneMonth(){
        if(produceAmount == 70){
            speak();
        } else{
            growLeaf();
            super.stepOneMonth();
        }
    }
}
