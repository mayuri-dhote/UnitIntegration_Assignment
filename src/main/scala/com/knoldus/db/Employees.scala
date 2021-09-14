package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Mayuri","Dhote",23,12000,"Intern","Knoldus","mayuri.dhote@knoldus.com")
  val emp1 : Employee = Employee("Purva","Chitambare",23,12000,"Intern","Knoldus","purva.chitambare@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}