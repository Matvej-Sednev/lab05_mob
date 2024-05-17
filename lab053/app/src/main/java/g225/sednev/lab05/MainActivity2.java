package g225.sednev.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = findViewById(R.id.input_txt);

        Intent i = getIntent();
        String s = i.getStringExtra("abc");
        txt.setText(s);
    }
    public void cancel_click(View v)
    {
        setResult(RESULT_CANCELED);
        finish();
    }
    public void ok_click(View v)
    {
        Intent i = new Intent();

        String s = txt.getText().toString();
        i.putExtra( "qwe", s);

        setResult(RESULT_OK, i);
        finish();
    }
}