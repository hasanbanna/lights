import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class PrintLightTask extends TimerTask {
    private LightList lights;
    private DateFormat dateFormat;
    private Date date;
    public PrintLightTask(LightList _lights){
      this.lights = _lights;
      this.dateFormat = new SimpleDateFormat("HH:mm:ss");
    }
    public void run() {
      date = new Date();
      System.out.println(dateFormat.format(date) + " " +lights.currentLight());
      if(lights.getCurrentLight().getState() == "Off"){
        lights.next();
      }
      lights.updateLightState();
    }
  }
  