package lesson1;

public class JoggingRoad implements Obstacle {

    private int joggingRoadLenght;

    public JoggingRoad(int joggingRoadLenght) {
        this.joggingRoadLenght = joggingRoadLenght;
    }


    @Override
    public void start(Participant participant) {
        if (joggingRoadLenght <= participant.getLimitRun()) {
            System.out.println(participant.getParticipantName() + ": пробежал дистанцию");
        } else {
            System.out.println(participant.getParticipantName() + ": не смог пробежать дистанцию");
        }
    }
}
