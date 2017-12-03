package cicek.com.app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {//------

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {///

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.txtName); // layout kısmıda tanımlı olan TextView
                                                    // i findViewById ile id sine eriştik

        txt.setText(getString(R.string.hello_world));//setText metodu

    }///

}//------
