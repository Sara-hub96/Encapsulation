import java.util.Arrays;
import java.util.List;

public class House {
    private int floorNumbers;
    private String address;
    private List<String> residentsNames;


    public int getFloorNumbers() {
        return floorNumbers;
    }
    public void setFloorNumbers(int floorNumbers){
        this.floorNumbers = floorNumbers;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public List<String> getResidentsNames() {
        return residentsNames;
    }
    public void setResidentsNames(String residents) {
        this.residentsNames = Arrays.asList(residents.split(","));
    }
}

