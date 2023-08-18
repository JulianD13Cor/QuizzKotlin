import java.text.DecimalFormat

fun main(args: Array<String>) {


    var arreglo = doubleArrayOf(3.5, 2.6, 1.5)


    var opc:Int=0
    while (opc!=6){
        println("""
            Opciones:
            1. Calificacion mas baja
            2. Calificacion mas alta
            3. Promedio de calificacion
            4. calificaciones menores a 3
            5. Ingresar varias notas
            6. Salir                 
        """.trimIndent())
        print("Opcion: ")
        opc= readLine()?.toInt() as Int

        if(opc==5){
            var entradaI:Double
            var suma=0.0
            var contador=0
            var promedio2:Double=0.0
            do {
                entradaI= readln().toDouble() as Double
                suma+=entradaI
                contador++
            }while (entradaI!=0.0)
            println("La suma de las notas es: $suma")
            promedio2=suma/contador
            println("El promedio de las notas es: $promedio2")
            var raiz:Double= Math.sqrt(suma)
            println("La raiz de la suma de las notas es : $raiz")
        }else{
            var promedio:Double=0.0
            var notas:Double=arreglo[0]
            for (i in 0 .. arreglo.size-1){
                if (opc==1){
                    if (arreglo[i]<notas){
                        notas=arreglo[i]
                    }
                    if (i==(arreglo.size-1)){
                        println(notas)
                    }
                }else if (opc==2){
                    if (arreglo[i]>notas){
                        notas=arreglo[i]
                    }
                    if (i==(arreglo.size-1)){
                        println(notas)
                    }
                }else if(opc==3){
                    promedio += arreglo[i]
                    if (i==(arreglo.size-1)){
                        println(promedio/arreglo.size)
                    }
                }else if(opc==4){
                    if(arreglo[i]<3){
                        println(arreglo[i])
                    }
                }
            }
        }

    }



}


