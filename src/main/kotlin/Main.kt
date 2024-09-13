package ie.setu.main.kt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    PayslipPrinter ()


}
fun PayslipPrinter () {

    println("------------------------------------------------------------------------------------------------------------------------------------------")
    println("|                                                     Monthly Payslip                                                                    |")
    println("|----------------------------------------------------------------------------------------------------------------------------------------|")
    println("|                                                                                                                                        |")
    println("|   EMPLOYEE NAME: " + fName+sName+ "("+ Gender +  ")"      +             "EMPLOYEE ID: "+EmployeeID+                                     "|")
    println("|                                                                                                                                         |")
    println("|-----------------------------------------------------------------------------------------------------------------------------------------|")
    println("|                                                                                                                                         |")
    println("|   PAYMENT DETAILS                                                        DEDUCTION DETAILS                                              |")
    println("|                                                                                                                                         |")
    println("| ----------------------------------------------------------------------------------------------------------------------------------------|")
    println("|   SALARY: "+ mSal + "                                                    PAYE: " + PAYE +"                                              |")
    println("|   BONUS: " + AnnualB +"                                                  PRSI: " + PRSI +"                                              |")
    println("|                                                                          Cycle To Work: "+ Cycle+"                                      |")
    println("|-----------------------------------------------------------------------------------------------------------------------------------------|")
    println("|   GROSS: "+ grossSal + "                                      Total Deductions: " + tDeductions+ "                                      |")
    println("|-----------------------------------------------------------------------------------------------------------------------------------------|")
    println("|                                     NET PAY: "+( grossSal-tDeductions) +"                                                                 |")
    println("|                                                                                                                                         |")
    println("|-----------------------------------------------------------------------------------------------------------------------------------------|")



}
val fName = "JOE"
val sName = "SOAP"
 val Gender = 'M'
 val EmployeeID = 1234
 val grossSal  = 67_543.21
val mSal = grossSal/12
 val PAYE = mSal*0.385
 val PRSI = mSal*0.52
 val AnnualB = 1450.50
 val Cycle = 54.33
val tDeductions = PAYE+PRSI+Cycle
