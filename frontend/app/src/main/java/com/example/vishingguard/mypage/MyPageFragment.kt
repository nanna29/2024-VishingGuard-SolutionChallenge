package com.example.vishingguard.mypage

import androidx.fragment.app.Fragment
import com.example.vishingguard.R
import com.example.vishingguard.base.BindingFragment
import com.example.vishingguard.databinding.FragmentMyPageBinding
import com.example.vishingguard.mypage.data.LogoutUserDialog
import com.example.vishingguard.mypage.data.WithdrawUserFragment

class MyPageFragment : BindingFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    override fun initView() {

        // Update user information
        binding.btnUpdate.setOnClickListener {
            replaceFragment(UpdateFragment())
        }

        // Logout
        binding.btnLogout.setOnClickListener{
            val logoutUserDialog = LogoutUserDialog(requireContext())
            logoutUserDialog.show()
        }

        // WithdrawUser
        binding.btnRevoke.setOnClickListener{
            replaceFragment(WithdrawUserFragment())
        }
    }

    // Replace fragment
    fun replaceFragment(fragment: Fragment){
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, fragment)
            .addToBackStack(null)
            .commit()
    }
}