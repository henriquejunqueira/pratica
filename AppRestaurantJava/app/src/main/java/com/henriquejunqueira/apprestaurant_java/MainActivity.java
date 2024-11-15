package com.henriquejunqueira.apprestaurant_java;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.henriquejunqueira.apprestaurant_java.adapter.FoodAdapter;
import com.henriquejunqueira.apprestaurant_java.databinding.ActivityMainBinding;
import com.henriquejunqueira.apprestaurant_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<Food>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);

        getFood();

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    private void getFood(){
        Food food1 = new Food(
                R.drawable.food1,
                "Food 1",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin bibendum auctor ex sit amet auctor.",
                "$ 120.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Food 2",
                "Duis id enim ut tortor varius tristique. Quisque vitae lacus leo. Etiam egestas odio odio, at posuere nisi faucibus porta.",
                "$ 80.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Food 3",
                "Ut fermentum porta leo, non auctor leo varius ut. Duis porta massa eros, sed vehicula augue bibendum nec.",
                "$ 75.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Food 4",
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec volutpat felis porta consectetur iaculis.",
                "$ 45.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Food 5",
                "Curabitur sit amet accumsan orci, quis imperdiet velit. Integer commodo facilisis orci sit amet aliquam.",
                "$ 50.00"
        );
        foodList.add(food5);
    }
}