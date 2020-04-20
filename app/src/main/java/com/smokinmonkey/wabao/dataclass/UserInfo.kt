package com.smokinmonkey.wabao.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserInfo(
    val easemob: String, // idk what this is
    val invitation_code: String,
    val id: Int,
    val account_name: String,
    val sex: Int,
    val birthdate: String,
    val mobile_number: String,
    val last_login_time: String,
    val last_login_ip: String,
    val user_money: Double, // idk what this is
    val total_spent: Double,
    val total_net: Double,
    val total_votes: Double,
    val user_level: Int,
    val user_type: Int,
    val created_date_time: String,
    val updated_date_time: String,
    val is_mic_link: Boolean,
    val is_recording: Boolean,
    val tags: List<String>,
    val uuid: String,
    val follows: Int,
    val followers: Int,
    val saved_videos: Int
    ) : Parcelable