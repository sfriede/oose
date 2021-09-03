import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
public class Main {

    //store API as new environment variable (System.getenv(name, "name"));
    final String BASE_URL = "blah";  //from SIS
    final String KEY = System.getenv("API");
    System.out.println("hi");

}