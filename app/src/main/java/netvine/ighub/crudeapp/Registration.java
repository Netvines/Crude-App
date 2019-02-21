package netvine.ighub.crudeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    private TextView tvRegister, tvLogin;
    private EditText etFirstName, etLastName, etEmail, etPassword, etPhoneNumber, etComfirmPassword;
    private Button btnSubmit;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int phoneNumber;
    private String ComfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etComfirmPassword = findViewById(R.id.etcomfirmPassword);
        btnSubmit = findViewById(R.id.btnSubmit);

       btnSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               Validate();
           }
       });
    }

    private void Validate() {
        firstname = etFirstName.getText().toString();
        lastname = etLastName.getText().toString();
        email = etEmail.getText().toString().trim();
        password = etPassword.getText().toString();
        ComfirmPassword = etComfirmPassword.getText().toString().trim().toLowerCase();
        phoneNumber = etPhoneNumber.getText().toString().trim().length();

        if (TextUtils.isEmpty(firstname)){
            etFirstName.setError("empty field");

        }
        if (TextUtils.isEmpty(lastname)){
            etLastName.setError("empty field");
        }
        if (TextUtils.isEmpty(email)){
            etEmail.setError("fill email");
        }
        if (TextUtils.isEmpty(password)){
            etPassword.setError("enter password");
        }
        if (TextUtils.isEmpty(ComfirmPassword)){
            etComfirmPassword.setError("re-enter password");
        }

    }
}



