package com.example.jmui

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.jmui.databinding.RvItemBinding
import com.example.jmui.databinding.RvTabItemBinding

class TabsAdapter(private val activity: Activity, private val tabList : List<Tabs>) : RecyclerView.Adapter<TabsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabsAdapter.ViewHolder {
        val binding = RvTabItemBinding.inflate(LayoutInflater.from(activity), parent, false)
        return TabsAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TabsAdapter.ViewHolder, position: Int) {
        val item = tabList[position]
        holder.tvText.text = item.string
        holder.tvText.background = item.background
        Log.e("recycler", "onBindViewHolder: ${tabList.size}", )
        Toast.makeText(activity.baseContext, "${tabList.size}", Toast.LENGTH_SHORT).show()
    }

    override fun getItemCount(): Int {
        return tabList.size
    }

    class ViewHolder(view : RvTabItemBinding) : RecyclerView.ViewHolder(view.root) {
        val tvText = view.txtTab
    }
}