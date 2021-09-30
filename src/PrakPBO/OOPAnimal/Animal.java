package PrakPBO.OOPAnimal;

public abstract class Animal implements Konstanta {

    String name, food;
    int age, alive;
    String gender;

    public Animal(){
        
    }
    public abstract String printSound();

    public boolean isAlive() {
        if (this.alive == ALIVE) {
            return true;
        } else {
            return false;
        }
    }
    public String printData(){
        return "Nama : "+this.name +", Umur : "+this.age + ", Makanan : "+this.food+", Gender : "+this.gender + ", Hidup : "+isAlive();
    }
}
