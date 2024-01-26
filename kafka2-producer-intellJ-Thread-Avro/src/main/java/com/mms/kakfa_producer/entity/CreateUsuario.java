package com.mms.kakfa_producer.entity;

import java.util.Random;
import java.util.UUID;

public class CreateUsuario {


    // Voy a generar identificadores aleatorios para escribir en la cola.
    public static Usuario generateUsuario() {

        Usuario usuario = new Usuario();

        usuario.setNombre( generarNombreUsuario() );
        usuario.setApellido1( generarApellido() );
        usuario.setApellido2( generarApellido() );
        usuario.setEdad( generarEdad() );
        usuario.setDni( UUID.randomUUID().toString() );

        System.out.println("usuario: " + usuario);

        return usuario;
    }

    public static Integer generarEdad(){

        Random random = new Random();
        int numAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100 (inclusive)

        return Integer.valueOf(numAleatorio);

    }
    public static String generarNombreUsuario() {
        String[] nombresHombres = {
                "Juan", "Carlos", "Miguel", "Andrés", "David", "Fernando", "Ricardo", "Javier", "Alejandro", "Gabriel",
                "Luis", "Roberto", "José", "Francisco", "Raúl", "Manuel", "Alberto", "Jorge", "Adrián", "Ángel",
                "Sergio", "Antonio", "Pablo", "Francisco Javier", "Daniel", "Félix", "Rafael", "Emilio", "Héctor", "Diego",
                "José Antonio", "Tomás", "Pedro", "Ramon", "Alfonso", "Fernando", "Ismael", "Víctor", "Gonzalo", "Guillermo",
                "Eduardo", "Raul", "Mario", "Juan Carlos", "Enrique", "Mariano", "José Luis", "César", "Rafael", "Miguel Ángel",
                "Marcos", "José Manuel", "Vicente", "Arturo", "Federico", "Agustín", "Alex", "Jaime", "Ignacio", "Eugenio",
                "Joaquín", "Nicolás", "Fernando", "Gustavo", "Hugo", "Fabián", "Xavier", "Óscar", "Leo", "Mauricio",
                "Hernán", "Juan Pablo", "Julio", "Esteban", "Rogelio", "Sebastián", "Alejo", "Benjamín", "Camilo", "Dante",
                "Edgar", "Felipe", "Germán", "Israel", "Iván", "Jesús", "José María", "Kelvin", "Lorenzo", "Mateo",
                "Néstor", "Omar", "Pascual", "Quintín", "Renato", "Samuel", "Teodoro", "Ulises", "Víctor Hugo", "Wilfredo"
        };

        String[] nombresMujeres = {
                "María", "Laura", "Ana", "Sofía", "Isabel", "Claudia", "Patricia", "Luisa", "Diana", "Verónica",
                "Elena", "Carmen", "Silvia", "Rosa", "Teresa", "Beatriz", "Marta", "Victoria", "Natalia", "Susana",
                "Rocío", "Raquel", "Olga", "Miriam", "Mónica", "Julia", "Antonia", "Margarita", "Cristina", "Alicia",
                "Lorena", "Adriana", "Carolina", "Ruth", "Leticia", "Manuela", "Inés", "Marina", "Josefina", "Yolanda",
                "Ángela", "Begoña", "Gloria", "Dolores", "Pilar", "Esther", "Celia", "Juana", "Rosario", "Clara",
                "Concepción", "Mercedes", "Carmela", "Aurora", "Ángeles", "Francisca", "Eva", "Inmaculada", "Julieta", "Lourdes",
                "Eugenia", "Gemma", "Marisa", "Regina", "Sara", "Nerea", "Paula", "Valeria", "Claudia", "Lara",
                "Ainhoa", "Irati", "Leire", "Izaro", "Ane", "Maialen", "Miren", "Oihane", "Naia", "Uxue",
                "Aitana", "Alba", "Candela", "Luna", "Valentina", "Iria", "Abril", "Ariadna", "Alma", "Nora"
        };

        Random random = new Random();
        boolean esHombre = random.nextBoolean();

        return (esHombre) ? nombresHombres[random.nextInt(nombresHombres.length)] :
                nombresMujeres[random.nextInt(nombresMujeres.length)];
    }


