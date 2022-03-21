package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.modelomvvm.databinding.FragmentListBinding
import util.Utils


class CourseListAdapter: ListAdapter<String, CourseViewHolder>(Utils.DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        TODO("")
        /*val itemBinding = FragmentListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return null*/
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}