import flightControl.ui.*;
import flightControl.logic.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextUI ui = new TextUI(new FlightControl(), new Scanner(System.in));
        ui.start();        
    }
    
}
