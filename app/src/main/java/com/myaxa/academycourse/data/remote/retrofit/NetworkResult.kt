package com.myaxa.academycourse.data.remote.retrofit

sealed class NetworkResult<out T : Any> {
    data class Success<out T : Any>(val data: T) : NetworkResult<T>()
    data class GenericError(val message: String) : NetworkResult<Nothing>()
    object NetworkError : NetworkResult<Nothing>()
}