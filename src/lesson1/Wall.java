package lesson1;

public class Wall implements Obstacle {

    private int wallHigh;

    public Wall(int wallHigh) {

        this.wallHigh = wallHigh;
    }


    @Override
    public void start(Participant participant) {
        if (wallHigh <= participant.getLimitJump()){
            System.out.println(participant.getParticipantName() + ": перепрыгнул стену");
            System.out.println();
        } else {
            System.out.println(participant.getParticipantName() + ": не смог перепрыгнуть стену");
            System.out.println();
        }
    }
}
