package com.example.tvproject.data.repositoryImple


import com.example.tvproject.data.datasource.remotDatasource.MoveApiDataSource
import com.example.tvproject.data.mapers.MoveAppDataToDomainMapper
import com.example.tvproject.domain.models.MoveAppDomainModel

import com.example.tvproject.domain.repo.MoveAppRepository

class MoveAppRepositoryImpl(
    private val moveDataSource: MoveApiDataSource,
    private val mapper: MoveAppDataToDomainMapper
) : MoveAppRepository {
    override suspend fun getMoveApp(): List<MoveAppDomainModel> =
        moveDataSource.getMoveApiDataSource().map { mapper.delegate(it) }
}