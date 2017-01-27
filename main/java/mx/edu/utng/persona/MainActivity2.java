package mx.edu.utng.persona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView ejemplo;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Relacionar los objetos xml

        ejemplo=(TextView)findViewById(R.id.ejemplo1);
        image=(ImageView)findViewById(R.id.image);


    }
}
