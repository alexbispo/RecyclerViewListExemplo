package com.artes.alexbispo.listcardsexemplo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.artes.alexbispo.listcardsexemplo.R;

/**
 * Created by alexoliveira on 13/07/2016.
 */
public class ExemploAdapter extends RecyclerView.Adapter<ExemploAdapter.ViewHolder> {

    private final String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.item_text_view);
        }
    }

    public ExemploAdapter(String[] exemploDataSet) {
        mDataSet = exemploDataSet;
    }

    @Override
    public ExemploAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exemplo_text_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
