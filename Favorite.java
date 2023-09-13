
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Favorite {
    private Date date;
    private String videoName;
    private URL url;
    

    public Favorite(String name, String address){
        this.videoName = name;
        this.date = new Date();
        this.url = new URL(address);

    }

    public String toString(){
        String s = this.videName + " " + this.date + "\n";
        return s + url.toString();
    }
}
