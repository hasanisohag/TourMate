package hasan.i.sohag.tourmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

import hasan.i.sohag.tourmate.adapter.TourAdapter;

public class MainActivity extends AppCompatActivity {

    private Button addTripBtn;
    private ImageView mapIV, cameraIV;
    private AddTripBottomsheetDiloge addTripBottomsheetDiloge;

    private RecyclerView tourRV;
    private ArrayList<Tour> tours;

    private TourAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        addTripBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTripBottomsheetDiloge = new AddTripBottomsheetDiloge();
                addTripBottomsheetDiloge.show(getSupportFragmentManager(),"addTripBottomSheet");
            }
        });

        getData();
    }

    private void getData() {

        Tour tour1 = new Tour("CoxBazar Tour", "Habijabi habijabi habijabi habijabi habijabi",2000);
        Tour tour2 = new Tour("Sajek Tour", "Habijabi habijabi habijabi habijabi habijabi",1000);
        Tour tour3 = new Tour("Rangamiti Tour", "Habijabi habijabi habijabi habijabi habijabi",5000);
        Tour tour4 = new Tour("Sundarban Tour", "Habijabi habijabi habijabi habijabi habijabi",2000);
        Tour tour5 = new Tour("Bandarban Tour", "Habijabi habijabi habijabi habijabi habijabi",3000);

        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);

        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);

        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);

    }

    private void init() {
        addTripBtn = findViewById(R.id.addTourBtn);
        tourRV = findViewById(R.id.tourRV);
        tours = new ArrayList<>();
        adapter = new TourAdapter(this,tours);

        tourRV.setLayoutManager(new LinearLayoutManager(this));
        tourRV.setAdapter(adapter);

    }
}
