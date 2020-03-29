package dev.jamile.spacedaily.di

import dev.jamile.spacedaily.ActivityRetriever
import dev.jamile.spacedaily.DefaultCurrentActivityListener
import org.koin.dsl.module

val appModule = module {
    single { DefaultCurrentActivityListener() }
    single { ActivityRetriever(get()) }
}