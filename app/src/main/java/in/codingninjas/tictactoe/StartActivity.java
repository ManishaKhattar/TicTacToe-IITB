package in.codingninjas.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);

        SharedPreferences sp = getSharedPreferences("TicTacToe", MODE_PRIVATE);
        boolean firstLogin =  sp.getBoolean("first_login",true);

        if(firstLogin){
            Toast.makeText(this,"First Login",Toast.LENGTH_SHORT).show();
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("first_login", false);
            editor.commit();
        }
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        Intent i = new Intent();
        i.setClass(this, MainActivity.class);
        startActivity(i);


    }

}
