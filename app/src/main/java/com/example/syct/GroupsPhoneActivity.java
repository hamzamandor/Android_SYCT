package com.example.syct;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.syct.PhoneNumberAdapter;
import com.example.syct.R;

import java.util.ArrayList;
import java.util.List;

public class GroupsPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groupsphone);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String[]> phoneNumberList = new ArrayList<>();
        phoneNumberList.add(new String[]{"Hamza Elordi", "+212646675088"});
        phoneNumberList.add(new String[]{"Hamid Karazen", "+212646675088"});
        phoneNumberList.add(new String[]{"Kira7", "+212646675088"});
        phoneNumberList.add(new String[]{"Amine jlabandrie", "+212646675088"});
        phoneNumberList.add(new String[]{"simo life", "+212646675088"});
        phoneNumberList.add(new String[]{"farok life", "+212646675088"});
        phoneNumberList.add(new String[]{"mole raibe mkachtar", "+212646675088"});
        phoneNumberList.add(new String[]{"hassan l3assas", "+212646675088"});
        phoneNumberList.add(new String[]{"hamid escobar", "+212646675088"});
        phoneNumberList.add(new String[]{"omar l3tla ", "+212646675088"});
        phoneNumberList.add(new String[]{"hasan dalma ", "+212646675088"});
        phoneNumberList.add(new String[]{"stati 3abd l3ziz", "+212646675088"});

        PhoneNumberAdapter adapter = new PhoneNumberAdapter(phoneNumberList);
        recyclerView.setAdapter(adapter);
    }
}
