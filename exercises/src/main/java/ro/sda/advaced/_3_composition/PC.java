package ro.sda.advaced._3_composition;

public class PC {

    private Case deepCool;
    private Monitor monitor;

    public PC(Case deepCool, Monitor monitor) {
        this.deepCool = deepCool;
        this.monitor = monitor;
    }

    public void powerUp() {
        deepCool.pressPowerButton();
        this.drawLogo();

    }

    public void drawLogo() {
        monitor.drawPixelAt(1200,1500,"Cyan");
    }

}
