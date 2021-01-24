package pl.javastart.myapplication;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okButton = findViewById(R.id.ok);

        okButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText nameTextView = findViewById(R.id.name);
                RadioButton genderMale = findViewById(R.id.male);
                RadioButton genderFemale = findViewById(R.id.female);

                String name = nameTextView.getText().toString();
                String gender = "";

                if(genderMale.isChecked()) {
                    gender = "Facet! ";
                }

                if(genderFemale.isChecked()) {
                    gender = "Kobieta! ";
                }

                Toast.makeText(getApplicationContext(), "O " + gender + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}