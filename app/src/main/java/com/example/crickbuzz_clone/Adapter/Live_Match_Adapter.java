package com.example.crickbuzz_clone.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crickbuzz_clone.R;
import com.example.crickbuzz_clone.model_class.typeMatches;

public class Live_Match_Adapter extends RecyclerView.Adapter<Live_Match_Adapter.ViewHolder> {

    Context context;
    typeMatches[] typeMatches;
    int newPos=0;

    public Live_Match_Adapter(Context context, com.example.crickbuzz_clone.model_class.typeMatches[] typeMatches) {
        this.context = context;
        this.typeMatches = typeMatches;
    }

    @NonNull
    @Override
    public Live_Match_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.live_match_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Live_Match_Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        typeMatches mydata = typeMatches[0];


       // Toast.makeText(context, ""+(mydata.getSeriesMatches().size()-1)+"", Toast.LENGTH_SHORT).show();
        if(position == mydata.getSeriesMatches().get(1).getAdDetail().getPosition()){

        }
        else {
            holder.txtMatchAndSeriesName.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getMatchDesc() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getSeriesName());
            holder.txtTeam1Name.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getTeam1().getTeamSName());
            holder.txtTeam2Name.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getTeam2().getTeamSName());

            if(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore() != null) {

                //team 1 scorecard
                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score() != null) {
                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1() != null) {
                        if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2() != null) {

                            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().isDeclared() == true) {
                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() == 10) {

                                    holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " & " +
                                            mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getWickets() + " d");

                                    holder.txtTeam1Score.setTextColor(Color.GRAY);
                                    holder.txtTeam1Name.setTextColor(Color.GRAY);
                                } else {
                                    holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() + " & " +
                                            mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getWickets() + " d");

                                    holder.txtTeam1Score.setTextColor(Color.GRAY);
                                    holder.txtTeam1Name.setTextColor(Color.GRAY);
                                }
                            } else {

                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getWickets() == 10) {
                                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() == 10) {
                                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns());

                                        holder.txtTeam1Score.setTextColor(Color.GRAY);
                                        holder.txtTeam1Name.setTextColor(Color.GRAY);
                                    } else {
                                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns());

                                        holder.txtTeam1Score.setTextColor(Color.GRAY);
                                        holder.txtTeam1Name.setTextColor(Color.GRAY);
                                    }
                                } else {
                                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() == 10) {
                                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getWickets());

                                    } else {
                                        holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs2().getWickets());
                                    }
                                }
                            }
                        } else {

                            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().isDeclared() == true) {
                                holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() + " d");

                                holder.txtTeam1Score.setTextColor(Color.GRAY);
                                holder.txtTeam1Name.setTextColor(Color.GRAY);
                            } else {
                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() == 10) {
                                    holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getOvers() + ")");

                                    holder.txtTeam1Score.setTextColor(Color.GRAY);
                                    holder.txtTeam1Name.setTextColor(Color.GRAY);
                                } else {
                                    holder.txtTeam1Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getWickets() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam1Score().getInngs1().getOvers() + ")");
                                }
                            }
                        }
                    } else {
                        holder.txtTeam1Score.setText("");
                        holder.txtTeam1Name.setTextColor(Color.GRAY);

                    }
                } else {
                    holder.txtTeam1Score.setText("");
                    holder.txtTeam1Name.setTextColor(Color.GRAY);

                }

                //team 2 scorecard

                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score() != null) {
                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1() != null) {
                        if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2() != null) {

                            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().isDeclared() == true) {
                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() == 10) {

                                    holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " & " +
                                            mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getWickets() + " d");

                                    holder.txtTeam2Score.setTextColor(Color.GRAY);
                                    holder.txtTeam2Name.setTextColor(Color.GRAY);
                                } else {
                                    holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " & " +
                                            mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getWickets() + " d");

                                    holder.txtTeam2Score.setTextColor(Color.GRAY);
                                    holder.txtTeam2Name.setTextColor(Color.GRAY);
                                }
                            } else {

                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getWickets() == 10) {
                                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() == 10) {
                                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns());

                                        holder.txtTeam2Score.setTextColor(Color.GRAY);
                                        holder.txtTeam2Name.setTextColor(Color.GRAY);
                                    } else {
                                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns());

                                        holder.txtTeam2Score.setTextColor(Color.GRAY);
                                        holder.txtTeam2Name.setTextColor(Color.GRAY);
                                    }
                                } else {
                                    if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() == 10) {
                                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getWickets());

                                    } else {
                                        holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " & " +
                                                mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs2().getWickets());
                                    }
                                }
                            }
                        } else {

                            if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().isDeclared() == true) {
                                holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " d");

                                holder.txtTeam2Score.setTextColor(Color.GRAY);
                                holder.txtTeam2Name.setTextColor(Color.GRAY);
                            } else {
                                if (mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() == 10) {
                                    holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getOvers() + ")");

                                    holder.txtTeam2Score.setTextColor(Color.GRAY);
                                    holder.txtTeam2Name.setTextColor(Color.GRAY);
                                } else {
                                    holder.txtTeam2Score.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getRuns() + " - " + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getWickets() + " (" + mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchScore().getTeam2Score().getInngs1().getOvers() + ")");
                                }
                            }
                        }
                    } else {
                        holder.txtTeam2Score.setText("");
                        holder.txtTeam2Name.setTextColor(Color.GRAY);

                    }
                } else {
                    holder.txtTeam2Score.setText("");
                    holder.txtTeam2Name.setTextColor(Color.GRAY);

                }
            }

            else{
                holder.txtTeam1Score.setText("");
                holder.txtTeam2Score.setText("");
            }

            //match status
            if(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getState().equalsIgnoreCase("Won")
                || mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getState().equalsIgnoreCase("Complete")){
                holder.txtMatchStatus.setTextColor(Color.BLUE);
            }
            holder.txtMatchStatus.setText(mydata.getSeriesMatches().get(position).getSeriesAdWrapper().getMatches().get(0).getMatchInfo().getStatus());
        }
    }

    @Override
    public int getItemCount() {
        return typeMatches[0].getSeriesMatches().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMatchAndSeriesName, txtTeam1Name, txtTeam2Name, txtTeam1Score, txtTeam2Score, txtMatchStatus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMatchAndSeriesName = itemView.findViewById(R.id.txtMatchAndSeriesName);
            txtTeam1Name = itemView.findViewById(R.id.txtTeam1Name);
            txtTeam2Name = itemView.findViewById(R.id.txtTeam2Name);
            txtTeam1Score = itemView.findViewById(R.id.txtTeam1Score);
            txtTeam2Score = itemView.findViewById(R.id.txtTeam2Score);
            txtMatchStatus = itemView.findViewById(R.id.txtMatchStatus);
        }
    }
}


