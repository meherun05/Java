public class Bicycle{
    //  implementation
        int candence = 0;
        int speed = 0;
        int gear = 1;

        void changeCandence(int newValue) {
            candence = newValue;
        }

        void changeSpeed(int newValue) {
            speed = newValue;
        }

        void changeGear(int newValue) {
            gear = newValue;
        }

        void speedUp(int increment) {
            speed = speed + increment;
        }

        void applyBreak(int decrement) {
            speed = speed - decrement;
        }
        void printStatus(){
            System.out.println("candence" + candence+"speed"+speed+"gear"+gear);
        }
}
