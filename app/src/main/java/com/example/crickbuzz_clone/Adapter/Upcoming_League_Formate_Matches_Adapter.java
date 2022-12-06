package com.example.crickbuzz_clone.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crickbuzz_clone.R;
import com.example.crickbuzz_clone.model_class.typeMatches;

public class Upcoming_League_Formate_Matches_Adapter extends RecyclerView.Adapter<Upcoming_League_Formate_Matches_Adapter.ViewHolder> {

    Context context;
    typeMatches[] typeMatches;
    int pos=0;

    public Upcoming_League_Formate_Matches_Adapter(Context context, typeMatches[] typeMatches) {
        this.context = context;
        this.typeMatches = typeMatches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.live_all_formate_matches_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        typeMatches mydata = typeMatches[1];

        //pos=position;
//        if(pos==1){
//            pos++;
//        }

        Toast.makeText(context, ""+mydata.getSeriesMatches().size(), Toast.LENGTH_SHORT).show();

        //Toast.makeText(context, ""+pos, Toast.LENGTH_SHORT).show();
        //Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
//        for(int i=0; i<mydata.getSeriesMatches().size()-1; i++){
////            for(int j=0; j<i; j++){
////
////            }
//            Log.d("TAG", "onBindViewHolder: "+mydata.getSeriesMatches().size());
//            for(int j=0; j<mydata.getSeriesMatches().get(i).getSeriesAdWrapper().getMatches().size(); j++) {
//                holder.txtTeam1Name.setText(mydata.getSeriesMatches().get(2).getSeriesAdWrapper().getMatches().get(3).getMatchInfo().getTeam1().getTeamSName());
//            }
//        }
//        holder.txtMatchAndVenueName.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchInfo().getMatchDesc() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchInfo().getVenueInfo().getCity());
//        holder.txtTeam2Name.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchInfo().getTeam2().getTeamSName());
//
//
//        //team 1 scorecard
//        if(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore() != null) {
//            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score() != null) {
//
//                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1() != null) {
//                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().isDeclared() == true) {
//                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().getWickets() + " d");
//
//                        holder.txtTeam1Score.setTextColor(Color.GRAY);
//                        holder.txtTeam1Name.setTextColor(Color.GRAY);
//                    } else {
//                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().getWickets() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam1Score().getInngs1().getOvers() + ")");
//                    }
//                } else {
//                    holder.txtTeam1Score.setText("");
//                    holder.txtTeam1Name.setTextColor(Color.GRAY);
//
//                }
//            } else {
//                holder.txtTeam1Score.setText("");
//                holder.txtTeam1Name.setTextColor(Color.GRAY);
//
//            }
//
//            //team 2 scorecard
//            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score() != null) {
//                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score().getInngs1() != null) {
//
//                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score().getInngs1().isDeclared() == true) {
//                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score().getInngs1().getWickets() + " d");
//
//                        holder.txtTeam2Score.setTextColor(Color.GRAY);
//                        holder.txtTeam2Name.setTextColor(Color.GRAY);
//                    } else {
//                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchScore().getTeam2Score().getInngs1().getOvers() + ")");
//                    }
//                } else {
//                    holder.txtTeam2Score.setText("");
//                    holder.txtTeam2Name.setTextColor(Color.GRAY);
//                }
//            } else {
//                holder.txtTeam2Score.setText("");
//                holder.txtTeam2Name.setTextColor(Color.GRAY);
//            }
//        }
//
//
//        if(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchInfo().getState().equalsIgnoreCase("Won")){
//            holder.txtMatchStatus.setTextColor(Color.BLUE);
//        }
//        holder.txtMatchStatus.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(position).getMatchInfo().getStatus());
    }

    @Override
    public int getItemCount() {
        return typeMatches[1].getSeriesMatches().get(0).getSeriesAdWrapper().getMatches().size();
        //return typeMatches[1].getSeriesMatches().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMatchAndVenueName, txtTeam1Name, txtTeam2Name, txtTeam1Score, txtTeam2Score, txtMatchStatus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMatchAndVenueName = itemView.findViewById(R.id.txtMatchAndVenueName);
            txtTeam1Name = itemView.findViewById(R.id.txtTeam1Name);
            txtTeam2Name = itemView.findViewById(R.id.txtTeam2Name);
            txtTeam1Score = itemView.findViewById(R.id.txtTeam1Score);
            txtTeam2Score = itemView.findViewById(R.id.txtTeam2Score);
            txtMatchStatus = itemView.findViewById(R.id.txtMatchStatus);
        }
    }
}


