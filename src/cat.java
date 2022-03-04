public class cat extends Animal {
    String color;

    public cat(String weight , String height , String color){
        super(weight,height);
        this.color = color;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Color : " + color);
    }
}
