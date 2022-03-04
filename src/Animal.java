public class Animal {
    String weight;
    String height;

    public Animal(String weight , String height){
        this.weight = weight;
        this.height = height;
    }

    public void showInfo(){
        System.out.println("weight : " + weight);
        System.out.println("Height : " + height);
    }



}
