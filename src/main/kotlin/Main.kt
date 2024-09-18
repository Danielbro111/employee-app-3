package ie.setu

import kotlin.math.round

val firstName = "Joe"
val surname = "Soap"
val gender = 'm'
val employeeID = 6143
val grossSalary = 67543.21
val payePercentage = 38.5
val prsiPercentage = 5.2
val annualBonus = 1450.50
val cycleToWorkMonthlyDeduction = 54.33

fun main(args: Array<String>){

    var input : Int

    do {
        input = menu()
        when(input) {
            1 -> println("Monthly Salary: ${getMonthlySalary()}")
            2 -> println("Monthly PRSI: ${getMonthlyPRSI()}")
            3 ->println("Monthly PAYE: ${getMonthlyPAYE()}")
            4 -> println("Monthly Gross Pay: ${getGrossMonthlyPay()}")
            5 -> println("Monthly Total Deductions: ${getTotalMonthlyDeductions()}")
            6 -> println("Monthly Net Pay: ${getNetMonthlyPay()}")
            7 -> println(getPayslip())
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
}
fun getPayslip(){

    val monthlySalary = (grossSalary/12)
    val monthlyPrsi = monthlySalary * (prsiPercentage / 100)
    val monthlyPaye = monthlySalary * (payePercentage / 100)
    val grossPay = (monthlySalary + (annualBonus/12))
    val totalDeductions = (monthlyPrsi + monthlyPrsi + cycleToWorkMonthlyDeduction)

    println ("""
    |_______________________________________________________________________
    |                          Monthly Payslip                              
    |_______________________________________________________________________                                                                 
    |    Employee Name:  ${getFullName()}(${gender.uppercase()})         Employee ID: $employeeID                                                                       
    |_______________________________________________________________________                                                                 
    |    PAYMENT DETAILS                        DEDUCTION DETAILS  
    |_______________________________________________________________________
    |    Salary: ${roundTwoDecimals(monthlySalary)}                         PAYE: ${roundTwoDecimals(monthlyPaye)}
    |    Bonus:  ${roundTwoDecimals((annualBonus / 12))}                         PRSI: ${roundTwoDecimals(monthlyPrsi)}
    |                                           Cycle To Work: $cycleToWorkMonthlyDeduction
    |_______________________________________________________________________
    |    Gross:  ${roundTwoDecimals(grossPay)}                        Total Deductions: ${roundTwoDecimals(totalDeductions)}
    |_______________________________________________________________________
    |                           NET PAY:${roundTwoDecimals(grossPay - totalDeductions)}
    |_______________________________________________________________________""".trimMargin("|"))
}

fun getFullName() = when (gender){
    'm', 'M' -> "Mr. $firstName $surname"
    'f', 'F' -> "Ms. $firstName $surname"
    else -> "$firstName $surname"
}

fun getMonthlySalary() {
    val monthlySalary = (grossSalary/12)
}

fun getMonthlyPRSI() {
    val monthlySalary = (grossSalary/12)
    val monthlyPrsi = monthlySalary * (prsiPercentage / 100)
}

fun getMonthlyPAYE() {
    val monthlySalary = (grossSalary/12)
    val monthlyPaye = monthlySalary * (payePercentage / 100)
}

fun getGrossMonthlyPay() {
    val monthlySalary = (grossSalary/12)
    val grossPay = (monthlySalary + (annualBonus/12))
}

fun getNetMonthlyPay() {
    val monthlySalary = (grossSalary/12)

}

fun getTotalMonthlyDeductions() {
    1
}



fun roundTwoDecimals(number: Double) = round(number * 100) / 100

fun menu() : Int {
    print("""
         Employee Menu for ${getFullName()}
           1. Monthly Salary
           2. Monthly PRSI
           3. Monthly PAYE
           4. Monthly Gross Pay
           5. Monthly Total Deductions
           6. Monthly Net Pay
           7. Full Payslip
          -1. Exit
         Enter Option : """)
    return readln().toInt()
}