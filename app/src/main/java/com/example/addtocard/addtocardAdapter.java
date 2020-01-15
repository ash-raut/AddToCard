package com.example.addtocard;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class addtocardListAdapter extends RecyclerView.Adapter<addtocardListAdapter.ViewHolder> {
    View listItem;
    private addtocardListData[] listdata;

    public addtocardListAdapter(addtocardListData[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public addtocardListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        listItem = layoutInflater.inflate(R.layout.addtocard_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final addtocardListAdapter.ViewHolder holder, int position) {
        final addtocardListData myListData = listdata[position];
        holder.djname.setText(listdata[position].getDjName());
        holder.add.setText(listdata[position].getAdd());
        holder.address.setText(listdata[position].getAddress());
        holder.cancle.setText(listdata[position].getCancle());
        holder.imageView.setImageResource(listdata[position].getImgId());
        /*holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(v.getContext(), BookingFormActivity.class);
                v.getContext().startActivity(intent);

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView djname,add,address,cancle;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.linearLayout = (LinearLayout)itemView.findViewById(R.id.linearLayout);
            this.imageView = (ImageView) itemView.findViewById(R.id.android_gridview_image);
            this.djname = (TextView) itemView.findViewById(R.id.android_gridview_djname);
            this.address=(TextView) itemView.findViewById(R.id.address);
            this.add = (TextView) itemView.findViewById(R.id.add);
            this.cancle=(TextView) itemView.findViewById(R.id.cancle);




        }
    }
}
