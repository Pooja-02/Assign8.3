package krishna.assign84;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity{
     GridView grid;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                //gridview specification
        GridView grid = (GridView) findViewById(R.id.grid);

        // Instance of ImageAdapter Class
        grid.setAdapter(new Imageadapter(this));
    }
}
