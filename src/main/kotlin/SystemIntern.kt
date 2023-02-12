class SystemIntern {

     fun toEnter(employeeAdmin: EmployeeAdmin, password: Int){
        if (employeeAdmin.authenticationEmployee(password) != employeeAdmin.authenticationEmployee(password)){
            println("Authentication failed")
        }else{
            println("Welcome to Bytebank")
        }
     }
}