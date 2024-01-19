public class Main {
    private static int[] generateRandomCharacteristic() {
        java.util.Random random = new java.util.Random();
        int[] characteristic = new int[3];
        for (int i = 0; i < characteristic.length; i++) {
            characteristic[i] = random.nextInt(100) + 0;
        }
        return characteristic;
    }

    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Harry Potter",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Gryffindor("Hermione Granger",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Gryffindor("Ron Weasle",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Zachariah Smith",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Hufflepuff("Cedric Diggory",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Hufflepuff("Justin Finch-Fletchley",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Zhou Chang",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Ravenclaw("Padma Patil",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Ravenclaw("Marcus Belby",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
        };

        Slytherin[] slytherin = {
                new Slytherin("Draco Malfoy",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Slytherin("Graham Montague",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
                new Slytherin("Gregory Goyle",
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0],
                        generateRandomCharacteristic()[0]),
        };
        Service service = new Service();
        service.printGriffindor(gryffindor);
        service.printHufflepuff(hufflepuff);
        service.printRavenclaw(ravenclaw);
        service.printSlytherin(slytherin);
        //--------------Gryffindor--------------------------------
        System.out.println("-----------Gryffindor-----------------");
        System.out.println("сумма свойств Harry Potter = " +
                service.characteristicHarryPotter(gryffindor));
        System.out.println("сумма свойств Hermione Granger = " +
                service.characteristicHermioneGranger(gryffindor));
        service.comparisonOfCharacteristicsGryffindor(gryffindor);
        System.out.println();
        //--------------Hufflepuff--------------------------------
        System.out.println("-----------Hufflepuff-----------------");
        System.out.println("сумма свойств Zachariah Smith = " +
                service.characteristicZachariahSmith(hufflepuff));
        System.out.println("сумма свойств Cedric Diggory = " +
                service.characteristicCedricDiggory(hufflepuff));
        service.comparisonOfCharacteristicsHufflepuff(hufflepuff);
        System.out.println();
        //--------------Ravenclaw---------------------------------
        System.out.println("-----------Ravenclaw------------------");
        System.out.println("сумма свойств Zhou Chang = " +
                service.characteristicZhouChang(ravenclaw));
        System.out.println("сумма свойств Padma Patil = " +
                service.characteristicPadmaPatil(ravenclaw));
        service.comparisonOfCharacteristicsRavenclaw(ravenclaw);
        System.out.println();
        //--------------Slytherin---------------------------------
        System.out.println("-----------Slytherin------------------");
        System.out.println("сумма свойств Draco Malfoy = " +
                service.characteristicDracoMalfoy(slytherin));
        System.out.println("сумма свойств Graham Montague = " +
                service.characteristicGrahamMontague(slytherin));
        service.comparisonOfCharacteristicsSlytherin(slytherin);
        //--------------Hogwarts---------------------------------
        System.out.println("-----------Hogwarts------------------");
        System.out.println();
        service.bestStudentOnHogwarts(gryffindor[0], slytherin[0]);
    }

}
