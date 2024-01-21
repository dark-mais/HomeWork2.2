public class Service {
    public void printGriffindor(Gryffindor[] gryffindor) {
        System.out.println("Gryffindor:");
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            System.out.println(gryffindor1.getFullName() +
                    ":\nсила магии - " + gryffindor1.getThePowerOfMagic() +
                    ":\nтрансгрессия - " + gryffindor1.getTransgression() +
                    ":\nблагородство - " + gryffindor1.getNobility() +
                    ";\nчесть - " + gryffindor1.getHonor() +
                    ";\nхрабрость " + gryffindor1.getCourage() + ";\n");
        }
    }
    public void printHufflepuff(Hufflepuff[] hufflepuff) {
        System.out.println("--------------------------------");
        System.out.println("Hufflepuff:");
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff hufflepuff1 = hufflepuff[i];
            System.out.println(hufflepuff1.getFullName() +
                    ":\nсила магии - " + hufflepuff1.getThePowerOfMagic() +
                    ":\nтрансгрессия - " + hufflepuff1.getTransgression() +
                    ":\nтрудолюбие - " + hufflepuff1.getHardWork() +
                    ";\nверность - " + hufflepuff1.getLoyalty() +
                    ";\nчестность " + hufflepuff1.getHonesty() + ";\n");
        }
    }
    public void printRavenclaw(Ravenclaw[] ravenclaw) {
        System.out.println("--------------------------------");
        System.out.println("Ravenclaw:");
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaw1 = ravenclaw[i];
            System.out.println(ravenclaw1.getFullName() +
                    ":\nсила магии - " + ravenclaw1.getThePowerOfMagic() +
                    ":\nтрансгрессия - " + ravenclaw1.getTransgression() +
                    ":\nум - " + ravenclaw1.getMind() +
                    ";\nмудрость - " + ravenclaw1.getWisdom() +
                    ";\nостроумие " + ravenclaw1.getWit() +
                    ";\nтворчество" + ravenclaw1.getCreation() + ";\n");
        }
    }
    public void printSlytherin(Slytherin[] slytherin) {
        System.out.println("--------------------------------");
        System.out.println("Slytherin:");
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherin1 = slytherin[i];
            System.out.println(slytherin1.getFullName() +
                    ":\nсила магии - " + slytherin1.getThePowerOfMagic() +
                    ":\nтрансгрессия - " + slytherin1.getTransgression() +
                    ":\nхитрость - " + slytherin1.getCunning() +
                    ";\nрешительность - " + slytherin1.getDetermination() +
                    ";\nамбициозность " + slytherin1.getAmbition() +
                    ";\nнаходчивость - " + slytherin1.getResourcefulness() +
                    ";\nжажда власти - " + slytherin1.getThirstForPower() + ";\n");
        }

    }
    //------------Gryffindor---------------------------------------------------
    public int characteristicHarryPotter(Gryffindor[] gryffindor) {
        int sum = 0;
        Gryffindor gryffindor1 = gryffindor[0];
        return sum += gryffindor1.getCourage() +
                gryffindor1.getHonor() +
                gryffindor1.getNobility();
    }
    public int characteristicHermioneGranger(Gryffindor[] gryffindor) {
        int sum = 0;
        Gryffindor gryffindor1 = gryffindor[1];
        return sum += gryffindor1.getCourage() +
                gryffindor1.getHonor() +
                gryffindor1.getNobility();
    }
    public void comparisonOfCharacteristicsGryffindor(Gryffindor[] gryffindor) {
        if (characteristicHarryPotter(gryffindor) > characteristicHermioneGranger(gryffindor)) {
            System.out.println("Harry Potter лучше чем Hermione Granger");
        } else {
            System.out.println("Hermione Granger лучше чем Harry Potter");
        }
    }
    //--------------Hufflepuff-------------------------------------------------
    public int characteristicZachariahSmith(Hufflepuff[] hufflepuff) {
        int sum = 0;
        Hufflepuff hufflepuff1 = hufflepuff[0];
        return sum += hufflepuff1.getHardWork() +
                hufflepuff1.getLoyalty() +
                hufflepuff1.getHonesty();
    }
    public int characteristicCedricDiggory(Hufflepuff[] hufflepuff) {
        int sum = 0;
        Hufflepuff hufflepuff1 = hufflepuff[1];
        return sum += hufflepuff1.getHardWork() +
                hufflepuff1.getLoyalty() +
                hufflepuff1.getHonesty();
    }
    public void comparisonOfCharacteristicsHufflepuff(Hufflepuff[] hufflepuff) {
        if (characteristicZachariahSmith(hufflepuff) > characteristicCedricDiggory(hufflepuff)) {
            System.out.println("Zachariah Smith лучше чем Cedric Diggory");
        } else {
            System.out.println("Cedric Diggory лучше чем Zachariah Smith");
        }
    }
    //--------------Ravenclaw-------------------------------------------------
    public int characteristicZhouChang(Ravenclaw[] ravenclaw) {
        int sum = 0;
        Ravenclaw ravenclaw1 = ravenclaw[0];
        return sum += ravenclaw1.getCreation() +
                ravenclaw1.getWit() +
                ravenclaw1.getMind() +
                ravenclaw1.getWisdom();
    }
    public int characteristicPadmaPatil(Ravenclaw[] ravenclaw) {
        int sum = 0;
        Ravenclaw ravenclaw1 = ravenclaw[1];
        return sum += ravenclaw1.getCreation() +
                ravenclaw1.getWit() +
                ravenclaw1.getMind() +
                ravenclaw1.getWisdom();
    }
    public void comparisonOfCharacteristicsRavenclaw(Ravenclaw[] ravenclaw) {
        if (characteristicZhouChang(ravenclaw) > characteristicPadmaPatil(ravenclaw)) {
            System.out.println("Zhou Chang лучше чем Padma Patil");
        } else {
            System.out.println("Padma Patil лучше чем Zhou Chang");
        }
    }
    //--------------Slytherin-------------------------------------------------

    public int characteristicDracoMalfoy(Slytherin[] slytherin) {
        int sum = 0;
        Slytherin slytherin1 = slytherin[0];
        return sum += slytherin1.getAmbition() +
                slytherin1.getCunning() +
                slytherin1.getDetermination() +
                slytherin1.getResourcefulness() +
                slytherin1.getThirstForPower();
    }
    public int characteristicGrahamMontague(Slytherin[] slytherin) {
        int sum = 0;
        Slytherin slytherin1 = slytherin[1];
        return sum += slytherin1.getAmbition() +
                slytherin1.getCunning() +
                slytherin1.getDetermination() +
                slytherin1.getResourcefulness() +
                slytherin1.getThirstForPower();
    }
    public void comparisonOfCharacteristicsSlytherin(Slytherin[] slytherin) {
        if (characteristicDracoMalfoy(slytherin) > characteristicGrahamMontague(slytherin)) {
            System.out.println("Draco Malfoy лучше чем Graham Montague");
        } else {
            System.out.println("Graham Montague лучше чем Draco Malfoy");
        }
    }

    public void bestStudentOnHogwarts(Gryffindor gryffindor, Slytherin slytherin){
        int generalPropertiesFisrstStudent, generalPropertiesSecondStudent;
        generalPropertiesFisrstStudent = gryffindor.getThePowerOfMagic() + gryffindor.getTransgression();
        generalPropertiesSecondStudent = slytherin.getThePowerOfMagic() + slytherin.getTransgression();

        if (generalPropertiesFisrstStudent > generalPropertiesSecondStudent){
            System.out.println("По совокупности свойств 'сила магии' и 'расстоянию трансгрессии' " +
                    gryffindor.getFullName() + " сильнее, чем " + slytherin.getFullName() + ": " +
                    generalPropertiesFisrstStudent + " / " + generalPropertiesSecondStudent + " \n");
        } else if (generalPropertiesFisrstStudent < generalPropertiesSecondStudent) {
            System.out.println("По совокупности свойств 'сила магии' и 'расстоянию трансгрессии' " +
                    slytherin.getFullName() + " сильнее, чем " + gryffindor.getFullName() + ": " +
                    generalPropertiesSecondStudent + " / " + generalPropertiesFisrstStudent + " \n");
        } else System.out.println("По совокупности свойств 'сила магии' и 'расстоянию трансгрессии' " +
                slytherin.getFullName() + " и " + gryffindor.getFullName() + " равны: " +
                generalPropertiesSecondStudent + " / " + generalPropertiesFisrstStudent + " \n");
    }

}
