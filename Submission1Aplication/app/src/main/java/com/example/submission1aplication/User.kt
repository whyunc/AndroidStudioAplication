package com.example.submission1aplication

import android.os.Parcel
import android.os.Parcelable

class User(
        var avatar: Int= 0,
        var name: String?= "",
        var username: String? = "",
        var location: String? = "",
        var repository: String? = "",
        var company: String? = "",
        var followers: String? = "",
        var following: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(avatar)
        parcel.writeString(name)
        parcel.writeString(username)
        parcel.writeString(location)
        parcel.writeString(repository)
        parcel.writeString(company)
        parcel.writeString(followers)
        parcel.writeString(following)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}