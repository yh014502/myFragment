package iii.org.tw.myfragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2Fragment extends Fragment {

    private TextView tv;
    private MainActivity main;

    public F2Fragment() {
        // Required empty public constructor
        main = (MainActivity) getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f2, container, false);
        tv = (TextView)view.findViewById(R.id.f2_tv);
        tv.setText("Hello, TV2");
        return view;
    }

}
