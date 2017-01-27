package mx.edu.utng.persona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PesoNormal extends AppCompatActivity {
    TextView texto;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_normal);
        //Relacionar los objetos del xml

        texto=(TextView)findViewById(R.id.pesonormal);
        image2=(ImageView)findViewById(R.id.imagen2);
    }
}
