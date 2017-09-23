import java.util.ArrayList;
public class LightList{
    private ArrayList<String> colours;
    private int currentColourIndex;
    private int numberOfLights;
    private int currentLightCount;
    private Light currentLight;
 public LightList(int _numberOfLights){
     colours = new ArrayList<String>();
    // default colours 
    colours.add("Red");
    colours.add("Green");
    colours.add("White");
    this.numberOfLights = _numberOfLights;
    this.currentLightCount = 1;
    this.currentLight = new Light();
 }
 public LightList(int _numberOfLights, ArrayList<String> _colours){
     // custom colors
     this.colours = _colours;
     this.numberOfLights = _numberOfLights;
     this.currentLightCount = 1;
 }
 public void addColour(String colour){
     colours.add(colour);
 }
 public String currentLight(){
    return String.format("%d %s Light %s",currentLightCount,colours.get(currentColourIndex), this.currentLight.getState());
 }
 public void next(){
     if(currentColourIndex <  colours.size()-1){
        currentColourIndex++;
     }else{
        currentColourIndex = 0;
     }
     if(currentLightCount == numberOfLights){
         currentLightCount = 1;
         currentColourIndex = 0;
     }else{
        currentLightCount++;
     }
 }
 public Light getCurrentLight(){
    return this.currentLight;
 }
 public void updateLightState(){
    this.currentLight.updateLightState();
 }
}