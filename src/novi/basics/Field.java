package novi.basics;

public class Field {

    private String token;
    private boolean isOccupied;

    public Field(String token){
        this.token = token;
        this.isOccupied = false;
    }

    public boolean setToken(String token){
        if(!isOccupied){
            this.token = token;
        isOccupied = true;
        return true; }
        else{
            System.out.println("Kies een ander veld!");
            return false; }

    }

    public String getToken(){
        return token;
    }


}
