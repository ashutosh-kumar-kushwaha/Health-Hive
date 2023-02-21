package ashutosh.healthhive.ui.auth.forgotPasswordOtpVerification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ashutosh.healthhive.R

class ForgotPasswordOtpVerificationFragment : Fragment() {

    private lateinit var viewModel: ForgotPasswordOtpVerificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_forgot_password_otp_verification,
            container,
            false
        )
    }

}