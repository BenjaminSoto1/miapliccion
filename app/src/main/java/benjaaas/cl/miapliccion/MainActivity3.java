package benjaaas.cl.miapliccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {


    Button button1;
    EditText respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = new Intent(this,MainActivity.class);
        button1=(Button) findViewById(R.id.button2);
        respuesta=(EditText) findViewById(R.id.eTrespuesta);
        intent.putExtra("respuesta",respuesta.getText().toString());
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}