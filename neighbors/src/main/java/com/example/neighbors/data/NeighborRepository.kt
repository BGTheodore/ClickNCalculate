package com.example.neighbors.data

import com.example.neighbors.data.service.DummyNeighborApiService
import com.example.neighbors.data.service.NeighborApiService
import com.example.neighbors.models.Neighbor

class NeighborRepository {
    private val apiService: NeighborApiService

    init {
        apiService = DummyNeighborApiService()
    }

    fun getNeighbors(): List<Neighbor> = apiService.neighbors

    companion object {
        private var instance: NeighborRepository? = null
        fun getInstance(): NeighborRepository {
            if (instance == null) {
                instance = NeighborRepository()
            }
            return instance!!
        }
    }
}
