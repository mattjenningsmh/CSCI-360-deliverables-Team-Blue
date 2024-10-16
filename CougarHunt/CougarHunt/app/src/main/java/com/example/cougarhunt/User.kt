package com.example.cougarhunt

data class User(
    val name: String?,
    @field:JvmField
    val isStaff: Boolean?,
    val cougarId: Int?,
    val email: String?,
    val placesFound: List<String>?
)
