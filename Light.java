public class Light{
    private String state;
    public Light(){
        this.state = "On";
    }
    public void setState(String currentState){
        this.state = currentState;
    }
    public String getState(){
        return this.state;
    }
    public void updateLightState(){
        if(this.getState() == "On"){
            this.setState("Off");
        }else if(this.getState() == "Off"){
            this.setState("On");
        }
     }
}