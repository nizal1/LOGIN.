package com.example.apkkontak;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class listAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private final LayoutInflater =Inflater;
    private List<Listmodel> listData;
    private LayoutInflater layoutInflater;
    private Context context;



    public ListAdapter(List<Listmodel>)


    public List<Listmodel> getListData() {
        return listData;
    }

    public void setListData(List<Listmodel> listData) {
        this.listData = listData;
    }

    public LayoutInflater getLayoutInflater() {
        return layoutInflater;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}