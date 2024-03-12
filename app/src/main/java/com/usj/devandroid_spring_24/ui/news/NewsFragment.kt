package com.usj.devandroid_spring_24.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.usj.devandroid_spring_24.databinding.FragmentNewsListBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newsViewModel =
            ViewModelProvider(this)[NewsViewModel::class.java]

        _binding = FragmentNewsListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView  = binding.newsRv
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}