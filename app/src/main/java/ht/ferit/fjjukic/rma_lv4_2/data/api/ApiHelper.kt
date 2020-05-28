package ht.ferit.fjjukic.rma_lv4_2.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}