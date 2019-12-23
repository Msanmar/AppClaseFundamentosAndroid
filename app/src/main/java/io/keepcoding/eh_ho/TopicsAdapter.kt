package io.keepcoding.eh_ho

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_topics.view.*
import kotlinx.android.synthetic.main.item_topic.view.*

//Genérico: abstracción de tipos
//Genérico de la clase del View Holder que vas a ocupar
class TopicsAdapter(val topicClickListener: ((Topic)->Unit)?=null): RecyclerView.Adapter<TopicsAdapter.TopicHolder>(){


//val topics: MutableList<Topic> = mutableListOf()

    private val topics = mutableListOf<Topic>() //colección de datos que queremos mostrar
    private val listener : ((View) -> Unit) = {
        val topic = it.tag as Topic


        Log.d(TopicsAdapter::class.java.simpleName, topic.toString())
        topicClickListener?.invoke(topic)
    }

    //Se ejecuta N veces (plantilla)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicHolder {
        val  view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_topic,parent,false)
            return TopicHolder(view)
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    //Poblar datos
    override fun onBindViewHolder(holder: TopicHolder, position: Int) {
        //Recibe el viewHolder
        val topic = topics[position]
        holder.topic = topic
        holder.itemView.setOnClickListener(listener)
    }


    fun setTopics(topics: List<Topic>){
        this.topics.clear()
        this.topics.addAll((topics))
        notifyDataSetChanged()
    }
    //Los ViewHolder sólo van a ser creados detnro de la clase Topics Adapter
    inner class TopicHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


        var topic : Topic? = null
        //Custom Setter

        //Asignar campos en la vista
        set(value) {
            field = value
            itemView.tag = field //relacionar vista con tag
            itemView.labelTitle.text = field?.title
        }

    }




}