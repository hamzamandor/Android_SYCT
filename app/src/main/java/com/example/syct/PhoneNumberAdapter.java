package com.example.syct;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PhoneNumberAdapter extends RecyclerView.Adapter<PhoneNumberAdapter.PhoneNumberViewHolder> {

    private List<String[]> phoneNumberList;

    public PhoneNumberAdapter(List<String[]> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    @NonNull
    @Override
    public PhoneNumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_phone_number, parent, false);
        return new PhoneNumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneNumberViewHolder holder, int position) {
        String[] phoneNumberData = phoneNumberList.get(position);
        holder.bind(phoneNumberData);
    }

    @Override
    public int getItemCount() {
        return phoneNumberList.size();
    }

    static class PhoneNumberViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewPhoneNumber;

        PhoneNumberViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewPhoneNumber = itemView.findViewById(R.id.textViewPhoneNumber);
        }

        void bind(String[] phoneNumberData) {
            textViewName.setText(phoneNumberData[0]);
            textViewPhoneNumber.setText(phoneNumberData[1]);
        }
    }
}
