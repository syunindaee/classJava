import java.util.Arrays;

public class show {

    public String[] show = {"A", "B", "C"};

    public show(){

    }

    public int showId(){
        return Arrays.asList(show).indexOf("A");
    }

}
