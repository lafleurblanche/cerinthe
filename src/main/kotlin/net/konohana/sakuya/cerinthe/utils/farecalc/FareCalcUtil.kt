package net.konohana.sakuya.cerinthe.utils.farecalc

fun fareCalcUtil(
    adultMember: String,
    halfMember: String,
    childMember: String,
    fareAdultBase: String,
    fareHalfBase: String,
    fareChildBase: String,
    ticketType: String,
): Int {
    val intFareAdultBase = fareAdultBase.toInt()
    val intAdultMember = adultMember.toInt()
    val intFareHalfBase = fareHalfBase.toInt()
    val intHalfMember = halfMember.toInt()
    val intFareChildBase = fareChildBase.toInt()
    val intChildMember = childMember.toInt()
    var fareAdult = 0
    var fareHalf = 0
    var fareChild = 0
    if(intAdultMember != 0) {
       fareAdult = adultFareCalc(fareAdult = intFareAdultBase, adultMember = intAdultMember, ticketType = ticketType)
    }
    println(fareAdult)
    if(intHalfMember != 0) {
        fareHalf = halfFareCalc(fareHalf = intFareHalfBase, halfMember = intHalfMember, ticketType = ticketType)
    }
    println(fareHalf)
    if(intChildMember != 0) {
        fareChild = childFareCalc(fareChild = intFareChildBase, childMember = intChildMember, ticketType = ticketType)
    }
    println(childMember)
    return fareAdult + fareHalf + fareChild
}
