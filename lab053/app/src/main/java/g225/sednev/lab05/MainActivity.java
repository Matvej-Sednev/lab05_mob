package g225.sednev.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText text;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 555)
        {
            if (data != null)
            {
                String s = data.getStringExtra("qwe");
                text.setText(s);
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    public void onClick(View v)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Хотите выйти?")
                .setTitle("Dialog Title")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id)
                    {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void open_dialog(View v)
    {
        text = findViewById(R.id.Input);

        String s = text.getText().toString();

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("abc", s);
        startActivityForResult(i, 555);

        }
    }