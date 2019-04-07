package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmDataActivity extends AppCompatActivity {

    TextView tvFullName;
    TextView tvPhoneNumber;
    TextView tvEmail;
    TextView tvDescription;
    TextView tvBirthDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);

        Bundle parameters = getIntent().getExtras();
        String fullName = parameters.getString("fullName");
        String phoneNumber = parameters.getString("phoneNumber");
        String email = parameters.getString("email");
        String description = parameters.getString("description");
        int birthDateDay = parameters.getInt("birthDateDay");
        int birthDateMonth = parameters.getInt("birthDateMonth");
        int birthDateYear = parameters.getInt("birthDateYear");

        tvFullName = (TextView) findViewById(R.id.tvFullName);
        tvPhoneNumber = (TextView) findViewById(R.id.tvPhoneNumber);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvBirthDate = (TextView) findViewById(R.id.tvBirthDate);

        tvFullName.setText(fullName);
        tvPhoneNumber.setText(phoneNumber);
        tvEmail.setText(email);
        tvDescription.setText(description);
        tvBirthDate.setText(birthDateDay + "/" + birthDateMonth+1 + "/" + birthDateYear);
    }

    public void editData(View view) {
        finish();
    }
}
