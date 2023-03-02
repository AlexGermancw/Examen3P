package ec.edu.espe.examen3p.restaurant.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import ec.edu.espe.examen3p.databinding.ItemAdapterBinding
import ec.edu.espe.examen3p.restaurant.model.Restaurant

class RestaurantAdapter (
    private val context: Context,
    private val restaurantList: List<Restaurant>
) : RecyclerView.Adapter<RestaurantAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemAdapterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val task = restaurantList[position]

        holder.binding.textName.text = task.name


    }

    override fun getItemCount() = restaurantList.size

    inner class MyViewHolder(val binding: ItemAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

}