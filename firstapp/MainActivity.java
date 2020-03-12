package hello.itay.com.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private TextView fname;
    private TextView lname;
    private RatingBar rbar;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.fnametv);
        lname = findViewById(R.id.lnmaetv);
        rbar = findViewById(R.id.ratingBar);
        submit = findViewById(R.id.sbbtn);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.sbbtn) {
            //Toast.makeText(this, "Button1 was clicked!", Toast.LENGTH_LONG).show();
            String msg = fname.getText() + " " + lname.getText() + " " + rbar.getRating() + " !";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            Log.d("========== ", "clicked button");
            Log.e("========== ", fname.getText() + " " + lname.getText() + " " + rbar.getRating() + " !");


        }

    }
}
