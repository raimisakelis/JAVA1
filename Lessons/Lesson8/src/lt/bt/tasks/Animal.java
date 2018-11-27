package lt.bt.tasks;

public class Animal {

   private String sound;
   private String name;

   public Animal (String name) {
       this.name = name;
   }



    public String getSound() { return sound; }

    public String getName() { return name; }

    public void setSound(String sound) { this.sound = sound; }

    public void print(){ System.out.println("Gyvunas " + name);}


    //@Override
    //public String toString(){ return sound;  }


}
