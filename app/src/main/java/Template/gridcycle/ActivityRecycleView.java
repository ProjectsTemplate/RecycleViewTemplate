package Template.gridcycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Template.gridcycle.Adapter.Adapter;
import Template.gridcycle.Object.ItemInfo;

import net.smallacademy.gridcycle.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityRecycleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        ArrayList<ItemInfo> itemList = CreatDataForRecycleView();
        SetDataToAdapter(itemList);
    }

    public ArrayList<ItemInfo> CreatDataForRecycleView(){
        List<String> titles;
        List<Integer> images;
        ArrayList<ItemInfo> itemList;

        itemList = new ArrayList<>();
        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);

        for (int i =0 ; i < titles.size();i++){
            ItemInfo itemInfo = new ItemInfo();
            itemInfo.setImageId(images.get(i));
            itemInfo.setTittle((titles.get(i)));
            itemList.add(itemInfo);
        }
        return itemList;
    }
    public void SetDataToAdapter(ArrayList<ItemInfo> itemList){
        int numberColomn = 2;
        Adapter adapter = new Adapter(this,itemList);
        RecyclerView dataList = findViewById(R.id.dataList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,numberColomn,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}
