package mx.com.emiliano.checktest.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.emiliano.checktest.R;
import mx.com.emiliano.checktest.data.SubsidiaryViewModel;
import mx.com.emiliano.checktest.retrofit.response.Subsidiary;

import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class SubsidiaryFragment extends Fragment {

    private RecyclerView recyclerView;
    private SubsidiaryViewModel subsidiaryViewModel;
    private List<Subsidiary> subsidiaryList;
    private MySubsidiaryRecyclerViewAdapter adapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SubsidiaryFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static SubsidiaryFragment newInstance(int columnCount) {
        SubsidiaryFragment fragment = new SubsidiaryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        subsidiaryViewModel = ViewModelProviders.of(getActivity())
                .get(SubsidiaryViewModel.class);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subsidiary_list, container, false);

        // Set the adapter
        Context context = view.getContext();
        recyclerView = view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        adapter = new MySubsidiaryRecyclerViewAdapter(getActivity(), subsidiaryList);
        recyclerView.setAdapter(adapter);

        loadAllSubsidiary();

        return view;
    }

    private void loadAllSubsidiary(){
        subsidiaryViewModel.getSubsiadiarys().observe(getActivity(), new Observer<List<Subsidiary>>() {
            @Override
            public void onChanged(List<Subsidiary> subsidiaries) {
                subsidiaryList = subsidiaries;
                adapter.setData(subsidiaryList);
            }
        });
    }
}
