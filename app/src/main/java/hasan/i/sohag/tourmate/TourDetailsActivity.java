package hasan.i.sohag.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TourDetailsActivity extends AppCompatActivity {

    private EditText nameET, descriptionET;
    private TextView expenceTV, showExpenceListTV;
    private String name, description;
    private double expence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        init();

        if (getIntent().getExtras()!=null){

            name = getIntent().getStringExtra("name");
            description = getIntent().getStringExtra("description");
            expence = getIntent().getDoubleExtra("expence",0);

            nameET.setText(name);
            descriptionET.setText(description);
            expenceTV.setText(String.valueOf(expence));

        }

        showExpenceListTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TourDetailsActivity.this, ExpenseActivity.class));
            }
        });
    }

    private void init() {

        nameET = findViewById(R.id.nameET);
        descriptionET = findViewById(R.id.descriptionET);
        expenceTV = findViewById(R.id.expenceTV);
        showExpenceListTV = findViewById(R.id.showExpenceListTV);
    }
}
