package hasan.i.sohag.tourmate.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import hasan.i.sohag.tourmate.ExpenseActivity;
import hasan.i.sohag.tourmate.R;
import hasan.i.sohag.tourmate.Tour;
import hasan.i.sohag.tourmate.TourDetailsActivity;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Tour> tours;

    public TourAdapter(Context context, ArrayList<Tour> tours) {
        this.context = context;
        this.tours = tours;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_tour,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Tour tour = tours.get(position);
        holder.tourNameTV.setText(tour.getName());
        holder.tourDescriptionTV.setText(tour.getDescription());

        holder.detailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TourDetailsActivity.class);
                intent.putExtra("name",tour.getName());
                intent.putExtra("description",tour.getDescription());
                intent.putExtra("expence",tour.getExpence());

                context.startActivity(intent);
            }
        });

        holder.addExpenceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ExpenseActivity.class);
                context.startActivity(intent);
            }
        });
        holder.editLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TourDetailsActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tours.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tourNameTV, tourDescriptionTV;
        private Button detailsBtn, addExpenceBtn, AddMemoryBtn;
        private LinearLayout editLayout, deleteLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tourNameTV = itemView.findViewById(R.id.tourNameTV);
            tourDescriptionTV = itemView.findViewById(R.id.tourDescriptionTV);
            detailsBtn = itemView.findViewById(R.id.detailsBtn);
            addExpenceBtn = itemView.findViewById(R.id.addExpenceBtn);
            AddMemoryBtn = itemView.findViewById(R.id.AddMemoryBtn);
            editLayout = itemView.findViewById(R.id.editLayout);
            deleteLayout = itemView.findViewById(R.id.deleteLayout);
        }
    }
}
