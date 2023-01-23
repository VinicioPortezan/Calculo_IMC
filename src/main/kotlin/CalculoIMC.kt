import kotlin.math.pow

fun main() {
    println("Massa (Kg):")
    val massa = readln().toDouble()
    println("Altura (m):")
    val altura = readln().toDouble()
    val expoAltura = altura.pow(2.0)
    val iMC = calculoIMC(massa,expoAltura)
    val formatIMC = String.format("%.2f",iMC)
    println("IMC:$formatIMC")
    if (iMC<17){
        print("Muito abaixo do peso")
    }   else if (iMC<18.5){
        print("Abaixo do peso")
    }   else if (iMC<25){
        print("Peso ideal")
    }   else if (iMC<30){
        print("Acima do peso")
    }   else if (iMC<35){
        print("Obesidade grau I")
    }   else if (iMC<40){
        print("Obesidade grau II")
    }   else {
        print("Obesidade grau III")
    }
}
fun calculoIMC(massa:Double,expoAltura:Double):Double {
    return massa / expoAltura
}