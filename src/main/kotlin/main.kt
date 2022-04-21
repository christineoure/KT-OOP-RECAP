fun main() {
    var box1 = Box1()
    var box2 = Box1()
    var box3 = Box1()

    box1.height = 7
    println("Length: ${box2.length}")
    println("Width: ${box2.width}")
    println("Height: ${box2.height}")

    box1.open()
    box1.fillcontents()

    var human = Human("Aidan", 25, 72)
    println(human.eat(2))
    println(human.weight)
    human.speak("Luo")
    human.speak("French")
    human.birthday()
    println(human.age)
    var humanbeing = Human2("Ethel",43,96)
    humanbeing.eating(3)
    humanbeing.talk("Xhosa")
    humanbeing.age()
    println(humanbeing.age)
    var user = User("Neema", "Hawi", "neemahawi@gmail.com", "0721042022", "feetpro10")
    println(user.email)
    println(user.phoneNumber)
    var myaccount = currentAccount("KCBunderscore","388758",4000000.00)
    myaccount.deposit(500000.00)
    myaccount.withdraw(200000.00)
    println(myaccount.details())

    var savings = savingsAccount("mikoro","658975982",30000.00,2,)
    savings.withdraw(5000.0)
    savings.withdraw(5000.0)
    savings.withdraw(5000.0)
    println(savings.balance)


}

class Box1 {
    var length: Int = 20
    var width: Int = 10
    var height: Int = 5

    fun fillcontents() {
        println("Box is filled")
    }

    fun open() {
        println("Box opened")
    }
}
//creating a class human

class Human(var name: String, var age: Int, var weight: Int) {
    fun eat(foodweight: Int) {
        weight += foodweight
        weight++
        println("I am eating ${foodweight} kgs of food")
    }
    fun speak(speech: String){
        println("I can speak ${speech}")
    }
    fun birthday(){
        println(age++)
    }
}
class Human2(var name: String, var age: Int, var weight: Int){
    fun eating(weightOfFood: Int){
        println("I ate ${weightOfFood} kilos")
    }
    fun talk(speaking: String){
        println("She speaks ${speaking}")
    }
    fun age(){
        println(age--)
    }
}

class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){

}
open class currentAccount(var accountName:String, var accountNumber:String, var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
   open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by teller one")
    }
}
class savingsAccount(accountName:String, accountNumber:String,  balance:Double, var withdrawals: Int):currentAccount(accountName, accountNumber,  balance){
    override fun withdraw(amount: Double) {
        super.withdraw(amount)
        if (withdrawals <4){
            withdrawals ++
            println("Successful withdrawal!")
        }
      else{
          println("Withdrawal denied")
        }
    }
}
