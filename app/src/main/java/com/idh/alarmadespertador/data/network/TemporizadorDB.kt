package com.idh.alarmadespertador.data.network

import androidx.room.Database
import androidx.room.RoomDatabase
import com.idh.alarmadespertador.domain.models.Temporizador

/*clase abstracta que extiende RoomDatabase, parte integral del framework Room de Android para el
manejo de bases de datos. Esta clase representa la base de datos para la aplicación, definiendo todas las
entidades y versiones de la misma. */
//Las clases abstractas en Java y Kotlin se utilizan para definir un "contrato" o estructura
// que las clases hijas deben seguir, sin proporcionar una implementación complet
@Database (entities = [Temporizador::class], version = 1, exportSchema = false)
abstract class TemporizadorDB: RoomDatabase () {
    abstract fun temporizadorDao(): TemporizadorDao
}