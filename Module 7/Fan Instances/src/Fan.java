public class Fan{
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

        public boolean on(){
            if (speedToString() == "STOPPED"){
                return false;
            }
            else{
                return true;
            }
        }

        public void setSpeed(int speedChange){
            this.speed = speedChange;
        }

        public int getSpeed() {
            return speed;
        }

        public void setFanColor(String color){
            this.color = color.toLowerCase();
        }

        public String getFanColor(){
            return color;
        }

        public void setRadius(double number){
            this.radius = number;
        }

        public double getRadius(){
            return radius;
        }

        public String speedToString(){
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


