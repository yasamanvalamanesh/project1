class Instrument {
    static void style (){
        System.out.println("Any Instrument has a different style");
    }
}
class Piano extends Instrument {
    static void type(){
        System.out.println("Piano is a keyboard");
    }
}
public class Main {
    public static void main(String [] args){
        Piano myInstrument = new Piano();
        myInstrument.type();
    }
}