package lesson1;

public class Main {
    public static void main(String[] args) {

        JoggingRoad joggingRoad = new JoggingRoad(100);
        Wall wall = new Wall(10);

        Human human = new Human("Philip J.Fry", 100, 10);

        Robot robot = new Robot("Bender Rodriguez", 150, 5);

        Cat cat = new Cat("John Zoidberg", 50, 15);


        Participant[] participants = {human, robot, cat};
        Obstacle[] obstacles = {joggingRoad, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.start(participant);
            }

        }


    }
}
