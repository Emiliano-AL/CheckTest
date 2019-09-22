package mx.com.emiliano.checktest.ui.dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import mx.com.emiliano.checktest.R;
import mx.com.emiliano.checktest.common.Const;
import mx.com.emiliano.checktest.retrofit.response.DetailSubsidiary;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsSubsidiaryDialog extends DialogFragment {

    private Button btnOk;
    private TextView tvDescription, tvName, tvCategory;
    private DetailSubsidiary subsidiaryDetail;

    public static DetailsSubsidiaryDialog newInstance(DetailSubsidiary subsidiary) {
        DetailsSubsidiaryDialog dialog = new DetailsSubsidiaryDialog();
        Bundle args = new Bundle();
        args.putString(Const.ARG_SUBSIDIARY_NAME, subsidiary.getName());
        args.putString(Const.ARG_SUBSIDIARY_CATEGORY, subsidiary.getCategory());
        args.putString(Const.ARG_SUBSIDIARY_DESCRITION, subsidiary.getTxtShare());
//        args.putString(Const.ARG_SUBSIDIARY_NAME, subsidiary.getName());
        dialog.setArguments(args);

        return dialog;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            subsidiaryDetail = new DetailSubsidiary();
            subsidiaryDetail.setName(getArguments().getString(Const.ARG_SUBSIDIARY_NAME));
            subsidiaryDetail.setTxtShare(getArguments().getString(Const.ARG_SUBSIDIARY_DESCRITION));
            subsidiaryDetail.setCategory(getArguments().getString(Const.ARG_SUBSIDIARY_CATEGORY));
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_tittle_subsidiary);

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.fragment_details_subsidiary_dialog, null);
        tvCategory = v.findViewById(R.id.tvCategory);
        tvName = v.findViewById(R.id.tvName);
        tvDescription = v.findViewById(R.id.tvDescription);
        if(subsidiaryDetail != null){
            tvDescription.setText(subsidiaryDetail.getTxtShare());
            tvName.setText(subsidiaryDetail.getName());
            tvCategory.setText(subsidiaryDetail.getCategory());
        }
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });

        builder.setView(v);

        return builder.create();
    }
}
