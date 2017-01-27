package mx.edu.utng.persona;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.TimerTask;
import java.util.Timer;

public class SplashScreen extends AppCompatActivity {
//Establecer la duracion de la pantalla
    private  static  final  long SPLASE_SCREEN_DELAY= 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Aplicar orientacion del imagen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //ocultar barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task =new TimerTask() {
            @Override
            public void run() {
                //iniciar mainActivity
                Intent mainIntent= new Intent().setClass(SplashScreen.this,MainActivity.class);
                startActivity(mainIntent);
                //se finaliza el actividad
                finish();
            }
        };
        //simula la carga de un proceso en la aplicacion
        Timer timer=new Timer();
        timer.schedule(task,SPLASE_SCREEN_DELAY);
    }
}
