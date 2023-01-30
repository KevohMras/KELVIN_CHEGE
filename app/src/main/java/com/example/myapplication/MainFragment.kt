import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment(), MainFragment.view.onClick {
    class view {
        interface onClick {

        }

    }
} listener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_records, parent, false)

        return RecyclerView.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val student : Student = students[position]
        holder.title.text = "Title: ${student.title}"
        holder.message.text = "Message: ${student.message}"
    }

    override fun getItemCount() = students.size
}

}
}