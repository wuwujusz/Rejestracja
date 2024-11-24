package com.example.rejestracja;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText email1;
    private EditText pass1;
    private EditText pass_again1;
    private TextView alert_field1;
    private Button button_Submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email1 = findViewById(R.id.email);
        pass1 = findViewById(R.id.pass);
        pass_again1 = findViewById(R.id.pass_again);
        alert_field1 = findViewById(R.id.alert_field);
        button_Submit1 = findViewById(R.id.button_Submit);

        button_Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email2 = email1.getText().toString().trim();
                String email3 = email1.getText().toString();
                String pass2 = pass1.getText().toString().trim();
                String pass_again2 = pass_again1.getText().toString().trim();


                if (email2.isEmpty()) {
                    alert_field1.setText("Podaj adres e-mail!");
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email2).matches()) {
                    alert_field1.setText("Podaj poprawny adres e-mail!");
                }else if (pass2.isEmpty()) {
                    alert_field1.setText("Podaj hasło!");
                } else if (pass_again2.isEmpty()) {
                    alert_field1.setText("Powtórz hasło!");
                } else if (!pass2.equals(pass_again2)) {
                    alert_field1.setText("Hasła są różne");
                } else {
                    alert_field1.setText("Witaj " + email3);
                }
            }

        });
    }
}