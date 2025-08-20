package homework;

public abstract class Bird { //추상클래스
    private String name;
    
    protected String getName(){
        return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public abstract void sing();
    public abstract void fly();
    public abstract void showName();

}
