package ec.edu.espe.examen3p.restaurant.helper

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import org.bson.Document

object MongoDBHelper {
    private const val DB_NAME = "Movil"
    private const val COLLECTION_NAME = "Restaurant"
    private lateinit var collection: MongoCollection<Document>

    fun connect() {
        val connectionString = ConnectionString("mongodb+srv://agchicaiza2:sistemcw1727@restaurant.mongodb.net/movil?retryWrites=true&w=majority")
        val settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build()

        val client = MongoClients.create(settings)
        val database = client.getDatabase(DB_NAME)
        collection = database.getCollection(COLLECTION_NAME)
    }

    fun getCollection(): MongoCollection<Document> {
        return collection
    }
}

