emmanuel carter
class BankCharges {

    fun main() {
        val baseFee = 10
        var checkFee = 0.0

        print("Enter the number of checks written this month: ")
        val checks = readLine()?.toDoubleOrNull()


        if (checks != null) {
            if(checks < 20) {
                checkFee = 0.10 * checks
            } else
                if(checks >20 && checks <= 39) {
                    checkFee = 0.08 * checks
                } else
                    if(checks > 40 && checks <= 59) {
                        checkFee = 0.06 * checks
                    } else
                        if(checks >= 60) {
                            checkFee = 0.04 * checks
                        }
        }


        val totalFee = baseFee + checkFee

        println("The bank's service fees for the month are: $$totalFee")
    }
}
