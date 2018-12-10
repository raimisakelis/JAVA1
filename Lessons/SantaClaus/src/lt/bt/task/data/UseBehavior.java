package lt.bt.task.data;

public class UseBehavior {

    private Kid kid;




    public Behavior returnBehavior(Kid kid) {
        this.kid = kid;
        String behavior = kid.getKidsBehavior();
        switch (behavior) {
            case "geras":
                return Behavior.GERAS;
            case "gera":
                return Behavior.GERA;
            case "blogas":
                return Behavior.BLOGAS;
            case "bloga":
                return Behavior.BLOGA;
            default:
                System.out.println("Senelis nesuprato ar vaikas nusipelno dovanu");
                return null;
        }
    }

    public boolean kidsBehaviorEvaluation(Kid kid) {
        Behavior behavior =  returnBehavior(kid);
        boolean good = false;
        if(behavior == Behavior.GERAS || behavior == Behavior.GERA) {
            good = true;
        }
        return good;
    }



}
