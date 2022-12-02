package day26_Constructors_Continue_Statics.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant1 {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Servers> server ;
    public ArrayList<Chefs> chiefs;


    public Restaurant1(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        server = new ArrayList<>();
        chiefs = new ArrayList<>();
    }

    public void hireServer(Servers server){
        this.server.add(server);
    }
    public void hireServer(Servers[] server){
        this.server.addAll(Arrays.asList(server));
    }

    public void hireChief(Chefs chief){
        this.chiefs.add(chief);
    }
    public void hireChief(Chefs [] chief){
        this.chiefs.addAll(Arrays.asList(chief));
    }
    public void terminateServer(int id){
       server.removeIf(p-> p.employeeID == id);
    }

    public void terminateCheif(int id){
        chiefs.removeIf(p-> p.employeeID == id);
    }

    public String toString() {
        return "Restaurant1{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", server=" + server.size() +
                ", chiefs=" + chiefs.size() +
                '}';
    }
}
