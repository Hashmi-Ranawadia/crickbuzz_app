package com.example.crickbuzz_clone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.crickbuzz_clone.Adapter.Live_Domestic_Formate_Matches_Adapter;
import com.example.crickbuzz_clone.Adapter.Live_International_Formate_Matches_Adapter;
import com.example.crickbuzz_clone.Adapter.Live_League_Formate_Matches_Adapter;
import com.example.crickbuzz_clone.Adapter.Live_Women_Formate_Matches_Adapter;
import com.example.crickbuzz_clone.ApiInterface;
import com.example.crickbuzz_clone.MainActivity;
import com.example.crickbuzz_clone.R;
import com.example.crickbuzz_clone.RetrofitInstance;
import com.example.crickbuzz_clone.model_class.typeMatches;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveFragment extends Fragment {


    ApiInterface apiInterface;
    Live_International_Formate_Matches_Adapter live_international_formate_matches_adapter;
    Live_League_Formate_Matches_Adapter live_league_formate_matches_adapter;
    Live_Domestic_Formate_Matches_Adapter live_domestic_formate_matches_adapter;
    Live_Women_Formate_Matches_Adapter live_women_formate_matches_adapter;
    RecyclerView recyclerView1, recyclerView2, recyclerView3, recyclerView4;
    TextView txtMatchType1, txtMatchType2, txtMatchType3, txtMatchType4;
    LinearLayout linearInternational, linearLeague, linearDomestic, linearWomen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live, container, false);

        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
        recyclerView1 = view.findViewById(R.id.recyclerView1);
        recyclerView2 = view.findViewById(R.id.recyclerView2);
        recyclerView3 = view.findViewById(R.id.recyclerView3);
        recyclerView4 = view.findViewById(R.id.recyclerView4);

        txtMatchType1 = view.findViewById(R.id.txtMatchType1);
        txtMatchType2 = view.findViewById(R.id.txtMatchType2);
        txtMatchType3 = view.findViewById(R.id.txtMatchType3);
        txtMatchType4 = view.findViewById(R.id.txtMatchType4);

        linearInternational = view.findViewById(R.id.linearInternational);
        linearLeague = view.findViewById(R.id.linearLeague);
        linearDomestic = view.findViewById(R.id.linearDomestic);
        linearWomen = view.findViewById(R.id.linearWomen);

        ApiCall();

        return view;
    }

    private void ApiCall(){
        apiInterface.getMatches(MainActivity.apiKey).enqueue(new Callback<typeMatches>() {
            @Override
            public void onResponse(Call<typeMatches> call, Response<typeMatches> response) {
                if(response.isSuccessful()){
                    typeMatches[] typeMatches = response.body().getTypeMatches();
                    for(int i=0; i<typeMatches.length; i++){
                        if(typeMatches[i].getMatchType().equals("International")) {
                            linearInternational.setVisibility(View.VISIBLE);
                            txtMatchType1.setText(typeMatches[i].getMatchType().toUpperCase());

                            live_international_formate_matches_adapter = new Live_International_Formate_Matches_Adapter(getContext(), typeMatches);
                            recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
                            recyclerView1.setAdapter(live_international_formate_matches_adapter);
                        }

                        if(typeMatches[i].getMatchType().equals("League")) {
                            linearLeague.setVisibility(View.VISIBLE);
                            txtMatchType2.setText(typeMatches[i].getMatchType().toUpperCase());

                            live_league_formate_matches_adapter = new Live_League_Formate_Matches_Adapter(getContext(), typeMatches);
                            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                            recyclerView2.setAdapter(live_league_formate_matches_adapter);
                        }

                        if(typeMatches[i].getMatchType().equals("Domestic")) {
                            linearDomestic.setVisibility(View.VISIBLE);
                            txtMatchType3.setText(typeMatches[i].getMatchType().toUpperCase());

                            live_domestic_formate_matches_adapter = new Live_Domestic_Formate_Matches_Adapter(getContext(), typeMatches);
                            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
                            recyclerView3.setAdapter(live_domestic_formate_matches_adapter);
                        }

                        if(typeMatches[i].getMatchType().equals("Women")) {
                            linearWomen.setVisibility(View.VISIBLE);
                            txtMatchType4.setText(typeMatches[i].getMatchType().toUpperCase());

                            live_women_formate_matches_adapter = new Live_Women_Formate_Matches_Adapter(getContext(), typeMatches);
                            recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
                            recyclerView4.setAdapter(live_domestic_formate_matches_adapter);
                        }
                    }


                }
                else{
                    Toast.makeText(getContext(), "Fail...", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<typeMatches> call, Throwable t) {
                Toast.makeText(getContext(), t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}