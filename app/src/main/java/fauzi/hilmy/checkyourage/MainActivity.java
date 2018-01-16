package fauzi.hilmy.checkyourage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAge;
    Button btnCheck;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAge = (EditText)findViewById(R.id.editText);
        btnCheck = (Button)findViewById(R.id.button);
        lblResult = (TextView)findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nUmur = etAge.getText().toString();
                int Umur = Integer.parseInt(nUmur);

                if (Umur >= 0 && Umur <= 5 ) {
                    lblResult.setText("You Are Balita");
                }else if (Umur >= 6 && Umur <= 12 ) {
                    lblResult.setText("You Are Anak Anak");
                }else if (Umur >= 13 && Umur <= 21 ) {
                    lblResult.setText("You Are Remaja");
                }else if (Umur >= 22 && Umur <= 50 ) {
                    lblResult.setText("You Are Dewasa");
                }else{
                    lblResult.setText("You Are too Old");
                }
            }
        });
    }
}
