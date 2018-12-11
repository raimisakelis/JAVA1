package lt.bt.task.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToysWrapper {


    private List<Toy> neededToy;
    private Map<String,Integer> toyList;
    private Toy neededCarbon;


    public List<Toy> getNeededToy() {
        return neededToy;
    }

    public void setNeededToy(List<Toy> neededToy) {
        this.neededToy = neededToy;
    }


    public Toy getNeededCarbon() {
        return neededCarbon;
    }

    public void setNeededCarbon(Toy neededCarbon) {
        this.neededCarbon = neededCarbon;
    }


    public Map<String, Integer> getToyList() {
        return toyList;
    }

    public void setToyList(Map<String, Integer> toyList) {
        this.toyList = toyList;
    }
}

