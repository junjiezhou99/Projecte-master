package mvm.daw.activities.animalshop;

interface Animable { //Interficie principal, engloba un conjunto de funcionalidad de objeto, la clase implementada esta obligado a usar todos los metodos declarados
    void goesToSleep(); //Metodo creado, no tiene body
    void whenToEat();
    double getNumber(Dog dog); //Metodo creado pasando como parametro de tipo Dog llamado dog
}
