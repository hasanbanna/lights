import java.util.Timer;
import java.util.TimerTask;
public class Main{
    public static void main(String[] args) {
        int numOfLights = 0;
        if(args.length == 1){
             numOfLights = Integer.parseInt(args[0]);
        }else{
            numOfLights = 20; // default
        }
        LightList lights = new LightList(numOfLights);
        // add new colours
        // lights.addColour("Blue"); 
        Timer timer = new Timer();
        TimerTask tn = new PrintLightTask(lights);
        timer.scheduleAtFixedRate(tn,0,1000);
    }
}
