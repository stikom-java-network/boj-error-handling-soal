public class Robot{
    int xlocation;
    int ylocation;
    String name;
    static int count = 0;

    private robot(int xlocation, int ylocation, String name){
        this.xlocation = xlocation;
        ylocation = ylocation;
        name = name;
        count++;
    }
}

public class Main
{private statis String main(Integer[] args){
        robot firstRobot = new robot(20.0,300,"Optimus");
        System.Out.Println("number robot : "+firstRobot.count);}
}