package David.Yesayan.brainquest.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import David.Yesayan.brainquest.HomeFragment;
import David.Yesayan.brainquest.R;
import David.Yesayan.brainquest.modelClass.HomeModel;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {


    Context context;
    ArrayList<HomeModel> list;

    public HomeAdapter(Context context, ArrayList<HomeModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        HomeModel model = list.get(position);
        holder.title.setText(model.getTitle());
        holder.des.setText(model.getDes());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, des;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            des = itemView.findViewById(R.id.des);
        }
    }
}
