/*
Noah McCarthy Module Assignment 7.2
Make a class that displays information from the Fan Class
*/

public class App {

    public static class UseFans{

        public String displayFan(Fan object){
            //Use string builder to append all text to a string to make a nice return string for output
            StringBuilder sb = new StringBuilder();
            if (object.on()){
                sb.append("Fan state: On\n");
            }
            else
            {
                sb.append("Fan state: Off\n");
            }
             sb.append("Fan speed: ").append(object.speedToString()).append("\n");
             sb.append("Fan radius: ").append(object.getRadius()).append("\n");
             sb.append("Fan color: ").append(object.getFanColor()).append("\n");
             return sb.toString();
        }

        public String displayMultipleFans(Fan[] object){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < object.length; i++){
                sb.append("Fan ").append(i+1).append("\n").append(displayFan(object[i]));
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) throws Exception {
        Fan[] fans = new Fan[2];
        UseFans display = new UseFans();
        //Test No argument Fan
        fans[0] = new Fan();
        System.out.println(display.displayFan(fans[0]));

        //Test Fan getters
        System.out.println("Testing Fan getters:");
        System.out.println("Speed: " + fans[0].getSpeed());
        System.out.println("Radius: " + fans[0].getRadius());
        System.out.println("FanColor: " + fans[0].getFanColor());

        //Test Argument Fan
        fans[1] = new Fan(1, 9, "Red");
        System.out.println(display.displayFan(fans[1]));
 
        //Test Modified Fan
        fans[1].setSpeed(Fan.MEDIUM);
        fans[1].setFanColor("red and black");
        fans[1].setRadius(5.6);
        System.out.println("----Modified Custom Fan---");
        System.out.println(display.displayFan(fans[1]));

        //List multiple Fans
         System.out.println("---Displaying Multiple Fans---");
        System.out.println(display.displayMultipleFans(fans));
    }

}
