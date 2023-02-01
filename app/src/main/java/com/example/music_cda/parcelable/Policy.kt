package com.example.music_cda.parcelable

import android.os.Parcel
import android.os.Parcelable

data class Policy(var policy: String?): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(policy)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Policy> {
        override fun createFromParcel(parcel: Parcel): Policy {
            return Policy(parcel)
        }

        override fun newArray(size: Int): Array<Policy?> {
            return arrayOfNulls(size)
        }
    }

}
