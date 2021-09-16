package com.example.eplstanding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.eplstanding.database.Dao;
import com.example.eplstanding.database.Database;
import com.example.eplstanding.database.Entity;
import com.example.eplstanding.model.StandingsItem;
import com.example.eplstanding.model.StatsItem;
import com.example.eplstanding.service.StandingListener;
import com.example.eplstanding.service.StandingService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new StandingService().getStanding(StandingListener);

    }

    StandingListener<List<StandingsItem>> StandingListener = new StandingListener<List<StandingsItem>>() {
        @Override
        public void onSuccess(List<StandingsItem> items) {
            boolean check;

            Database databaseRoom = Database.getInstance(getApplication());
            Dao dao = databaseRoom.dao();

            check = dao.getAllData().isEmpty();

            for(int i = 0; i < items.size(); i++){
                Entity entity = new Entity(
                        Integer.parseInt(items.get(i).getTeam().getId()),
                        items.get(i).getTeam().getDisplayName(),
                        items.get(i).getStats().get(0).getDisplayValue(),
                        items.get(i).getStats().get(1).getDisplayValue(),
                        items.get(i).getStats().get(2).getDisplayValue(),
                        Integer.parseInt(items.get(i).getStats().get(8).getDisplayValue()),
                        items.get(i).getStats().get(6).getDisplayValue(),
                        items.get(i).getTeam().getLogos().get(0).getHref()
                );
//                Log.d("Logo --", items.get(i).getTeam().getLogos().get(0).getHref());
//                Log.d("Nama   -> ", items.get(i).getStats().get(8).getDisplayName());
//                Log.d("Rank   -> ", items.get(i).getStats().get(8).getDisplayValue());
//                Log.d("Team   -> ", items.get(i).getTeam().getDisplayName());
//                Log.d("Nama   -> ", items.get(i).getStats().get(0).getDisplayName());
//                Log.d("Win    ->", items.get(i).getStats().get(0).getDisplayValue());
//                Log.d("Nama   -> ", items.get(i).getStats().get(1).getDisplayName());
//                Log.d("Losses -> ", items.get(i).getStats().get(1).getDisplayValue());
//                Log.d("Nama   -> ", items.get(i).getStats().get(2).getDisplayName());
//                Log.d("Draw   -> ", items.get(i).getStats().get(2).getDisplayValue());
//                Log.d("Nama   -> ", items.get(i).getStats().get(6).getDisplayName());
//                Log.d("Points -> ", items.get(i).getStats().get(6).getDisplayValue());

                if(check) {
                    dao.insert(entity);
                }
                else
                    dao.update(entity);
            }

            recyclerView();

        }

        @Override
        public void onFailed(String msg) {
            Log.d("ISI ERROR", msg);
            boolean check;

            Database databaseROOM = Database.getInstance(getApplication());
            Dao dao = databaseROOM.dao();

            check = dao.getAllData().isEmpty();

            if(check){
                Log.d("STATUS ISI DATABASE : ", "Kosong");
            }
        }

    };

    void recyclerView(){
        Database databaseROOM = Database.getInstance(getApplication());
        Dao dao = databaseROOM.dao();

        ArrayList<Entity> entity = new ArrayList<>();
        List<Entity> data = dao.getAllData();

        for (int i = 0; i < data.size(); i++){
            entity.add(data.get(i));
        }

        RecyclerView.Adapter adapter;
        adapter = new Adapter(this, entity);
        RecyclerView recyclerView = findViewById(R.id.rc_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }
}
