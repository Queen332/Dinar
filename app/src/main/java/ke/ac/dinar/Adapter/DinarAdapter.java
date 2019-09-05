package ke.ac.dinar.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;

import ke.ac.dinar.GlobalVars;
import ke.ac.dinar.Homedinar;
import ke.ac.dinar.R;
import ke.ac.dinar.dinars;

public class DinarAdapter extends RecyclerView.Adapter<DinarAdapter.ViewHolder>  {

        Context context;
        View view;
        List<dinars> list= Collections.emptyList();

    public DinarAdapter(Context context, List<dinars> list) {
        this.context = context;
        this.list = list;
    }



    @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_dinar,parent, false);
            return new ViewHolder(view);

        }
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.name.setText(list.get(position).name);
            holder.phone_number.setText(GlobalVars.dinars.get(position).phone_number);
            Log.e("listd",GlobalVars.dinars.size()+"\t"+GlobalVars.dinars.get(position).phone_number);
           // Glide.with(holder.itemView.getContext()).asBitmap().load(GlobalVars.dinars.get(position).getPictur*/e()).into(holder.image);


            /*holder.name.setText(GlobalVars.dinars.get(position).name);
            holder.phone_number.setText(GlobalVars.dinars.get(position).phone_number);
            Log.e("listd",GlobalVars.dinars.size()+"\t"+GlobalVars.dinars.get(position).phone_number);
            Glide.with(holder.itemView.getContext()).asBitmap().load(GlobalVars.dinars.get(position).getPicture()).into(holder.image);*/


        }

        @Override
        public int getItemCount() {

            return GlobalVars.dinars.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            TextView name,phone_number;
            ImageView image;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                name=itemView.findViewById(R.id.tv_name);
                phone_number=itemView.findViewById(R.id.tv_phone_number);
                image= itemView.findViewById(R.id.imageView);

            }
        }
    }


