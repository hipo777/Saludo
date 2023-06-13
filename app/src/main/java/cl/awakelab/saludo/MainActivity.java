package cl.awakelab.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textViewNombre);
        textView1.setText(R.string.text_nombre);

        TextView textView2 = findViewById(R.id.textViewApellido);
        textView2.setText(R.string.text_apellido);
    }
}