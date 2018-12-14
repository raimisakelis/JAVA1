package lt.bt.task.data;

import java.util.HashMap;
import java.util.Map;

public class ToyListsWrapper {

    private Map<String,Integer> orderToysList = new HashMap<>();
    private Map<String,Integer> wasteToysList = new HashMap<>();


    public Map<String, Integer> getOrderToysList() {
        return orderToysList;
    }

    public void setOrderToysList(Map<String, Integer> orderToysList) {
        this.orderToysList = orderToysList;
    }

    public Map<String, Integer> getWasteToysList() {
        return wasteToysList;
    }

    public void setWasteToysList(Map<String, Integer> wasteToysList) {
        this.wasteToysList = wasteToysList;
    }
}
