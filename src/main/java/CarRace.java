import java.util.ArrayList;
import domain.*;
import inOut.*;

/**
 * CarRace
 */
public class CarRace {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private String[] names;
    private int trys;
    private Output out;
    private Input in;

    public void start(){
        //scan
        in = new Input();
        trys = in.getTrys();
        names = in.getNames();
        //create cars and control
        for(int i=0; i<names.length; i++){
            addCar(names[i]);
        }
        
        System.out.println("\n실행결과");
        //execute
        for(int i = 0; i<trys; i++){
            runCar();
            //print result
            out = new Output(cars);
        }
        //print total result
        out = new TotalOutput(cars);
    }

    public void addCar(String name){
        cars.add(new Car(name));
    }
    public void runCar(){
        for (Car each : cars){
            each.run();
        }
    }
}