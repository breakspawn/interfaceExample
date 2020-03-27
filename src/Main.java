import com.interfaceExample.*;


public class Main {

    public static void main(String[] args){
        AbstractFabricWriters fabric = new AbstractFabricWriters();
        for (int i = 0; i < 20; i++) {
            fabric.GetWriter().out("ВВВЫЫЫЫВВООООДД");
        }
    }
}

