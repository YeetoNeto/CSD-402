/*
Noah McCarthy Module Assignment 6.2
Make a class in Java and test it
*/


public class App {
    public static class Fan{
        //constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        //private or mutable variables
        private int speed;
        private double radius;
        private String color;

        public Fan(){
            speed = STOPPED;
            radius = 6;
            color = "white";
        }

        public Fan(int speed, double radius, String color){
            this.speed = speed;
            this.radius = radius;
            this.color = color.toLowerCase();
        }

        private boolean on(){
            if (speedToString() == "STOPPED"){
                return false;
            }
            else{
                return true;
            }
        }

        public void setSpeed(int speedChange){
            speed = speedChange;
        }

        public int getSpeed() {
            return speed;
        }

        public void setFanColor(String color){
            color = color.toLowerCase();
        }

        public String getFanColor(){
            return color;
        }

        public void setRadius(double number){
            radius = number;
        }

        public double getRadius(){
            return radius;
        }

        private String speedToString(){
            switch (speed) {
                case SLOW:
                    return "SLOW";
                case MEDIUM:
                    return "MEDIUM";
                case FAST:
                    return "FAST";
                default:
                    return "STOPPED";
            }
        }

        public String toString(){
            if (on()){
                return "The fan is ON\nThe Speed is set to " + speedToString()
                + "\nThe fan has a radius of " + radius + "\nThe fan has a color of " + color;
            }     
            else{
                return "The fan is OFF\nThe Speed is set to " + speedToString()
                + "\nThe fan has a radius of " + radius + "\nThe fan has a color of " + color;
            }       
        }
    }

    public static void main(String[] args) throws Exception {
        //Test No argument Fan
        Fan Fan1 = new Fan();
        System.out.println("Default Fan:");
        System.out.println(Fan1);

        //Test Fan getters
        System.out.println("Testing Fan getters:");
        System.out.println("Speed: " + Fan1.getSpeed());
        System.out.println("Radius: " + Fan1.getRadius());
        System.out.println("FanColor: " + Fan1.getFanColor());

        //Test Argument Fan
        Fan Fan2 = new Fan(1, 9, "Red");
        System.out.println("Custom Fan:");
        System.out.println(Fan2);
 
        //Test Modified Fan
        Fan2.setSpeed(Fan.MEDIUM);
        Fan2.setFanColor("red and black");
        Fan2.setRadius(5.6);
        System.out.println("Modified Custom Fan:");
        System.out.println(Fan2);

    }

}
