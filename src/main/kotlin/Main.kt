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
    println("Payslip Printer")
    println(getFullName())
    printPayslip()
}

fun printPayslip(){

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

fun roundTwoDecimals(number: Double) = round(number * 100) / 100
