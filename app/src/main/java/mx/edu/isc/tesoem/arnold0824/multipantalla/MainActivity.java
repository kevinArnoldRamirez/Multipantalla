package mx.edu.isc.tesoem.arnold0824.multipantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import mx.edu.tesoem.isc.aysp.multipantalla.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //aqui colocaremos el tipo de diseño Landscape o portraid
    }
    @SuppressLint("SourceLockedOrientationActivity")
    public void VHorizontal (View v){
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    @SuppressLint("SourceLockedOrientationActivity")
    public void VVrtical(View v){
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}

