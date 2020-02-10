public class WaterBottle {
    private Integer volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public Integer getVolume(){
        return this.volume;
    }

    public void drunkFrom(){
        if(this.volume > 0) {
            this.volume -= 10;
        }
    }

    public void emptied(){
        this.volume = 0;
    }

    public void filled(){
        this.volume = 100;
    }
}
