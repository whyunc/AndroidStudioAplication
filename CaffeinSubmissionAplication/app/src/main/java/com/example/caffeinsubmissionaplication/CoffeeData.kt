package com.example.caffeinsubmissionaplication

object CoffeeData {

    private val coffeeName = arrayOf(
        "Vietnam Drip Coffee",
        "V60 Coffee",
        "Americano Coffee",
        "Cappuchino Coffee",
        "Machiato Coffee",
        "Mocachino Coffee",
        "Affogato Coffee",
        "Coffee Latte",
        "Hazellnut Latte",
        "Vanilla Latte"
    )

    private val coffeeDetail = arrayOf(
        "kopi Vietnam drip berasal dari tetesan air kopi. Terdapat banyak lubang kecil di bagian bawah Vietnam drip. Terbuat dari kopi bubuk vietnam menggunakan alat bernama vietnam drip",
        "kopi yang mengguanakan metode pour over. Kopi yang dihasilkan dari teknik ini menonjolkan rasa tapi lebih bersih karena tidak ada minyak dan waktu kontak dengan kopinya singkat",
        "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Minuman ini kerap disajikan dalam panas maupun dingin yang disebut iced Americano.",
        "Cappuccino adalah olahan espresso yang paling banyak digemari, terutama bagi penikmat kopi dengan rasa lebih mild Minuman ini terdiri dari espresso dan steamed milk dengan rasio 1:1",
        "Kalau kamu gak terlalu menikmati kopi yang cenderung pahit, kamu bisa pesan macchiato sebagai alternatif. Rasio steamed milk dalam minuman ini lebih besar dari espresso, sehingga ada sentuhan milky dan gurih.",
        "Espresso, susu, dan cokelat merupakan paduan ideal dari secangkir moccacino. Dibanding kopi, lembutnya cokelat dan susu lebih mendominasi. Biasanya minuman ini menggunakan cokelat bubuk untuk campuran dan garnish, tapi ada juga yang memakai sirup cokelat di atasnya.",
        "affogato adalah es krim vanila yang dituang espresso shot. Paduan pahitnya kopi hitam dan es krim yang manis dan lembut menciptakan sensasi rasa menyenangkan. Apalagi saat es krim perlahan meleleh begitu tersiram espresso.",
        "Latte biasanya menggunakan perbandingan espresso dan susu 2:1. Selain rasanya nikmat, latte biasanya disajikan dalam cangkir dengan motif indah di atasnya atau yang banyak disebut latte art.",
        "Tidak jauh berbeda dengan coffee latte, hazelnut latte menmbahkan cita rasa hazellnut pada coffe sehingga coffe memiliki cita rasa yang baru yang dapat dinikmati baik dingin maupun panas",
        "Coffee dengan tambahan cita rasa vanila yang manis mampu membuat secangkir vanilla latte begitu nikmat diminum pada kondisi cuaca apapun dan keadaan bagaimanapun"
    )

    private  val coffeePrice = arrayOf(
        "Rp. 15.000",
        "Rp. 12.000",
        "Rp. 15.000",
        "Rp. 18.000",
        "Rp. 20.000",
        "rp. 18.000",
        "Rp. 20.000",
        "Rp. 15.000",
        "Rp. 20.000",
        "Rp. 20.000"
    )

    private val coffeeType = arrayOf(
        "Hot & Ice",
        "Hot ",
        "Hot ",
        "Hot & Ice",
        "Hot & Ice",
        "Hot & Ice",
        "Hot & Ice",
        "Hot & Ice",
        "Hot & Ice",
        "Hot & Ice"
    )

    private val coffeeImage = intArrayOf(
        R.drawable.vietnam_drip,
        R.drawable.v60,
        R.drawable.americano,
        R.drawable.cappucino,
        R.drawable.machiato,
        R.drawable.mocacino,
        R.drawable.affogato,
        R.drawable.latte,
        R.drawable.hazelnut,
        R.drawable.vanila
    )

    val listData:ArrayList<Coffee>
    get() {
        val list = arrayListOf<Coffee>()
        for (posistion in coffeeName.indices){
            val coffeedata = Coffee()
            coffeedata.name = coffeeName[posistion]
            coffeedata.detail = coffeeDetail[posistion]
            coffeedata.price = coffeePrice[posistion]
            coffeedata.type = coffeeType[posistion]
            coffeedata.photo = coffeeImage[posistion]
            list.add(coffeedata)
        }
        return list
    }
}