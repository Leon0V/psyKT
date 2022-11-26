package up.edu.psicofbase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewAdapter(private val psychList: ArrayList<PsychList>) : RecyclerView.Adapter<NewAdapter.ThisViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThisViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_data, parent, false)
        return ThisViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ThisViewHolder, position: Int) {
        val currentItem = psychList[position]
        holder.appliance.text = currentItem.Aplicação
        holder.construto.text = currentItem.Construto
        holder.contexto.text = currentItem.Contexto
        holder.correcao.text = currentItem.Contexto
        holder.descricao.text = currentItem.Descrição
        holder.idade.text = currentItem.Idade
        holder.itens.text = currentItem.Itens
        holder.nome.text = currentItem.Nome
        holder.objetivo.text = currentItem.Objetivo
        holder.profissionais.text = currentItem.Profissionais
        holder.publico.text = currentItem.Publico
        holder.quantidade.text = currentItem.Quantidade.toString()
        holder.sigla.text = currentItem.Sigla
        holder.tempo.text = currentItem.Tempo
        holder.validade.text = currentItem.Validade
    }

    override fun getItemCount(): Int {
        return psychList.size
    }

    class ThisViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val appliance : TextView = itemView.findViewById(R.id.tvappliance)
        val construto : TextView = itemView.findViewById(R.id.tvconstruto)
        val contexto : TextView = itemView.findViewById(R.id.tvcontext)
        val correcao : TextView = itemView.findViewById(R.id.tvcorrection)
        val descricao : TextView = itemView.findViewById(R.id.tvdesc)
        val idade : TextView = itemView.findViewById(R.id.tvage)
        val itens : TextView = itemView.findViewById(R.id.tvitens)
        val nome : TextView = itemView.findViewById(R.id.tvname)
        val objetivo : TextView = itemView.findViewById(R.id.tvgoal)
        val profissionais : TextView = itemView.findViewById(R.id.tvprofessionals)
        val publico : TextView = itemView.findViewById(R.id.tvpublic)
        val quantidade : TextView = itemView.findViewById(R.id.tvquantity)
        val sigla : TextView = itemView.findViewById(R.id.tvsigla)
        val tempo : TextView = itemView.findViewById(R.id.tvtime)
        val validade : TextView = itemView.findViewById(R.id.tvvalidity)



    }

}