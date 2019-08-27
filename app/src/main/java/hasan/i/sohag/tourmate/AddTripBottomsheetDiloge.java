package hasan.i.sohag.tourmate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddTripBottomsheetDiloge extends BottomSheetDialogFragment {

    private EditText tripNameET, tripDescriptionET;
    private TextView startDateTV, endDateTV;
    private Button saveBtn;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main_bottom_sheet,container,false);
//        intit();
//
//        saveBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dismiss();
//            }
//        });

        return view;

    }

    private void intit() {

//        tripNameET = view.findViewById(R.id.tripNameET);
//        tripDescriptionET = view.findViewById(R.id.tripDescriptionET);
//        startDateTV = view.findViewById(R.id.startDateTV);
//        endDateTV = view.findViewById(R.id.endDateTV);
//        saveBtn = view.findViewById(R.id.saveBtn);

    }
}
