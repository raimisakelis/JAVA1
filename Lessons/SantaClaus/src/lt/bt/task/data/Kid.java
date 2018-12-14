package lt.bt.task.data;

public class Kid {

    private String kidsName;
    private String kidsLastName;
    private int kidsAges;
    private String kidsAddress;
    private String kidsDesire;
    private String kidsBehavior;


    public String getKidsName() {
        return kidsName;
    }

    public void setKidsName(String kidsName) {
        this.kidsName = kidsName;
    }

    public String getKidsLastName() {
        return kidsLastName;
    }

    public void setKidsLastName(String kidsLastName) {
        this.kidsLastName = kidsLastName;
    }

    public int getKidsAges() {
        return kidsAges;
    }

    public void setKidsAges(int kidsAges) {
        this.kidsAges = kidsAges;
    }

    public String getKidsAddress() {
        return kidsAddress;
    }

    public void setKidsAddress(String kidsAddress) {
        this.kidsAddress = kidsAddress;
    }

    public String getKidsDesire() {
        return kidsDesire;
    }

    public void setKidsDesire(String kidsDesire) {
        this.kidsDesire = kidsDesire;
    }

    public String getKidsBehavior() {
        return kidsBehavior;
    }

    public void setKidsBehavior(String kidsBehavior) {
        this.kidsBehavior = kidsBehavior;
    }


    public Kid(){}

    public Kid(String kidsName, String kidsLastName, String kidsBehavior){
        this.kidsName = kidsName;
        this.kidsLastName = kidsLastName;
        this.kidsBehavior = kidsBehavior;
    }

    public Kid(String kidsName, String kidsLastName, int kidsAges, String kidsAddress, String kidsDesire){
        this.kidsName = kidsName;
        this.kidsLastName = kidsLastName;
        this.kidsAges = kidsAges;
        this.kidsAddress = kidsAddress;
        this.kidsDesire = kidsDesire;
    }




    @Override
    public String toString() {
        return getKidsName() + " " + getKidsLastName() + " " + getKidsAddress() + " " + getKidsDesire();
    }
}
