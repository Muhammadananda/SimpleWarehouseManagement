class WarehouseManager {
    var shopName: String = ""
    var shippingAddress: String = ""
    var buyerPhone: String = ""
    var sparePartCode1: String = ""
    var sparePartName1: String = ""
    var sparePartQty1: Int = 0
    var sparePartPrice1: Int = 0
    var sparePartCode2: String = ""
    var sparePartName2: String = ""
    var sparePartQty2: Int = 0
    var sparePartPrice2: Int = 0
    var grandAmmount: Int = 0

    fun print(title: String) {
        println("-------------------------------------")
        println("|           $title          |")
        println("-------------------------------------")
    }

    fun print (shopName: String,
               shippingAddress: String,
               buyerPhone: String) {
        this.shopName = shopName
        this.shippingAddress = shippingAddress
        this.buyerPhone = buyerPhone
        println("Nama Toko           : ${this.shopName}")
        println("Alamat Pengantaran  : ${this.shippingAddress}")
        println("Nomor Telepon       : ${this.buyerPhone}")
    }

    fun print (sparePartCode1: String,
               sparePartName1: String,
               sparePartQty1: Int,
               sparePartPrice1: Int,
               sparePartCode2: String,
               sparePartName2: String,
               sparePartQty2: Int,
               sparePartPrice2: Int) {

        this.sparePartCode1 = sparePartCode1
        this.sparePartName1 = sparePartName1
        this.sparePartQty1 = sparePartQty1
        this.sparePartPrice1 = sparePartPrice1
        this.sparePartCode2 = sparePartCode2
        this.sparePartName2 = sparePartName2
        this.sparePartQty2 = sparePartQty2
        this.sparePartPrice2 = sparePartPrice2

        println("   Kode Sparepart   : ${this.sparePartCode1}")
        println("   Nama Sparepart   : ${this.sparePartName1}")
        println("   Jumlah           : ${this.sparePartQty1} Unit")
        println("   Harga            : Rp. ${this.sparePartPrice1}")
        println("   Kode Sparepart   : ${this.sparePartCode2}")
        println("   Nama Sparepart   : ${this.sparePartName2}")
        println("   Jumlah           : ${this.sparePartQty2} Unit")
        println("   Harga            : Rp. ${this.sparePartPrice2}")
    }

    fun print() {

        this.grandAmmount = (this.sparePartPrice1 * this.sparePartQty1) + (this.sparePartPrice2 * this.sparePartQty2)

        println("Total Pembelian     : Rp. ${this.grandAmmount}")
    }
}

fun main() {
    val shopName: String
    val shippingAddress: String
    val buyerPhone: String
    val sparePartCode1: String
    val sparePartName1: String
    val sparePartQty1: Int
    val sparePartPrice1: Int
    val sparePartCode2: String
    val sparePartName2: String
    val sparePartQty2: Int
    val sparePartPrice2: Int

    println("-------------------------------------")
    println("|           BANGKA SPAREPART          |")
    println("-------------------------------------")
    print("Masukkan Nama Toko               : "); shopName = readLine()!!
    print("Masukkan Alamat Toko             : "); shippingAddress = readLine()!!
    print("Masukkan Nomor Telepon           : "); buyerPhone = readLine()!!
    print("Masukkan Kode Sparepart ke-1     : "); sparePartCode1 = readLine()!!
    print("Masukkan Nama Sparepart ke-1     : "); sparePartName1 = readLine()!!
    print("Masukkan Jumlah Sparepart ke-1   : "); sparePartQty1 = readLine()!!.toInt()
    print("Masukkan Harga Sparepart ke-1    : "); sparePartPrice1 = readLine()!!.toInt()
    print("Masukkan Kode Sparepart ke-2     : "); sparePartCode2 = readLine()!!
    print("Masukkan Nama Sparepart ke-2     : "); sparePartName2 = readLine()!!
    print("Masukkan Jumlah Sparepart ke-2   : "); sparePartQty2 = readLine()!!.toInt()
    print("Masukkan Harga Sparepart ke-2    : "); sparePartPrice2 = readLine()!!.toInt()

    val warehouseManager = WarehouseManager()

    // Print Title
    warehouseManager.print("NOTA PEMBELIAN")

    // Print Shop Details
    warehouseManager.print(
        shopName,
        shippingAddress,
        buyerPhone
    )

    // Print Item Details
    warehouseManager.print(
        sparePartCode1,
        sparePartName1,
        sparePartQty1,
        sparePartPrice1,
        sparePartCode2,
        sparePartName2,
        sparePartQty2,
        sparePartPrice2
    )

    // Print Total Items
    warehouseManager.print()
}