    public static String generarApellido() {

        String[] apellidos = {
                "González", "Rodríguez", "Gómez", "Fernández", "López",
                "Díaz", "Martínez", "Pérez", "García", "Sánchez",
                "Romero", "Serrano", "Hernández", "Muñoz", "Jiménez",
                "Navarro", "Torres", "Luna", "Castro", "Ruiz",
                "Soto", "Lara", "Ortega", "Delgado", "Vargas",
                "Cruz", "Morales", "Iglesias", "Santos", "Álvarez",
                "Mendoza", "Molina", "Dominguez", "Ramos", "Blanco",
                "Guerrero", "Vega", "Ortiz", "Flores", "Santiago",
                "Cabrera", "Campos", "Vila", "Bravo", "Cortés",
                "Reyes", "Carmona", "Salazar", "Palacios", "Olivares",
                "Lorenzo", "Vicente", "Aguilar", "Castaño", "Calderón",
                "Peña", "León", "Bermúdez", "Velasco", "Rey",
                "Collado", "Rojas", "Herrero", "Fuentes", "Crespo",
                "Arias", "Benítez", "Valle", "Aguilera", "Santana",
                "Pascual", "Carrasco", "Valenzuela", "Gallego", "Mora",
                "Pizarro", "Barrios", "Guillén", "Peñalver", "Soria",
                "Cuenca", "Guirado", "Sáenz", "Molero", "Villar",
                "Guitiérrez", "Cruzado", "Sánchez-Cruz", "De la Fuente", "Salcedo",
                "Reina", "Clemente", "Hidalgo", "Giménez", "Torres"
        };


        Random random = new Random();
        int numAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100 (inclusive)

        return apellidos[numAleatorio];
    }
    public static String generarCalle(){

        String[] nombresCalles = {
                "C\\ Alameda, 123", "C\\ Azahar, 45", "C\\ Bosque, 78", "C\\ Canela, 56", "C\\ Cerezas, 34",
                "C\\ Dalias, 89", "C\\ Drago, 12", "C\\ Encina, 67", "C\\ Flor, 90", "C\\ Frambuesa, 23",
                "C\\ Glicina, 54", "C\\ Granado, 76", "C\\ Hiedra, 32", "C\\ Iris, 87", "C\\ Jacaranda, 21",
                "C\\ Jazmín, 65", "C\\ Laurel, 43", "C\\ Limón, 98", "C\\ Magnolia, 10", "C\\ Manzano, 55",
                "C\\ Mora, 78", "C\\ Naranjo, 34", "C\\ Nogal, 67", "C\\ Olivo, 89", "C\\ Orquídea, 12",
                "C\\ Peral, 76", "C\\ Petunia, 23", "C\\ Piña, 54", "C\\ Plátano, 87", "C\\ Quebracho, 21",
                "C\\ Quinoa, 65", "C\\ Romero, 43", "C\\ Sandía, 98", "C\\ Sauce, 10", "C\\ Tilo, 55",
                "C\\ Tulipán, 78", "C\\ Uva, 34", "C\\ Verbena, 67", "C\\ Violeta, 90", "C\\ Yuca, 23",
                "C\\ Yucca, 54", "C\\ Zapote, 76", "C\\ Zen, 32", "C\\ Almendro, 87", "C\\ Amapola, 21",
                "C\\ Avellano, 65", "C\\ Begonia, 43", "C\\ Bellota, 98", "C\\ Caléndula, 10", "C\\ Cedro, 55",
                "C\\ Ciprés, 78", "C\\ Ciruelo, 34", "C\\ Clavel, 67", "C\\ Dátil, 90", "C\\ Durazno, 23",
                "C\\ Eneldo, 54", "C\\ Endrina, 76", "C\\ Espino, 32", "C\\ Eucalipto, 87", "C\\ Euforbia, 21",
                "C\\ Fucsia, 65", "C\\ Fuego, 43", "C\\ Felpa, 98", "C\\ Girasol, 10", "C\\ Granja, 55",
                "C\\ Guayaba, 78", "C\\ Higo, 34", "C\\ Heliotropo, 67", "C\\ Hoja, 90", "C\\ Hortensia, 23",
                "C\\ Iris, 54", "C\\ Jacinto, 76", "C\\ Jardín, 32", "C\\ Kaki, 87", "C\\ Koala, 21",
                "C\\ Lantana, 65", "C\\ Lavanda, 43", "C\\ Lila, 98", "C\\ Mandarina, 10", "C\\ Mango, 55",
                "C\\ Mimosa, 78", "C\\ Néctar, 34", "C\\ Nuez, 67", "C\\ Ombú, 90", "C\\ Orégano, 23",
                "C\\ Orquídea, 54", "C\\ Papiro, 76", "C\\ Parra, 32", "C\\ Peonia, 87", "C\\ Pino, 21",
                "C\\ Piraña, 65", "C\\ Plumeria, 43", "C\\ Quinoa, 98", "C\\ Roble, 10", "C\\ Rosa, 55",
                "C\\ Sábila, 78", "C\\ Saúco, 34", "C\\ Seda, 67", "C\\ Secoya, 90", "C\\ Sol, 23"
        };

        Random random = new Random();
        int numAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100 (inclusive)

        return nombresCalles[numAleatorio];
    }


}
