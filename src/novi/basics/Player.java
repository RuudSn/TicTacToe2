package novi.basics;


public class Player {

    private String name;
    private String token;
    private int score;

    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    public String getName() {
        return name; }

    public String getToken() {
        return token; }

    public int getScore() {
        return score; }

    public void setScore(int extraPoints){
        this.score = score + extraPoints; }

}