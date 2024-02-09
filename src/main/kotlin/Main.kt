package org.example
import Vehicle
import Vehicle.*;
import java.awt.Color;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    var pessoa =  Person( "ferdinando", 19  );
    var  clothes =  PersonClothers(
                                         listOf<Clothe>(
                                                 Clothe("t-shirt", 'M', null),
                                                 Clothe(name  = "blue jeans", size = 'G', color= Color.blue )
                                         ),
                           1
   );


    // using anonymous class to implements AirPlaine 'Fly()' method
    var plane = ( object : AirPlaine{
            override fun fly() {
                 println(" Airplane flying.....")
            }
    })
    plane.fly()

    // using lambda expression to subscribe the abstract method 'goToBacking'
    var car = Vehicle.Car {
            println(" Car going to back.....")
    }
    car.goToBacking();


    // overriding two methods of super interface Vehicles
    var genericVehicle = ( object: Vehicle {
            override fun accelerate(   acceleration :Int  ) :Unit {
                   println(" Airplane flying.....")
            }

            final override fun speed(   speed :Int  ) :String {  //  prohibit re-overriding
                   println(" Airplane flying.....")
                   return  speed.toString()
            }
    })
    genericVehicle.accelerate( 12);
    genericVehicle.speed(27)


     //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello,  "+pessoa.getName(  null ) + "!    \n")

    println(" content:  ${clothes.clothes.get(0).name} ");

    println(" getCrossProduct:  ${getCrossProduct( X=2.4,  Y = 34.3, X2 = 2.3, Y2 =3.1  ) }  ")


    for (  i in 1..5) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
             println("i = $i");
    }

    println("\n ============== varargs ==================== \n");

    vargars();


    println("\n ============== Generics ==================== \n");

    var myStack  = MutableStack<String>(  "Empoleon", "Pinsir", "Infernape", "Torterra", "Drapion",  "Murkrow", "Honchkrow", "Excadrill", "Gabite" );

    myStack.push("Togetic")
    println( myStack )
    println( " last element: {$myStack.peek()} " )

    for( i in 1..myStack.getSize() ){
         println( " removing element: ${myStack.pop()} ");
    }

    val mutablesByFun = mutableStackOf<String>(   "Eevee", "Flareon", "Vaporeon", "Umbreon", "Joteon",  "Glaceon", "Leafeon"   );
    println( mutablesByFun );

    // OU TBM:
    val ages: MutableList<Int> = mutableListOf(23, 15, 45, 17, 65, 18, 19, 20);
    val agesCopy :List<Int> = ages
    ages.add(78)
    ages.add(101)
    println(  "New values addited to 'ages'. See now the values of 'agesCopy' below: ");

    agesCopy.forEach {  item -> print("$item, "); }
    // agesCopy.add()  is forbbiden! The List type é unmutable

    println("\n ============== Flow control ==================== \n");

    println("When Statement")
    cases( obj = 23L )

    println("When Expression \n ${whenAssign(  Example()  )}");


    println("\n ============== Iterating ==================== \n");

    val pokemons = HashMap<String, PokeTypes>();
    pokemons.put("Blastoise", PokeTypes.WATER )
    pokemons.put("Ursaring",  PokeTypes.NORMAL )
    pokemons.put("Salamence",  PokeTypes.DRAGON )
    pokemons.put("Ekans",  PokeTypes.POISON )

    var pokes  = Pokemons( pokemons )

    for (poke  in  pokes.getPokes() ){
            println(" pokemon name is  ${ poke.toPair().first}  of type  ${ poke.toPair().second} "  )
    }
    //rangesWithIntChar();


    println("\n ============== Collections ==================== \n");
    useColletions();
}





