
public class Athlete {
	
	static int nextBibNumber;
    static String raceLocation = "Japan";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = Athlete.nextBibNumber;
        Athlete.nextBibNumber++;
    }

    public static void main(String[] args) {
    	Athlete.nextBibNumber = 2984;
    	Athlete a = new Athlete("Jimmy", 10);
    	Athlete b = new Athlete("Billy", 11);
    	Athlete c = new Athlete("Willy", 12);
    	System.out.println(a.name + " " + a.bibNumber + " " + Athlete.raceLocation);
    	System.out.println(b.name + " " + b.bibNumber + " " + Athlete.raceLocation);
    	System.out.println(c.name + " " + c.bibNumber + " " + Athlete.raceLocation);
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
