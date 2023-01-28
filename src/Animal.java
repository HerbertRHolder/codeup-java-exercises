public class Animal {
    private String type;
    private int legs;

    public Animal(){
        type = "mammal";
        legs = 2;
    }
    public Animal(String AnimalType, int numOfLegs){
        this.type = AnimalType;
        this.legs = numOfLegs;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


}
