package com.example.crickbuzz_clone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.crickbuzz_clone.ApiInterface;
import com.example.crickbuzz_clone.Adapter.Live_Match_Adapter;
import com.example.crickbuzz_clone.MainActivity;
import com.example.crickbuzz_clone.R;
import com.example.crickbuzz_clone.RetrofitInstance;
import com.example.crickbuzz_clone.model_class.typeMatches;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FeaturedFragment extends Fragment{


    ApiInterface apiInterface;
    Live_Match_Adapter live_match_adapter;
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_featured, container, false);

        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
        recyclerView = view.findViewById(R.id.recyclerView);

        apiInterface.getMatches(MainActivity.apiKey).enqueue(new Callback<typeMatches>() {
            @Override
            public void onResponse(Call<typeMatches> call, Response<typeMatches> response) {
                if(response.isSuccessful()){
                    typeMatches[] typeMatches = response.body().getTypeMatches();

                            live_match_adapter = new Live_Match_Adapter(getContext(), typeMatches);
                            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
                            recyclerView.setAdapter(live_match_adapter);
                }
                else{
                    Toast.makeText(getContext(), "Fail", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<typeMatches> call, Throwable t) {

            }
        });

        return view;
    }
}