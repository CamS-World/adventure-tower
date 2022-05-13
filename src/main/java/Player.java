import javax.annotation.processing.Generated;


public abstract class Player {


    private int playerId;
    private String playerName;
    private int playerHp;
    private int bodyScore;
    private int mindScore;
    private int spirtScore;
    private int attackScore;
    private int defenseScore;
    private int prowessScore;
    private Class playerClass;

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public int getBodyScore() {
        return bodyScore;
    }

    public int getMindScore() {
        return mindScore;
    }

    public int getSpirtScore() {
        return spirtScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public int getDefenseScore() {
        return defenseScore;
    }

    public int getProwessScore() {
        return prowessScore;
    }

    public Class getPlayerClass() {
        return playerClass;
    }

    public Player(String playerName, int playerHp, int bodyScore, int mindScore, int spirtScore, int attackScore, int defenseScore, Class playerClass) {
        this.playerName = playerName;
        this.playerHp = playerHp;
        this.bodyScore = bodyScore;
        this.mindScore = mindScore;
        this.spirtScore = spirtScore;
        this.attackScore = attackScore;
        this.defenseScore = defenseScore;
        this.playerClass = playerClass;
    }

    public Player(){
    }

    public abstract void attack();

    public abstract void heal();

    public abstract void harm();
}
