package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item_view.view.*

class OnlyBelieveAdapter(var items: ArrayList<OnlyBelieve>, var clickListener: onOnlyBelieveItemClickListener): RecyclerView.Adapter<OnlyBelieveViewHolder>(){
    // OnlyBelieveAdapter extends RecyclerView.Adpter, we need to override the three member functions
    //getitem count
    //oncreateviewholder
    //onbindviewholder

    override fun getItemCount(): Int {
        ///TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        //===count list of items inside the adapter
        return items.size


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnlyBelieveViewHolder {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        //=====appends a cardview and return a view holder object
        //===when the view is firdt created, it comes here


        lateinit var onlyBelieveViewHolder: OnlyBelieveViewHolder

        //======hence we create a view==
        onlyBelieveViewHolder =  OnlyBelieveViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_view, parent, false)) //inflate the layout view with our view
        return  onlyBelieveViewHolder

    }

    override fun onBindViewHolder(holder: OnlyBelieveViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


        /////////on next time the app launches var onlyBelieveTitle = itemView.onlybelievetitle
        //    var onlyBelieveLyric = itemView.onlybelievelyrics
        //    var onlyBelieveLogo = itemView.onlybelievelogo ==== all of these wil be loaded


//        holder.onlyBelieveTitle?.text = items.get(position).title ///geting the items
//        holder.onlyBelieveLyric?.text = items.get(position).lyrics
//        holder.onlyBelieveLogo.setImageResource(items.get(position).logo)
        //=========accessing initliaes funct


        holder.initialise(items.get(position), clickListener)
    }



}

class OnlyBelieveViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


    //====access of all of the items

    var onlyBelieveTitle = itemView.onlybelievetitle
    var onlyBelieveLyric = itemView.onlybelievelyrics
    var onlyBelieveLogo = itemView.onlybelievelogo


    //=======also create a func=====

    fun initialise(item: OnlyBelieve, action: onOnlyBelieveItemClickListener) {

        //=====we will initialised all the views here===
        onlyBelieveTitle.text = item.title
        onlyBelieveLyric.text = item.lyrics
        onlyBelieveLogo.setImageResource(item.logo)

        //====taking the item view
        itemView.setOnClickListener {
            action.onItemclick(item, adapterPosition) //we get the item and the adapter position
        }



    }



}

//=======adding click listener====


interface  onOnlyBelieveItemClickListener {
    //recieve the model types and position
    fun onItemclick(item: OnlyBelieve, position: Int)
}