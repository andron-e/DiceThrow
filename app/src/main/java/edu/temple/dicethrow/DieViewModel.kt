package edu.temple.dicethrow

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel() {
    private val currentRoll = MutableLiveData<Int>()

    fun setRoll (roll: Int) {
        currentRoll.value = roll
    }

    fun getRoll(): LiveData<Int>  = currentRoll

    companion object {
        fun newInstance() = DieViewModel()
    }
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_die_view_model, container, false)
    }*/
}