package app.eagle_eye.vocabularybuilderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Firebase ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setClickMethod(View v)
    {
        if(v.getId()==R.id.buttonTemp)
        {
            Intent intent = new Intent(this,TestActivity.class);
            startActivity(intent);
        }
    }

}
