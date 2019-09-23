package mx.com.emiliano.checktest.ui;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import mx.com.emiliano.checktest.R;
import mx.com.emiliano.checktest.data.SubsidiaryViewModel;
import mx.com.emiliano.checktest.retrofit.response.DetailSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;
import mx.com.emiliano.checktest.ui.dialogs.DetailsSubsidiaryDialog;

import java.util.List;

public class MySubsidiaryRecyclerViewAdapter extends RecyclerView.Adapter<MySubsidiaryRecyclerViewAdapter.ViewHolder> {

    private List<Subsidiary> mValues;
    private Context ctx;
    private SubsidiaryViewModel subsidiaryViewModel;

    public MySubsidiaryRecyclerViewAdapter(Context context, List<Subsidiary> items) {
        mValues = items;
        ctx = context;
        subsidiaryViewModel = ViewModelProviders.of((FragmentActivity)ctx).get(SubsidiaryViewModel.class);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_subsidiary, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        if(mValues != null){
            holder.mItem = mValues.get(position);
            holder.tvTitulo.setText(mValues.get(position).getName());
            holder.tvCategory.setText(mValues.get(position).getCategory());
        }


        holder.ivCheckDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: open Detail
                final DetailSubsidiary detail = subsidiaryViewModel.getDetailSubsidiary(mValues.get(position).getSubsidiaryKey());
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        subsidiaryViewModel.openDetailDialog(ctx, detail);
                    }
                }, 10000);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(mValues != null)
            return mValues.size();

        return 0;
    }

    public void setData(List<Subsidiary> subsidiaryList){
        this.mValues = subsidiaryList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView tvTitulo;
        public final TextView tvCategory;
        public final ImageView ivCheckDetail;
        public Subsidiary mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            tvTitulo = (TextView) view.findViewById(R.id.tvTitulo);
            tvCategory = (TextView) view.findViewById(R.id.tvCategory);
            ivCheckDetail = view.findViewById(R.id.ivCheckDetail);
        }

        @Override
        public String toString() {
            return super.toString() + "  ";
        }
    }
}
