package com.example.apkkontak;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContactRecycleView extends AppCompatActivity {

    List<listmodel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_recycle_view);

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new listmodel("#775447", "Kucing", "082345677345", "Active"));
        elements.add(new listmodel("#228B22", "Anjing", "082345677345", "Disable"));
        elements.add(new listmodel("#1E90FF", "Kelinci", "082345677345", "Nonactive"));
        elements.add(new listmodel("#696969", "Tikus", "082345677345", "Active"));
        elements.add(new listmodel("#DCDCDC", "Marmut", "082345677345", "Active"));
        elements.add(new listmodel("#FFD700", "Cicak", "082345677345", "Active"));
        elements.add(new listmodel("#DAA520", "Lucifer", "082345677345", "Active"));
        elements.add(new listmodel("#ADFF2F", "Belial", "082345677345", "Active"));
        elements.add(new listmodel("#FF69B4", "Beelzebub", "082345677345", "Active"));
        elements.add(new listmodel("#CD5C5S", "Sandalpon", "082345677345", "Active"));
        elements.add(new listmodel("#F0E68C", "Mantan", "082345677345", "Active"));
        elements.add(new listmodel("#FFF0F5", "Selingkuhan", "082345677345", "Active"));
    }
}



