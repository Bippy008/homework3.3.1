package kg.geektech.homework331;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private ArrayList<Animal> animals;

    public AnimalAdapter(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.bind(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        private ImageView animalImage;
        private TextView animalTv;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            animalImage = itemView.findViewById(R.id.animal_image);
            animalTv = itemView.findViewById(R.id.animal_tv);
        }


        public void bind(Animal animal) {
            animalTv.setText(animal.getAnimalText());
            Glide.with(animalImage).load(animal.getAnimalURL()).into(animalImage);
        }
    }
}
