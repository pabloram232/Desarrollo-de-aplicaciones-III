package mx.edu.utng.persona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtPeso,txtEstatura;
    CheckBox chEjercicio;
    RadioButton rdHombre, rdMujer;
    TextView txtResul;
    Button btnCalcular,btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //relacionar objetos de xml

        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtPeso=(EditText)findViewById(R.id.txtPeso);
        txtEstatura=(EditText)findViewById(R.id.txtEstatura);
        chEjercicio=(CheckBox)findViewById(R.id.chEjercicio);
        rdHombre=(RadioButton)findViewById(R.id.rdHombre);
        rdMujer=(RadioButton)findViewById(R.id.rdMujer);
        txtResul=(TextView)findViewById(R.id.txtResultado);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);
        //Asociar  escucha el boton  para el evento click

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtPeso.setText("");
                txtEstatura.setText("");
                txtResul.setText("");
                chEjercicio.setChecked(false);
                rdHombre.setChecked(false);
                rdMujer.setChecked(false);


            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Persona p=new Persona();//objeto de la clase persona
                p.setNombre(txtNombre.getText().toString());
                p.setPeso(Double.parseDouble(txtPeso.getText().toString()));
                p.setEstatura(Double.parseDouble(txtEstatura.getText().toString()));
                if(chEjercicio.isChecked()){
                    p.setEjercicio((byte)1);
                }else{
                    p.setEjercicio((byte)0);
                }
                if(rdHombre.isChecked()){
                   p.setSexo('H');
                }else if(rdMujer.isChecked()){
                    p.setSexo('M');
                }else{
                    p.setSexo('X');
                }

                p.calcularImc();
                p.imcCalculado();
                txtResul.setText(p.toString());
                if (p.metodos()<20){
                    Intent hola=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(hola);
                }else if(p.metodos()>20&&p.metodos()<25){
                    Intent normal= new Intent(MainActivity.this,PesoNormal.class);
                    startActivity(normal);
                }else if (p.metodos()>25){
                    Intent sobre=new Intent(MainActivity.this,SobrePeso.class );
                    startActivity(sobre);
                }
            }
        });



    }


}
