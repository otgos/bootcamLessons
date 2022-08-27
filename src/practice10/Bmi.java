package practice10;

public class Bmi {
    private double mass;
    private double height;

    public Bmi(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public Bmi() {
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBMI(){
        double myBmi = mass/(height*height);
        if(myBmi<18.5){
            System.out.println("You are underweight");
        }else if(myBmi>=18.5 && myBmi<24.9){
            System.out.println("You have normal weight");
        }else if(myBmi>=25 && myBmi<29.9){
            System.out.println("You are overweight");
        }else{
            System.out.println("You are obese, do something urgently");
        }
    }
}
