package e.nbroder.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // This method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code you add goes after the setContentView
        mMessageTextView = findViewById(R.id.message_textview);

        // temp area
        //mMessageTextView.setText("Niall is the coolest programmer ever!!!!!");
        Log.d("HB", "This is a log cat log. Logs are important!");




    }
}
