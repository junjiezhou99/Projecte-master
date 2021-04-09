module cat.mvm.modular.entities { //modulo nombre
    requires java.base;
    requires cat.mvm.modular.contracts; //Que package requiere para funcionar
    exports cat.mvm.modular.entities; //Este package són accesibles para todos los modulos
    //exports cat.mvm.modular.entities to (nombre full qualified clasee name del package destino)
}