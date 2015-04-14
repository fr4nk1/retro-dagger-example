package com.escorps.retrodagger.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.escorps.retrodagger.R;
import com.escorps.retrodagger.models.PetModel;
import java.util.List;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<PetModel> items;

    public void setItems(List<PetModel> items){
        this.items = items;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(final ViewHolder holder, int position) {
        final PetModel item = items.get(position);

        holder.textName.setText(item.getName());

        holder.itemView.setTag(item);
    }

    @Override public int getItemCount() {
        return items.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.textName) TextView textName;

        public ViewHolder(View itemView) {
            super(itemView);
            
            ButterKnife.inject(this, itemView);
        }
    }

}
