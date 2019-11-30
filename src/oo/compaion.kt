package oo

interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {
    companion object : HouseFactory{
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(43, 700_000.0)

        override fun createHouse(): House = getNormalHouse()
    }
}

fun main(args: Array<String>) {
    val house = House.getNormalHouse()
    println(house.price)

    println(House.HOUSES_FOR_SALE)
}