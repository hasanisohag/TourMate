package hasan.i.sohag.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private ImageView profileIV;
    private EditText nameET, emailET, mobileNUmberET;
    private Button signupBtn;
    private TextView loginTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();
    }

    private void init() {

        profileIV = findViewById(R.id.profileIV);
        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
        mobileNUmberET = findViewById(R.id.mobileNUmberET);
        signupBtn = findViewById(R.id.signupBtn);
        loginTV = findViewById(R.id.loginTV);
    }


    public void openLoginActivity(View view) {
        startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
    }
}
