public class Printer {

    private Integer sheets;
    private Integer tonerVolume;

    public Printer(Integer sheets, Integer tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public Integer getNumberOfSheets(){
        return this.sheets;
    }

    public Integer getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(Integer numberOfPages, Integer numberOfCopies){
        if(this.sheets > 0 && this.tonerVolume > 0) {
            this.sheets -= (numberOfPages * numberOfCopies);
            this.tonerVolume -= (numberOfPages * numberOfCopies);
        }
    }
}
