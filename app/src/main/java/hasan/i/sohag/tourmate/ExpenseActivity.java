package hasan.i.sohag.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExpenseActivity extends AppCompatActivity {

    private TextView totalcostTV;
    private EditText transportCostET,hotelCostET,foodCostET,medicalCostET,shopingCostET;
    private Button saveBtn, deleteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);

        init();
        init();
    }

    private void init() {

        totalcostTV = findViewById(R.id.totalcostTV);
        transportCostET = findViewById(R.id.transportCostET);
        foodCostET = findViewById(R.id.foodCostET);
        medicalCostET = findViewById(R.id.medicalCostET);
        shopingCostET = findViewById(R.id.shopingCostET);
        saveBtn = findViewById(R.id.saveBtn);
        deleteBtn = findViewById(R.id.deleteBtn);

    }
}
