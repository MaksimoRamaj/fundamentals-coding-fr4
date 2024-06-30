package perseritje;

public class Human {

   public String id;
   public String emri;
   public int mosha;

   public static int popullsia;

    public Human(){}

    public Human(String emri){
       this.emri = emri;
    }

    public Human(String id, String emri, int mosha) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
    }

    public void walk(){
        System.out.println(emri + " eshte duke ecur!");
    }

    public static void sleep(){
        System.out.println( "Personi eshte duke fjetur!");
    }

}
