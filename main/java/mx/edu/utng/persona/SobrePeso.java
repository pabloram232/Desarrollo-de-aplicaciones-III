package mx.edu.utng.persona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SobrePeso extends AppCompatActivity {
    TextView texto;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_peso);
        //Relacionar los objetos de xml

        texto=(TextView)findViewById(R.id.sobrepeso);
        image=(ImageView)findViewById(R.id.imagen3);
    }
}
