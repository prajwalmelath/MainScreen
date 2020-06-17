package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Details#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Details extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TextView t1, t2, t3, t4, t5, t6, t7;
    EditText et1, et2, et3, et4;
    Switch s1, s2;
    Button btn;



    public Details() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Details.
     */
    // TODO: Rename and change types and number of parameters
    public static Details newInstance(String param1, String param2) {
        Details fragment = new Details();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        Bundle b1 = new Bundle();
        t1 = view.findViewById(R.id.appl);
        t2 = view.findViewById(R.id.temp);
        t3 = view.findViewById(R.id.rh);
        t4 = view.findViewById(R.id.tUpp);
        t5 = view.findViewById(R.id.tLow);
        t6 = view.findViewById(R.id.rUpp);
        t7 = view.findViewById(R.id.rLow);

        et1 =(EditText) view.findViewById(R.id.t_upper_limit);
        et2 =(EditText) view.findViewById(R.id.t_lower_limit);
        et3 =(EditText) view.findViewById(R.id.r_upper_limit);
        et4 =(EditText) view.findViewById(R.id.r_lower_limit);

        t1.setText(b1.getString("room", "Some room"));

        // Inflate the layout for this fragment
        return view;
    }
}