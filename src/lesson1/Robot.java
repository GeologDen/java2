package lesson1;

public class Robot implements Participant, Runner, Jumper {

    private String name;
    private int runLimit;
    private int jumpLimit;



    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }


    @Override
    public int getLimitJump() {
        return getJumpLimit();
    }

    @Override
    public int getLimitRun() {
        return getRunLimit();
    }

    @Override
    public String getParticipantName() {
        return getName();
    }

}
