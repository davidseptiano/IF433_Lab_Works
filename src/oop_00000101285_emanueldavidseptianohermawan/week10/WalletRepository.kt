package oop_00000101285_emanueldavidseptianohermawan.week10

interface NamedEntitiy {
    val name: String
}

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add (item: T) {
        items.add(item)
    }

    fun getAll() : List<T> {
        return items
    }
}