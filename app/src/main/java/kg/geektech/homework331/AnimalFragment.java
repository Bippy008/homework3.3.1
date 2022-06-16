package kg.geektech.homework331;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {
    private ArrayList<Animal> animals;
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new AnimalAdapter(animals);
        recyclerView = view.findViewById(R.id.animal_recycler);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        animals = new ArrayList<>();
        animals.add(new Animal(getString(R.string.tiger_description), "https://i.imgur.com/WHHAV4r.jpg"));
        animals.add(new Animal(getString(R.string.lion_description), "https://i.imgur.com/n4FaGfS.png"));
        animals.add(new Animal(getString(R.string.jaguar_description), "https://i.imgur.com/iN5dbxq.png"));
        animals.add(new Animal(getString(R.string.cheetah_description), "https://i.imgur.com/taw2e7O.png"));
    }


    // 261 символов максимум
    //https://i.imgur.com/WHHAV4r.jpg тигр
    //https://i.imgur.com/n4FaGfS.png лев
    //https://i.imgur.com/iN5dbxq.png ягуар
    //https://i.imgur.com/taw2e7O.png гепард
}