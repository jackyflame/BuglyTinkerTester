package haozi.buglytinkertester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //txv_content = (TextView) findViewById(R.id.txv_content);
        //txv_content.setText("fixed!!");
    }
}
